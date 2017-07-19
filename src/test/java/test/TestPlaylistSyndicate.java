package test;


import org.junit.Assert;
import org.junit.Test;
import utility.AbstractTest;

public class TestPlaylistSyndicate extends AbstractTest{
    
    @Test
    public void test_playlist_syndicate() throws Exception {
        
        app.loginPage().loginToCms("super@admin.pl", "haslo");
        Assert.assertTrue(app.homePage().getHomePageName().toLowerCase().contains("pitched.create"));
        app.homePage().findPlaylist("PlaylistK");
        app.homePage().clickSearch();

        Assert.assertTrue(app.databasePage().getPlaylistNameOnList().toLowerCase().contains("playlistk"));
        app.databasePage().openPlaylist();

        app.playlistDetailPage().clickUpdate();
        app.playlistDetailPage().syndicateTo_Deezer();
        app.playlistDetailPage().clickSyndicate();

        Assert.assertTrue(app.playlistDetailPage().getSyndicateStatus().toLowerCase().contains("deezer completed."));
    }
    
}
