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

public class TestPlaylistSyndicate {

    WebDriver $;
    PitchedCreate_DatabasePage objPitchedCreateDatabasePage;
    HomePage objHomePage;
    LoginPage objLoginPage;
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
    public void test_playlist_syndicate() throws Exception {

        objPitchedCreateDatabasePage = new PitchedCreate_DatabasePage($);
        objHomePage = new HomePage($);
        objLoginPage = new LoginPage($);
        objPlaylistDetailPage = new PlaylistDetailPage($);

        objLoginPage.loginToCms("super@admin.pl", "haslo");
        Assert.assertTrue(objHomePage.getHomePageName().toLowerCase().contains("pitched.create"));
        objHomePage.findPlaylist("PlaylistK");
        objHomePage.clickSearch();

        Assert.assertTrue(objPitchedCreateDatabasePage.getPlaylistNameOnList().toLowerCase().contains("playlistk"));
        objPitchedCreateDatabasePage.openPlaylist();

        objPlaylistDetailPage.clickUpdate();
        objPlaylistDetailPage.syndicateTo_Deezer();
        objPlaylistDetailPage.clickSyndicate();

        Assert.assertTrue(objPlaylistDetailPage.getSyndicateStatus().toLowerCase().contains("deezer completed."));
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
