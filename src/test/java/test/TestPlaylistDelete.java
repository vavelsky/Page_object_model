package test;

import org.junit.Assert;
import org.junit.Test;
import utility.AbstractTest;

public class TestPlaylistDelete extends AbstractTest{

    @Test
    public void test_playlist_delete(){

        app.loginPage().loginToCms("super@admin.pl", "haslo");
        Assert.assertTrue(app.homePage().getHomePageName().toLowerCase().contains("pitched.create"));
        app.homePage().findPlaylist("PlaylistK");
        app.homePage().clickSearch();
        Assert.assertTrue(app.databasePage().getPlaylistNameOnList().toLowerCase().contains("playlistk"));
        app.databasePage().openPlaylist();
        app.playlistDetailPage().clickDelete();
        app.playlistDetailPage().clickDeleteOnPopup();
        Assert.assertTrue(app.databasePage().getNotification().toLowerCase().contains("playlist has been deleted!"));
    }
}
