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

public class TestPlaylistEdit {

    WebDriver $;

    PitchedCreate_DatabasePage objPitchedCreateDatabasePage;
    HomePage objHomePage;
    LoginPage objLoginPage;
    PlaylistDetailPage objPlaylistDetailPage;


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
        objPitchedCreateDatabasePage = new PitchedCreate_DatabasePage($);
        objPlaylistDetailPage = new PlaylistDetailPage($);

        objLoginPage.loginToCms("super@admin.pl", "haslo");
        Assert.assertTrue(objHomePage.getHomePageName().toLowerCase().contains("pitched.create"));
        objHomePage.findPlaylist("PlaylistK");
        objHomePage.clickSearch();

        Assert.assertTrue(objPitchedCreateDatabasePage.getPlaylistNameOnList().toLowerCase().contains("playlistk"));
        objPitchedCreateDatabasePage.openPlaylist();

        objPlaylistDetailPage.set_PlaylistName("New name");
        objPlaylistDetailPage.set_PlaylistDescription("New description");

        objPlaylistDetailPage.clickSave();
        Assert.assertTrue(objPlaylistDetailPage.getNotification().toLowerCase().contains("playlist has been updated!"));

    }


    @Test
    public void test_change_primary_playlist_owner() throws Exception {

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
        objPlaylistDetailPage.select_PrimaryPlaylistOwner("Donovan Palmer");
        objPlaylistDetailPage.clickSave();

        Assert.assertTrue(objPlaylistDetailPage.getNotification().toLowerCase().contains("playlist has been updated!"));

    }

    @Test
    public void test_change_secondary_playlist_owner() throws Exception {

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
        objPlaylistDetailPage.select_SecondaryPlaylistOwner("James Burnett");
        objPlaylistDetailPage.clickSave();

        Assert.assertTrue(objPlaylistDetailPage.getNotification().toLowerCase().contains("playlist has been updated!"));

    }

    @Test
    public void test_activate_auto_import_and_syndicating() throws Exception {

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

        objPlaylistDetailPage.activate_daily_auto_import_and_syndicating();
        objPlaylistDetailPage.clickSave();

        Assert.assertTrue(objPlaylistDetailPage.getNotification().toLowerCase().contains("playlist has been updated!"));

    }

    @Test
    public void test_adding_tags() throws Exception {

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

        Assert.assertTrue(objPlaylistDetailPage.getPlaylistPageTitle().toLowerCase().contains("playlistk"));

        objPlaylistDetailPage.scroll_to("Select your tags and add (+)");
        objPlaylistDetailPage.set_All_of_tags("soul", "sad", "extra", "Mood Fu", "master");

        objPlaylistDetailPage.clickSave();
    }

    @Test
    public void test_do_not_import_spotify_description() throws Exception {

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
        Assert.assertTrue(objPlaylistDetailPage.getPlaylistPageTitle().toLowerCase().contains("playlistk"));

        objPlaylistDetailPage.select_Do_not_import_Spotify_description();
        objPlaylistDetailPage.clickSave();

        Assert.assertTrue(objPlaylistDetailPage.getNotification().toLowerCase().contains("playlist has been updated!"));
    }

    @After
    public void tearDown() throws Exception {
        //$.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }
}
