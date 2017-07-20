package test;

import org.junit.Assert;
import org.junit.Test;
import utility.AbstractTest;

public class Test_Add_PL_to_category extends AbstractTest{

    @Test
    public void test_add_playlist_to_category() throws Exception {

        app.loginPage().loginToCms("super@admin.pl", "haslo");
        Assert.assertTrue(app.homePage().getHomePageName().toLowerCase().contains("pitched.create"));
        app.homePage().clickPlay();

        app.playlistsPage().clickPlaylitsLink();

        app.playlistsPage().findPlaylist("PlaylistK");

        Assert.assertTrue(app.playlistsPage().getPageTitle().toLowerCase().contains("pitched.play"));
        Assert.assertTrue(app.playlistsPage().gePageSubTitle().toLowerCase().contains("playlists"));

        app.playlistsPage().clickHideButton();
        app.playlistsPage().clickHideButton();

        app.playlistsPage().selectPlaySite("Digster.fm");

        Assert.assertTrue(app.playlistsPage().checkPlaylist_Is_Exist().toLowerCase().contains("playlistk"));

        app.playlistsPage().clickAddButton();

        app.playlistsPage().select_Category("Chill");


    }
}
