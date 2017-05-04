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

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.fail;

public class TestPlaylistImportFailed {

    WebDriver $;
    HomePage objHomePage;
    LoginPage objLoginPage;
    ImportPage objImportPage;

    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        $ = new ChromeDriver();
        $.get("https://develop-web-cms-pitched.miquido.net/");
        $.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        $.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @Test
    public void test_import_playlist_is_exists() throws Exception {

        objLoginPage = new LoginPage($);
        objHomePage = new HomePage($);
        objImportPage = new ImportPage($);

        objLoginPage.loginToCms("super@admin.pl", "haslo");

        objHomePage.clickImport();

        Assert.assertTrue(objImportPage.getImportPageName().toLowerCase().contains("import"));
        objImportPage.setSpotifyInputField("spotify:user:miquidoqa3:playlist:6kj9xb3BQTUTwieCUKL1tm");
        objImportPage.clickBrands();
        objImportPage.selectDigsterFmPlaylistBrand();
        objImportPage.clickImport();
        Assert.assertTrue(objImportPage.getNotification().toLowerCase().contains("an error has occured, playlist has not been imported: this spotify playlist is already imported as playlistk"));

    }

    @Test
    public void test_import_invalid_oath_credentials() throws Exception {

        objLoginPage = new LoginPage($);
        objHomePage = new HomePage($);
        objImportPage = new ImportPage($);

        objLoginPage.loginToCms("super@admin.pl", "haslo");

        objHomePage.clickImport();

        Assert.assertTrue(objImportPage.getImportPageName().toLowerCase().contains("import"));
        objImportPage.setSpotifyInputField("spotify:user:miquidoqa3:playlist:6kj9xb3BQTUTwieCUKL1tm");
        objImportPage.clickBrands();
        objImportPage.selectPlaylistBrandWithoutToken();
        objImportPage.clickImport();

        Assert.assertTrue(objImportPage.getNotification().toLowerCase().contains("an error has occured, playlist has not been imported: invalid oauth credentails"));
    }

    @After
    public void tearDown() throws Exception {
        $.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }
}
