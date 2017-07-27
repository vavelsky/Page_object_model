package test;

import com.testobject.screens.Data.Credentials;
import com.testobject.screens.Data.allStrings;
import org.junit.Assert;
import org.junit.Test;
import utility.AbstractTest;

public class TestPlaylistDelete extends AbstractTest{

    @Test
    public void test_playlist_delete(){

        //login

        app.loginPage().openPage(allStrings.cmsDev);
        app.loginPage().loginToCms(Credentials.superAdminLogin, Credentials.superAdminPassword);
        Assert.assertEquals(app.homePage().getHomePageName(), allStrings.createHomeTitle);

        app.homePage().findPlaylist("PlaylistK");
        app.homePage().clickSearch();
        Assert.assertTrue(app.databasePage().getPlaylistNameOnList().toLowerCase().contains("playlistk"));
        app.databasePage().openPlaylist();
        app.playlistDetailPage().clickDelete();
        app.playlistDetailPage().clickDeleteOnPopup();
        Assert.assertTrue(app.databasePage().getNotification().toLowerCase().contains("playlist has been deleted!"));
    }
}
