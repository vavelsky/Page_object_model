package com.testobject.screens.Admin;

import com.testobject.screens.StaticPages.AbstractScreen;
import org.openqa.selenium.By;
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

  @FindBy(xpath = "//users/div/div/div/users-list/div/table/tbody/tr")
  private WebElement allUsers;

  public UsersPage(WebDriver driver) { super(driver);}

  public void clickToEdit(String User){
    driver.findElement(By.xpath("//users-list/div/table/tbody/tr/td[contains(text(), '"+User+"')]"));
  }
}
