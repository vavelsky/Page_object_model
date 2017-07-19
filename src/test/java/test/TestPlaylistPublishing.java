package test;

import org.junit.Assert;
import org.junit.Test;
import utility.AbstractTest;

public class TestPlaylistPublishing extends AbstractTest{
    
    @Test
    public void test_playlist_publishing(){

        app.loginPage().loginToCms("super@admin.pl", "haslo");
        Assert.assertTrue(app.homePage().getHomePageName().toLowerCase().contains("pitched.create"));
        app.homePage().findPlaylist("PlaylistK");
        app.homePage().clickSearch();

        Assert.assertTrue(app.databasePage().getPlaylistNameOnList().toLowerCase().contains("playlistk"));
        app.databasePage().clickPublish();

        Assert.assertTrue(app.databasePage().getPlaylistStatus().toLowerCase().contains("published"));
        Assert.assertTrue(app.databasePage().getNotification().toLowerCase().contains("playlist has beed updated!"));
        Assert.assertTrue(app.databasePage().getPlaylistStatus().toLowerCase().contains("published"));

    }
    
}
