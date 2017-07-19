package test;

import com.testobject.screens.Data.Credentials;
import com.testobject.screens.Data.allStrings;
import org.junit.Assert;
import org.junit.Test;
import utility.AbstractTest;

public class TestLogin extends AbstractTest{

    @Test
    public void loginAsPlayEditor(){
        app.loginPage().openPage(allStrings.cmsDev);
        app.loginPage().loginToCms(Credentials.playEditorLogin, Credentials.playEditorPassword);
        Assert.assertEquals(app.homePage().getHomePageName(), allStrings.createHomeTitle);
    }

    @Test
    public void loginAsPlaySiteAdmin(){
        app.loginPage().openPage(allStrings.cmsDev);
        app.loginPage().loginToCms(Credentials.playSiteAdminLogin, Credentials.playSiteAdminPassword);
        Assert.assertEquals(app.homePage().getHomePageName(), allStrings.createHomeTitle);

    }

    @Test
    public void loginAsPlaylistProgrammer(){
        app.loginPage().openPage(allStrings.cmsDev);
        app.loginPage().loginToCms(Credentials.playListPragrammerLogin, Credentials.playListPragrammerPassword);
        Assert.assertEquals(app.homePage().getHomePageName(), allStrings.createHomeTitle);

    }

    @Test
    public void loginAsTeamAdmin(){
        app.loginPage().openPage(allStrings.cmsDev);
        app.loginPage().loginToCms(Credentials.teamAdminLogin, Credentials.teamAdminPassword);
        Assert.assertEquals(app.homePage().getHomePageName(), allStrings.createHomeTitle);

    }

    @Test
    public void loginAsParrentBrandAdmin(){
        app.loginPage().openPage(allStrings.cmsDev);
        app.loginPage().loginToCms(Credentials.parrentBrandAdminLogin, Credentials.parrentBrandAdminPassword);
        Assert.assertEquals(app.homePage().getHomePageName(), allStrings.createHomeTitle);

    }

    @Test
    public void loginAsSuperAdmin(){

        app.loginPage().openPage(allStrings.cmsDev);
        app.loginPage().loginToCms(Credentials.superAdminLogin, Credentials.superAdminPassword);
        Assert.assertEquals(app.homePage().getHomePageName(), allStrings.createHomeTitle);
    }


}
