package test;

import org.junit.Assert;
import org.junit.Test;
import utility.AbstractTest;

public class TestPlaylistEdit extends AbstractTest{

    @Test
    public void test_edit_name_and_description() throws Exception {

        app.loginPage().loginToCms("super@admin.pl", "haslo");
        Assert.assertTrue(app.homePage().getHomePageName().toLowerCase().contains("pitched.create"));
        app.homePage().findPlaylist("PlaylistK");
        app.homePage().clickSearch();

        Assert.assertTrue(app.databasePage().getPlaylistNameOnList().toLowerCase().contains("playlistk"));
        app.databasePage().openPlaylist();

        app.playlistDetailPage().set_PlaylistName("New name");
        app.playlistDetailPage().set_PlaylistDescription("New description");

        app.playlistDetailPage().clickSave();
        Assert.assertTrue(app.playlistDetailPage().getNotification().toLowerCase().contains("playlist has been updated!"));

    }


    @Test
    public void test_change_primary_playlist_owner() throws Exception {

        app.loginPage().loginToCms("super@admin.pl", "haslo");
        Assert.assertTrue(app.homePage().getHomePageName().toLowerCase().contains("pitched.create"));
        app.homePage().findPlaylist("PlaylistK");
        app.homePage().clickSearch();

        Assert.assertTrue(app.databasePage().getPlaylistNameOnList().toLowerCase().contains("playlistk"));

        app.databasePage().openPlaylist();
        app.playlistDetailPage().select_PrimaryPlaylistOwner("Donovan Palmer");
        app.playlistDetailPage().clickSave();

        Assert.assertTrue(app.playlistDetailPage().getNotification().toLowerCase().contains("playlist has been updated!"));

    }

    @Test
    public void test_change_secondary_playlist_owner() throws Exception {

        app.loginPage().loginToCms("super@admin.pl", "haslo");
        Assert.assertTrue(app.homePage().getHomePageName().toLowerCase().contains("pitched.create"));
        app.homePage().findPlaylist("PlaylistK");
        app.homePage().clickSearch();

        Assert.assertTrue(app.databasePage().getPlaylistNameOnList().toLowerCase().contains("playlistk"));

        app.databasePage().openPlaylist();
        app.playlistDetailPage().select_SecondaryPlaylistOwner("James Burnett");
        app.playlistDetailPage().clickSave();

        Assert.assertTrue(app.playlistDetailPage().getNotification().toLowerCase().contains("playlist has been updated!"));

    }

    @Test
    public void test_activate_auto_import_and_syndicating() throws Exception {

        app.loginPage().loginToCms("super@admin.pl", "haslo");
        Assert.assertTrue(app.homePage().getHomePageName().toLowerCase().contains("pitched.create"));
        app.homePage().findPlaylist("PlaylistK");
        app.homePage().clickSearch();

        Assert.assertTrue(app.databasePage().getPlaylistNameOnList().toLowerCase().contains("playlistk"));
        app.databasePage().openPlaylist();

        app.playlistDetailPage().activate_daily_auto_import_and_syndicating();
        app.playlistDetailPage().clickSave();

        Assert.assertTrue(app.playlistDetailPage().getNotification().toLowerCase().contains("playlist has been updated!"));

    }

    @Test
    public void test_adding_tags() throws Exception {

        app.loginPage().loginToCms("super@admin.pl", "haslo");
        Assert.assertTrue(app.homePage().getHomePageName().toLowerCase().contains("pitched.create"));
        app.homePage().findPlaylist("PlaylistK");
        app.homePage().clickSearch();

        Assert.assertTrue(app.databasePage().getPlaylistNameOnList().toLowerCase().contains("playlistk"));
        app.databasePage().openPlaylist();

        Assert.assertTrue(app.playlistDetailPage().getPlaylistPageTitle().toLowerCase().contains("playlistk"));

        app.playlistDetailPage().scroll_to("Select your tags and add (+)");
        app.playlistDetailPage().set_All_of_tags("soul", "sad", "extra", "Mood Fu", "master");

        app.playlistDetailPage().clickSave();
    }

    @Test
    public void test_do_not_import_spotify_description() throws Exception {

        app.loginPage().loginToCms("super@admin.pl", "haslo");
        Assert.assertTrue(app.homePage().getHomePageName().toLowerCase().contains("pitched.create"));

        app.homePage().findPlaylist("PlaylistK");
        app.homePage().clickSearch();
        Assert.assertTrue(app.databasePage().getPlaylistNameOnList().toLowerCase().contains("playlistk"));

        app.databasePage().openPlaylist();
        Assert.assertTrue(app.playlistDetailPage().getPlaylistPageTitle().toLowerCase().contains("playlistk"));

        app.playlistDetailPage().select_Do_not_import_Spotify_description();
        app.playlistDetailPage().clickSave();

        Assert.assertTrue(app.playlistDetailPage().getNotification().toLowerCase().contains("playlist has been updated!"));
    }

}
