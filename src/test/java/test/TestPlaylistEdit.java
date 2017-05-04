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

public class TestPlaylistEdit {

    WebDriver $;

    DatabasePage objDatabasePage;
    HomePage objHomePage;
    LoginPage objLoginPage;
    PlaylistPage objPlaylistPage;


    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        $ = new ChromeDriver();
        $.get("https://develop-web-cms-pitched.miquido.net/");
        $.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        $.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @Test
    public void edit_name_and_description() throws Exception {

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

        objPlaylistPage.setPlaylistName("New name");
        objPlaylistPage.setPlaylistDescription("New description");

        objPlaylistPage.clickSave();
        Assert.assertTrue(objPlaylistPage.getNotification().toLowerCase().contains("playlist has been updated!"));


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
