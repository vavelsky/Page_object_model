package test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.PitchedCreate_DatabasePage;
import pages.HomePage;
import pages.LoginPage;
import pages.PlaylistDetailPage;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

public class TestPlaylistDelete {

    WebDriver $;
    LoginPage objLoginPage;
    HomePage objHomePage;
    PitchedCreate_DatabasePage objPitchedCreateDatabasePage;
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
    public void test_playlist_delete(){

        objLoginPage = new LoginPage($);
        objHomePage = new HomePage($);
        objPitchedCreateDatabasePage = new PitchedCreate_DatabasePage($);
        objPlaylistDetailPage = new PlaylistDetailPage($);

        objLoginPage.loginToCms("super@admin.pl", "haslo");
        Assert.assertTrue(objHomePage.getHomePageName().toLowerCase().contains("pitched.create"));
        objHomePage.findPlaylist("PlaylistK");
        objHomePage.clickSearch();
        Assert.assertTrue(objPitchedCreateDatabasePage.getPlaylistNameOnList().toLowerCase().contains("playlistk"));
        objPitchedCreateDatabasePage.openPlaylist();
        objPlaylistDetailPage.clickDelete();
        objPlaylistDetailPage.clickDeleteOnPopup();
        Assert.assertTrue(objPitchedCreateDatabasePage.getNotification().toLowerCase().contains("playlist has been deleted!"));
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
