package test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.DatabasePage;
import pages.HomePage;
import pages.LoginPage;
import pages.PlaylistPage;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

public class TestPlaylistDelete {

    WebDriver $;
    LoginPage objLoginPage;
    HomePage objHomePage;
    DatabasePage objDatabasePage;
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
    public void test_playlist_delete(){

        objLoginPage = new LoginPage($);
        objHomePage = new HomePage($);
        objDatabasePage = new DatabasePage($);
        objPlaylistPage = new PlaylistPage($);

        objLoginPage.loginToCms("super@admin.pl", "haslo");
        Assert.assertTrue(objHomePage.getHomePageName().toLowerCase().contains("pitched.create"));
        objHomePage.findPlaylist("PlaylistK");
        objHomePage.clickSearch();
        Assert.assertTrue(objDatabasePage.getPlaylistNameOnList().toLowerCase().contains("playlistk"));
        objDatabasePage.openPlaylist();
        objPlaylistPage.clickDelete();
        objPlaylistPage.clickDeleteOnPopup();
        Assert.assertTrue(objDatabasePage.getNotification().toLowerCase().contains("playlist has been deleted!"));
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
