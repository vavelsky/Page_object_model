package test.Admin;

import com.testobject.screens.Data.Credentials;
import com.testobject.screens.Data.allStrings;
import org.junit.Assert;
import org.junit.Test;
import utility.AbstractTest;

/**
 * Created by pmisiak on 26.07.2017.
 */
public class TestEditUser extends AbstractTest {

  @Test
  public void editUserNoChanges(){

    //login

    app.loginPage().openPage(allStrings.cmsDev);
    app.loginPage().loginToCms(Credentials.superAdminLogin, Credentials.superAdminPassword);
    Assert.assertEquals(app.homePage().getHomePageName(), allStrings.createHomeTitle);

    //open admin

    app.homeCreate().openAdmin();

    //open Users

    app.homeAdmin().clickUsersTopLink();

    //click Edit button on Users list

    app.usersPage().clickToEdit("Automation, Parent Brand Admin");

    //click Edit User button with no changes for user

    app.editUserPage().clickEditUser();
  }

  @Test
  public void deleteUser(){

    //login

    app.loginPage().openPage(allStrings.cmsDev);
    app.loginPage().loginToCms(Credentials.superAdminLogin, Credentials.superAdminPassword);
    Assert.assertEquals(app.homePage().getHomePageName(), allStrings.createHomeTitle);

    //open admin

    app.homeCreate().openAdmin();

    //open Users

    app.homeAdmin().clickUsersTopLink();

    //click Edit button on Users list

    app.usersPage().clickToEdit("admin, team");

    // delete user

    app.editUserPage().clickDeleteUser();
    app.editUserPage().confirmDeltetion();
  }

  @Test
  public void cancelUserDeletion(){

    //login

    app.loginPage().openPage(allStrings.cmsDev);
    app.loginPage().loginToCms(Credentials.superAdminLogin, Credentials.superAdminPassword);
    Assert.assertEquals(app.homePage().getHomePageName(), allStrings.createHomeTitle);

    //open admin

    app.homeCreate().openAdmin();

    //open Users

    app.homeAdmin().clickUsersTopLink();

    //click Edit button on Users list

    app.usersPage().clickToEdit("admin, super");

    // delete user - cancel

    app.editUserPage().clickDeleteUser();
    app.editUserPage().cancelDeletion();
  }
}
