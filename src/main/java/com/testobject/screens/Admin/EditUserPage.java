package com.testobject.screens.Admin;

import com.testobject.screens.StaticPages.AbstractScreen;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by pmisiak on 26.07.2017.
 */
public class EditUserPage extends AbstractScreen {

  //User details

  @FindBy(xpath = "//user-form/div/form/div[1]/div[1]/input[1]")
  private WebElement firstNameField;

  @FindBy(xpath = "//user-form/div/form/div[1]/div[2]/input[1]")
  private WebElement lastNameField;

  @FindBy(xpath = "//user-form/div/form/div[1]/div[3]/input[1]")
  private WebElement emailField;

  @FindBy(xpath = "//user-form/div/form/div[1]/div[4]/input[1]")
  private WebElement passwordField;

  @FindBy(xpath = "//user-form/div/form/div[1]/div[5]/input[1]")
  private WebElement confirmPasswordField;


  //Roles Play Editor

  @FindBy(xpath = "//user-form/div/form/div[1]/div[6]/md-checkbox/div[1]")
  private WebElement playEditorCheckbox;

  @FindBy(xpath = "//user-form/div/form/div[1]/div[6]/div/div/div/span/span[2]")
  private WebElement playEditorDropdown;

  @FindBy(xpath = "//*[@id='ui-select-choices-row-1-0']")
  private WebElement digsterPlayEditorDropdown;

  @FindBy(xpath = "//*[@id='ui-select-choices-row-1-1']")
  private WebElement udiscoverPlayEditorDropdown;


  //Roles Play Site Admin

  @FindBy(xpath = "//user-form/div/form/div[1]/div[7]/md-checkbox/div[1]")
  private WebElement playSiteAdminCheckbox;

  @FindBy(xpath = "//user-form/div/form/div[1]/div[7]/div/div/div/span/span[2]")
  private WebElement playSiteAdminDropdown;

  @FindBy(xpath = "//*[@id='ui-select-choices-row-0-0']")
  private WebElement digsterPlaySiteAdminDropdown;

  @FindBy(xpath = "//*[@id='ui-select-choices-row-0-1']")
  private WebElement udiscoverPlaySiteAdminDropdown;


  //Roles Playlist Programmer

  @FindBy(xpath = "//user-form/div/form/div[1]/div[8]/md-checkbox/div[1]")
  private WebElement playlistProgrammerCheckbox;

  @FindBy(xpath = "//user-form/div/form/div[1]/div[8]/div/div/div/span/span[2]")
  private WebElement playlistProgrammerDropdown;

  @FindBy(xpath = "//*[@id='ui-select-choices-row-3-2']")
  private WebElement automationTeamPlaylistProgrammerDropdown;


  //Roles Team Admin

  @FindBy(xpath = "//user-form/div/form/div[1]/div[9]/md-checkbox/div[1]")
  private WebElement teamAdminCheckbox;

  @FindBy(xpath = "//user-form/div/form/div[1]/div[9]/div/div/div/span/span[2]")
  private WebElement teamAdminDropdown;

  @FindBy(xpath = "//*[@id='ui-select-choices-row-4-2']")
  private WebElement automationTeamAdminDropdown;


  //Roles Parent Brand Admin

  @FindBy(xpath = "//user-form/div/form/div[1]/div[10]/md-checkbox/div[1]")
  private WebElement parentBrandAdminCheckbox;

  @FindBy(xpath = "//user-form/div/form/div[1]/div[10]/div/div/div/span/span[2]")
  private WebElement parentBrandAdminDropdown;

  @FindBy(xpath = "//*[@id='ui-select-choices-row-5-0']")
  private WebElement automationParentBrandDropdown;


  //Roles Super Admin

  @FindBy(xpath = "//user-form/div/form/div[1]/div[11]/md-checkbox/div[1]")
  private WebElement superAdminCheckbox;


  //Buttons

  @FindBy(xpath = "//user-form/div/div[2]/button[1]")
  private WebElement editUserButton;

  @FindBy(xpath = "//user-form/div/div[2]/button[2]")
  private WebElement deleteUserButton;

  @FindBy(xpath = "//*[@id='dialogContent_0']/md-dialog-actions/button[2]")
  private WebElement deleteConfirmationButton;

  @FindBy(xpath = "//*[@id='dialogContent_0']/md-dialog-actions/button[1]")
  private WebElement deleteCancelButton;

  public EditUserPage(WebDriver driver){super(driver);}

  public void clickEditUser(){
    editUserButton.click();
  }

  public void clickDeleteUser(){
    deleteUserButton.click();
  }

  public void confirmDeltetion(){
    deleteConfirmationButton.click();
  }

  public void cancelDeletion(){
    deleteCancelButton.click();
  }
}
