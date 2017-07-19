package test;

import org.junit.Assert;
import org.junit.Test;
import utility.AbstractTest;

public class TestPlaylistReimport extends AbstractTest{

    @Test
    public void test_playlist_reimport() throws Exception {

        app.loginPage().loginToCms("super@admin.pl", "haslo");
        Assert.assertTrue(app.homePage().getHomePageName().toLowerCase().contains("pitched.create"));
        app.homePage().findPlaylist("PlaylistK");
        app.homePage().clickSearch();

        Assert.assertTrue(app.databasePage().getPlaylistNameOnList().toLowerCase().contains("playlistk"));
        app.databasePage().openPlaylist();

        app.playlistDetailPage().clickReimport();
        Assert.assertEquals("playlist has been reimported successfully.", app.playlistDetailPage().getReimportStatus());
    }

}
