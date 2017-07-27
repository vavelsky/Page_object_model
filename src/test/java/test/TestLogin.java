package test;

import com.testobject.screens.Data.allStrings;
import org.junit.Assert;
import org.junit.Test;
import utility.AbstractTest;

public class TestLogin extends AbstractTest{

    @Test
    public void loginAsPlayEditor(){
    app.loginPage().loginAsPlayEditor();
    Assert.assertEquals(app.homePage().getHomePageName(), allStrings.createHomeTitle);
    }

    @Test
    public void loginAsPlaySiteAdmin(){
        app.loginPage().loginAsPlaySiteAdmin();
        Assert.assertEquals(app.homePage().getHomePageName(), allStrings.createHomeTitle);
    }

    @Test
    public void loginAsPlaylistProgrammer(){
        app.loginPage().loginAsPlayListProgrammer();
        Assert.assertEquals(app.homePage().getHomePageName(), allStrings.createHomeTitle);

    }

    @Test
    public void loginAsTeamAdmin(){
        app.loginPage().loginAsTeamAdmin();
        Assert.assertEquals(app.homePage().getHomePageName(), allStrings.createHomeTitle);

    }

    @Test
    public void loginAsParrentBrandAdmin(){
        app.loginPage().loginAsParrentBrandAdmin();
        Assert.assertEquals(app.homePage().getHomePageName(), allStrings.createHomeTitle);

    }

    @Test
    public void loginAsSuperAdmin(){
        app.loginPage().loginAsSuperAdmin();
        Assert.assertEquals(app.homePage().getHomePageName(), allStrings.createHomeTitle);
        app.loginPage().logOut();
    }


}
