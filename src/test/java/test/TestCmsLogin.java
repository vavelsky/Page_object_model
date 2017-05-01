package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class TestCmsLogin {

    WebDriver $;
    HomePage objHomePage;
    LoginPage objLogin;

    @Before
    public void setUp(){
        $ = new ChromeDriver();
        $.get("https://develop-web-cms-pitched.miquido.net/");
        $.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        $.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @Test
    public void test_HomePage_Login(){
        objLogin = new LoginPage($);
        objLogin.loginToCms("super@admin.pl", "haslo");
        objHomePage = new HomePage($);
        Assert.assertTrue(objHomePage.getHomePageName().toLowerCase().contains("pitched.create"));
    }
}
