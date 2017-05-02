package test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.ImportPage;
import pages.LoginPage;
import pages.PlaylistPage;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

public class Test2 {

    WebDriver $;
    HomePage objHomePage;
    LoginPage objLogin;
    ImportPage objImport;
    PlaylistPage objPlaylist;

    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp(){
        $ = new ChromeDriver();
        $.get("https://develop-web-cms-pitched.miquido.net/");
        $.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        $.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @Test
    public void test_import() {

        objLogin = new LoginPage($);
        objHomePage = new HomePage($);
        objImport = new ImportPage($);
        objPlaylist = new PlaylistPage($);

        objLogin.loginToCms("super@admin.pl", "haslo");
        objHomePage.clickImport();
        Assert.assertTrue(objImport.getImportPageName().toLowerCase().contains("import"));
        objImport.setSpotifyInputField("spotify:user:miquidoqa3:playlist:6kj9xb3BQTUTwieCUKL1tm");
        objImport.clickBrands();
        objImport.selectDigsterFmPlaylistBrand();
        objImport.clickImport();
        Assert.assertTrue(objImport.getNotification().toLowerCase().contains("playlist has beed imported!"));

        Assert.assertTrue(objPlaylist.getPlaylistPageTitle().toLowerCase().contains("playlistk"));
    }

    @After
    public void tearDown(){
        $.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }
}
