package test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
    public void test_edit_name_and_description() throws Exception {

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

        objPlaylistPage.set_PlaylistName("New name");
        objPlaylistPage.set_PlaylistDescription("New description");

        objPlaylistPage.clickSave();
        Assert.assertTrue(objPlaylistPage.getNotification().toLowerCase().contains("playlist has been updated!"));

    }


    @Test
    public void test_change_primary_playlist_owner() throws Exception {

        objDatabasePage = new DatabasePage($);
        objHomePage = new HomePage($);
        objLoginPage = new LoginPage($);
        objPlaylistPage = new PlaylistPage($);

        objLoginPage.loginToCms("super@admin.pl", "haslo");
        Assert.assertTrue(objHomePage.getHomePageName().toLowerCase().contains("pitched.create"));
        objHomePage.findPlaylist("PlaylistK");
        objHomePage.clickSearch();

        Assert.assertTrue(objDatabasePage.getPlaylistNameOnList().toLowerCase().contains("playlistk"));

        objDatabasePage.openPlaylist();
        objPlaylistPage.select_PrimaryPlaylistOwner("Donovan Palmer");
        objPlaylistPage.clickSave();

        Assert.assertTrue(objPlaylistPage.getNotification().toLowerCase().contains("playlist has been updated!"));

    }

    @Test
    public void test_change_secondary_playlist_owner() throws Exception {

        objDatabasePage = new DatabasePage($);
        objHomePage = new HomePage($);
        objLoginPage = new LoginPage($);
        objPlaylistPage = new PlaylistPage($);

        objLoginPage.loginToCms("super@admin.pl", "haslo");
        Assert.assertTrue(objHomePage.getHomePageName().toLowerCase().contains("pitched.create"));
        objHomePage.findPlaylist("PlaylistK");
        objHomePage.clickSearch();

        Assert.assertTrue(objDatabasePage.getPlaylistNameOnList().toLowerCase().contains("playlistk"));

        objDatabasePage.openPlaylist();
        objPlaylistPage.select_SecondaryPlaylistOwner("James Burnett");
        objPlaylistPage.clickSave();

        Assert.assertTrue(objPlaylistPage.getNotification().toLowerCase().contains("playlist has been updated!"));

    }

    @Test
    public void test_activate_auto_import_and_syndicating() throws Exception {

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

        objPlaylistPage.activate_daily_auto_import_and_syndicating();
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
