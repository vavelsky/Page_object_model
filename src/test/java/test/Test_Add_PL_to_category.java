package test;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

public class Test_Add_PL_to_category {

    WebDriver $;

    HomePage objHomePage;
    LoginPage objLoginPage;
    PitchedPlay_PlaylistsPage objPitchedPlay_PlaylistPage;

    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp(){
        $ = new ChromeDriver();
        $.get("https://develop-web-cms-pitched.miquido.net/");
        $.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        $.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @Test
    public void test_add_playlist_to_category() throws Exception {

        objLoginPage = new LoginPage($);
        objHomePage = new HomePage($);
        objPitchedPlay_PlaylistPage = new PitchedPlay_PlaylistsPage($);

        objLoginPage.loginToCms("super@admin.pl", "haslo");
        Assert.assertTrue(objHomePage.getHomePageName().toLowerCase().contains("pitched.create"));

        objHomePage.clickPlay();
        objPitchedPlay_PlaylistPage.clickPlaylitsLink();

        objPitchedPlay_PlaylistPage.findPlaylist("PlaylistK");

        Assert.assertTrue(objPitchedPlay_PlaylistPage.getPageTitle().toLowerCase().contains("pitched.play"));
        Assert.assertTrue(objPitchedPlay_PlaylistPage.gePageSubTitle().toLowerCase().contains("playlists"));

        objPitchedPlay_PlaylistPage.clickHideButton();
        objPitchedPlay_PlaylistPage.clickHideButton();

        objPitchedPlay_PlaylistPage.select_PlaySite("Digster.fm");

        Assert.assertTrue(objPitchedPlay_PlaylistPage.checkPlaylist_Is_Exist().toLowerCase().contains("playlistk"));

        objPitchedPlay_PlaylistPage.clickAddButton();

        objPitchedPlay_PlaylistPage.select_Category("Chill");


    }

    @After
    public void tearDown() throws Exception {
        //$.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }
}
