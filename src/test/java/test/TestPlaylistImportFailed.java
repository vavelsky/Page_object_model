package test;

import com.testobject.screens.Data.Credentials;
import com.testobject.screens.Data.allStrings;
import org.junit.Assert;
import org.junit.Test;
import utility.AbstractTest;

public class TestPlaylistImportFailed extends AbstractTest{
    
    @Test
    public void testImportPlaylistIsExists() throws Exception {

        app.loginPage().openPage(allStrings.cmsDev);
        app.loginPage().loginToCms(Credentials.superAdminLogin, Credentials.superAdminPassword);
        Assert.assertEquals(app.homePage().getHomePageName(), allStrings.createHomeTitle);

        //import
        app.homeCreate().openImportPage();

        Assert.assertTrue(app.importPage().getPageTitle().toLowerCase().contains("import"));
        app.importPage().setSpotifyURI("spotify:user:miquidoqa3:playlist:6kj9xb3BQTUTwieCUKL1tm");
        app.importPage().clickBrands();
        app.importPage().selectPlaylistBrand("Pawel Playlist");
        app.importPage().clickImport();
        Assert.assertTrue(app.importPage().getNotificationPopup().toLowerCase().contains("an error has occured, playlist has not been imported: this spotify playlist is already imported as playlistk"));

    }

}
