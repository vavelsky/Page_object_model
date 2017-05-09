package test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.PitchedCreate_ImportPage;
import pages.LoginPage;
import pages.PlaylistDetailPage;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

public class TestPlaylistImport {

    WebDriver $;
    HomePage objHomePage;
    LoginPage objLoginPage;
    PitchedCreate_ImportPage objPitchedCreateImportPage;
    PlaylistDetailPage objPlaylistDetailPage;

    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp(){
        $ = new ChromeDriver();
        $.get("https://develop-web-cms-pitched.miquido.net/");
        $.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        $.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @Test
    public void test_playlist_import() {

        objLoginPage = new LoginPage($);
        objHomePage = new HomePage($);
        objPitchedCreateImportPage = new PitchedCreate_ImportPage($);
        objPlaylistDetailPage = new PlaylistDetailPage($);

        objLoginPage.loginToCms("super@admin.pl", "haslo");
        objHomePage.clickImport();
        Assert.assertTrue(objPitchedCreateImportPage.getImportPageName().toLowerCase().contains("import"));
        objPitchedCreateImportPage.set_SpotifyInputField("spotify:user:miquidoqa3:playlist:6kj9xb3BQTUTwieCUKL1tm");
        objPitchedCreateImportPage.clickBrands();

        objPitchedCreateImportPage.select_PlaylistBrand("Digster FM");
        objPitchedCreateImportPage.clickImport();

        Assert.assertTrue(objPitchedCreateImportPage.getNotification().toLowerCase().contains("playlist has been imported!"));

        Assert.assertTrue(objPlaylistDetailPage.getPlaylistPageTitle().toLowerCase().contains("playlistk"));
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
