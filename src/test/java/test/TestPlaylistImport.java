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

public class TestPlaylistImport {

    WebDriver $;
    HomePage objHomePage;
    LoginPage objLoginPage;
    ImportPage objImportPage;
    PlaylistPage objPlaylistPage;

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

        objLoginPage = new LoginPage($);
        objHomePage = new HomePage($);
        objImportPage = new ImportPage($);
        objPlaylistPage = new PlaylistPage($);

        objLoginPage.loginToCms("super@admin.pl", "haslo");
        objHomePage.clickImport();
        Assert.assertTrue(objImportPage.getImportPageName().toLowerCase().contains("import"));
        objImportPage.setSpotifyInputField("spotify:user:miquidoqa3:playlist:6kj9xb3BQTUTwieCUKL1tm");
        objImportPage.clickBrands();
        objImportPage.selectDigsterFmPlaylistBrand();
        objImportPage.clickImport();
        Assert.assertTrue(objImportPage.getNotification().toLowerCase().contains("playlist has been imported!"));

        Assert.assertTrue(objPlaylistPage.getPlaylistPageTitle().toLowerCase().contains("playlistk"));
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
