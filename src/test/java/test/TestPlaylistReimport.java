package test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;
import static org.junit.Assert.fail;
import java.util.concurrent.TimeUnit;

public class TestPlaylistReimport {

    WebDriver $;
    LoginPage objLoginPage;
    HomePage objHomePage;
    PitchedCreate_DatabasePage objPitchedCreateDatabasePage;
    PlaylistDetailPage objPlaylistDetailPage;


    public StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        $ = new ChromeDriver();
        $.get("https://develop-web-cms-pitched.miquido.net/");
        $.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        $.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @Test
    public void test_playlist_reimport() throws Exception {

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

        objPlaylistDetailPage.clickReimport();
        Assert.assertEquals("playlist has been reimported successfully.", objPlaylistDetailPage.getReimportStatus());
    }

    @After
    public void tearDown() throws Exception {
        $.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }
}
