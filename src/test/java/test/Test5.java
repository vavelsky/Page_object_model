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

public class Test5 {

    WebDriver $;
    DatabasePage objDatabasePage;
    HomePage objHomePage;
    LoginPage objLogin;
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
    public void test_playlist_syndicate() throws Exception {

        objDatabasePage = new DatabasePage($);
        objHomePage = new HomePage($);
        objLogin = new LoginPage($);
        objPlaylistPage = new PlaylistPage($);

        objLogin.loginToCms("super@admin.pl", "haslo");
        Assert.assertTrue(objHomePage.getHomePageName().toLowerCase().contains("pitched.create"));
        objHomePage.findPlaylist("PlaylistK");
        objHomePage.clickSearch();

        Assert.assertTrue(objDatabasePage.getPlaylistNameOnList().toLowerCase().contains("playlistk"));
        objDatabasePage.openPlaylist();

        objPlaylistPage.clickUpdate();
        objPlaylistPage.syndicateToDeezer();
        objPlaylistPage.clickSyndicate();

        Assert.assertTrue(objPlaylistPage.getSyndicateStatus().toLowerCase().contains("deezer completed."));
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
