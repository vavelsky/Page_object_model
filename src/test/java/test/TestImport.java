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

public class TestImport {

    WebDriver $;
    HomePage objHomePage;
    LoginPage objLogin;
    ImportPage objImport;

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
        objLogin.loginToCms("super@admin.pl", "haslo");
        objHomePage = new HomePage($);
        objHomePage.clickImport();
        objImport = new ImportPage($);
        Assert.assertTrue(objImport.getImportPageName().toLowerCase().contains("import"));
        objImport.setSpotifyInputField("spotify:user:miquidoqa3:playlist:6kj9xb3BQTUTwieCUKL1tm");
        objImport.clickBrands();
        objImport.selectPlaylistBrand();
        objImport.clickImport();
        objImport.waitNotification();
    }

    @After
    public void tearDown(){
        $.quit();
    }
}
