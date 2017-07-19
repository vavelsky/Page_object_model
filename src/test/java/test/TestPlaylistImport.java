package test;

import com.testobject.screens.Data.Credentials;
import com.testobject.screens.Data.allStrings;
import org.junit.Assert;
import org.junit.Test;
import utility.AbstractTest;

public class TestPlaylistImport extends AbstractTest {

    @Test
    public void testPlaylistImport() {

        //login

        app.loginPage().openPage(allStrings.cmsDev);
        app.loginPage().loginToCms(Credentials.superAdminLogin, Credentials.superAdminPassword);
        Assert.assertEquals(app.homePage().getHomePageName(), allStrings.createHomeTitle);

        //import

        app.homeCreate().openImportPage();
        app.importPage().setSpotifyURI("spotify:user:miquidoqa3:playlist:6kj9xb3BQTUTwieCUKL1tm");
        app.importPage().clickBrands();

        app.importPage().selectPlaylistBrand("Pawel Playlist");
        app.importPage().clickImport();

        Assert.assertTrue(app.importPage().getNotificationPopup().contains(allStrings.successfulImport));

        Assert.assertTrue(app.playlistDetailPage().getPlaylistPageTitle().toLowerCase().contains("playlistk"));

    }
}
