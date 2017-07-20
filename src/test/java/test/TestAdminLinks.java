package test;

import com.testobject.screens.Data.Credentials;
import com.testobject.screens.Data.allStrings;
import org.junit.Assert;
import org.junit.Test;
import utility.AbstractTest;

/**
 * Created by pmisiak on 19.07.2017.
 */
public class TestAdminLinks extends AbstractTest {

  @Test
  public void openUsersTopLink() {

    //login

    app.loginPage().openPage(allStrings.cmsDev);
    app.loginPage().loginToCms(Credentials.superAdminLogin, Credentials.superAdminPassword);
    Assert.assertEquals(app.homePage().getHomePageName(), allStrings.createHomeTitle);

    //open admin

    app.homeCreate().openAdmin();

    //open Users

    app.homeAdmin().clickUsersTopLink();
    app.usersPage().clickToEdit("Automation, Parent Brand Admin");
  }

  @Test
  public void openPlaysListBrandTopLink() {

    //login

    app.loginPage().openPage(allStrings.cmsDev);
    app.loginPage().loginToCms(Credentials.superAdminLogin, Credentials.superAdminPassword);
    Assert.assertEquals(app.homePage().getHomePageName(), allStrings.createHomeTitle);

    //open admin

    app.homeCreate().openAdmin();

    //open Playlist Brand

    app.homeAdmin().clickPlaylistBrandsTopLink();
  }

  @Test
  public void openTeamTopLink() {

    //login

    app.loginPage().openPage(allStrings.cmsDev);
    app.loginPage().loginToCms(Credentials.superAdminLogin, Credentials.superAdminPassword);
    Assert.assertEquals(app.homePage().getHomePageName(), allStrings.createHomeTitle);

    //open admin

    app.homeCreate().openAdmin();

    //open Team

    app.homeAdmin().clickTeamTopLink();
  }

  @Test
  public void openPlaySiteTopLink(){

    //login

    app.loginPage().openPage(allStrings.cmsDev);
    app.loginPage().loginToCms(Credentials.superAdminLogin, Credentials.superAdminPassword);
    Assert.assertEquals(app.homePage().getHomePageName(), allStrings.createHomeTitle);

    //open admin

    app.homeCreate().openAdmin();

    //open Play Site

    app.homeAdmin().clickPlaySiteTopLink();
  }

  @Test
  public void openTagsTopLink(){

    //login

    app.loginPage().openPage(allStrings.cmsDev);
    app.loginPage().loginToCms(Credentials.superAdminLogin, Credentials.superAdminPassword);
    Assert.assertEquals(app.homePage().getHomePageName(), allStrings.createHomeTitle);

    //open admin

    app.homeCreate().openAdmin();

    //open PlaylistTags

    app.homeAdmin().clickTagsTopLink();
  }

  @Test
  public void openYoutubeTopLink(){

    //login

    app.loginPage().openPage(allStrings.cmsDev);
    app.loginPage().loginToCms(Credentials.superAdminLogin, Credentials.superAdminPassword);
    Assert.assertEquals(app.homePage().getHomePageName(), allStrings.createHomeTitle);

    //open admin

    app.homeCreate().openAdmin();

    //open Youtube

    app.homeAdmin().clickYoutubeTopLink();
  }

  @Test
  public void openParentBrandsTopLink(){

    //login

    app.loginPage().openPage(allStrings.cmsDev);
    app.loginPage().loginToCms(Credentials.superAdminLogin, Credentials.superAdminPassword);
    Assert.assertEquals(app.homePage().getHomePageName(), allStrings.createHomeTitle);

    //open admin

    app.homeCreate().openAdmin();

    //open Parent Brands

    app.homeAdmin().clickParentBrandsTopLink();
  }

  @Test
  public void openImportAccountTopLink(){

    //login

    app.loginPage().openPage(allStrings.cmsDev);
    app.loginPage().loginToCms(Credentials.superAdminLogin, Credentials.superAdminPassword);
    Assert.assertEquals(app.homePage().getHomePageName(), allStrings.createHomeTitle);

    //open admin

    app.homeCreate().openAdmin();

    //open Import Account

    app.homeAdmin().clickImportAccountTopLink();
  }

  @Test
  public void openContactTopLink(){

    //login

    app.loginPage().openPage(allStrings.cmsDev);
    app.loginPage().loginToCms(Credentials.superAdminLogin, Credentials.superAdminPassword);
    Assert.assertEquals(app.homePage().getHomePageName(), allStrings.createHomeTitle);

    //open admin

    app.homeCreate().openAdmin();

    //open Contact

    app.homeAdmin().clickContactTopLink();
  }

  @Test
  public void openUsersTile(){

    //login

    app.loginPage().openPage(allStrings.cmsDev);
    app.loginPage().loginToCms(Credentials.superAdminLogin, Credentials.superAdminPassword);
    Assert.assertEquals(app.homePage().getHomePageName(), allStrings.createHomeTitle);

    //open admin

    app.homeCreate().openAdmin();

    //open Users Tile

    app.homeAdmin().clickUsersTile();
  }

  @Test
  public void openPlaylistBrandstile(){

    //login

    app.loginPage().openPage(allStrings.cmsDev);
    app.loginPage().loginToCms(Credentials.superAdminLogin, Credentials.superAdminPassword);
    Assert.assertEquals(app.homePage().getHomePageName(), allStrings.createHomeTitle);

    //open admin

    app.homeCreate().openAdmin();

    //open Playlist Brands Tile

    app.homeAdmin().clickPlaylistBrandsTile();
  }

  @Test
  public void openTeamTile(){

    //login

    app.loginPage().openPage(allStrings.cmsDev);
    app.loginPage().loginToCms(Credentials.superAdminLogin, Credentials.superAdminPassword);
    Assert.assertEquals(app.homePage().getHomePageName(), allStrings.createHomeTitle);

    //open admin

    app.homeCreate().openAdmin();

    //open Team Tile

    app.homeAdmin().clickTeamTile();
  }

  @Test
  public void openPlaySiteTile(){

    //login

    app.loginPage().openPage(allStrings.cmsDev);
    app.loginPage().loginToCms(Credentials.superAdminLogin, Credentials.superAdminPassword);
    Assert.assertEquals(app.homePage().getHomePageName(), allStrings.createHomeTitle);

    //open admin

    app.homeCreate().openAdmin();

    //open Play Site Tile

    app.homeAdmin().clickPlaySiteTile();
  }
}