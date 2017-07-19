package com.testobject.screens.Admin;

import com.testobject.screens.StaticPages.AbstractScreen;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by pmisiak on 19.07.2017.
 */
public class UsersPage extends AbstractScreen {

  //Create button

  @FindBy(linkText = "Create New User")
  private WebElement createNewUserLink;

  //Users' list

  @FindBy(xpath = "html/body/app-container/div/div[1]/ui-view/users/div/div/div/users-list/div/table/tbody/tr[@text()='test new team']/td[5]/button")
  private WebElement editUserButton;

  public UsersPage(WebDriver driver) { super(driver);}
}
