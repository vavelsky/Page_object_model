package test.Admin;

import com.testobject.screens.Data.Credentials;
import com.testobject.screens.Data.allStrings;
import org.junit.Assert;
import org.junit.Test;
import utility.AbstractTest;

/**
 * Created by pmisiak on 26.07.2017.
 */
public class TestUsersList extends AbstractTest {

  @Test
  public void createNewUser(){
    //login

    app.loginPage().openPage(allStrings.cmsDev);
    app.loginPage().loginToCms(Credentials.superAdminLogin, Credentials.superAdminPassword);
    Assert.assertEquals(app.homePage().getHomePageName(), allStrings.createHomeTitle);

    //open admin

    app.homeCreate().openAdmin();

    //open Users

    app.homeAdmin().clickUsersTopLink();

    //open new user

    app.usersPage().clickToCreateNewUser();
  }

  @Test
  public void clickToEditUser(){
    //login

    app.loginPage().openPage(allStrings.cmsDev);
    app.loginPage().loginToCms(Credentials.superAdminLogin, Credentials.superAdminPassword);
    Assert.assertEquals(app.homePage().getHomePageName(), allStrings.createHomeTitle);

    //open admin

    app.homeCreate().openAdmin();

    //open Users

    app.homeAdmin().clickUsersTopLink();

    //open edit user

    app.usersPage().clickToEdit("Automation, Parent Brand Admin");
  }
}
