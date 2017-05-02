package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;
import static org.junit.Assert.fail;
import java.util.concurrent.TimeUnit;

public class TestPlaylistReimport {

    WebDriver $;
    LoginPage objLogin;
    HomePage objHomePage;
    DatabasePage objDatabasePage;
    PlaylistPage objPlaylist;

    public StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        $ = new ChromeDriver();
        $.get("");
        $.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        $.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @Test
    public void test_playlist_reimport() throws Exception {

        objLogin = new LoginPage($);
        objHomePage = new HomePage($);
        objDatabasePage = new DatabasePage($);
        objPlaylist = new PlaylistPage($);


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
