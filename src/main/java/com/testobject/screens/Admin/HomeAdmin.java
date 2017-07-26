package com.testobject.screens.Admin;

import com.testobject.screens.StaticPages.AbstractScreen;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by pmisiak on 19.07.2017.
 */
public class HomeAdmin extends AbstractScreen{

  //top links

  @FindBy(linkText = "Home")
  private WebElement homeTopLink;

  @FindBy(linkText = "Users")
  private WebElement usersTopLink;

  @FindBy(linkText = "Playlist Brands")
  private WebElement playlistBrandsTopLink;

  @FindBy(linkText = "Team")
  private WebElement teamTopLink;

  @FindBy(linkText = "Play Site")
  private WebElement playSiteTopLink;

  @FindBy(linkText = "Tags")
  private WebElement tagsTopLink;

  @FindBy(linkText = "Youtube")
  private WebElement youtubeTopLink;

  @FindBy(linkText = "Parent Brands")
  private WebElement parentBrandsTopLink;

  @FindBy(linkText = "Import Account")
  private WebElement importAccountTopLink;

  @FindBy(xpath = "//navigation-secondary/div/div/ul[2]/li/span/a")
  private WebElement contactTopLink;

  //tile section

  @FindBy(xpath = "//admin-tiles/div/div/div/div[1]")
  private WebElement usersTile;

  @FindBy(xpath = "//admin-tiles/div/div/div/div[2]")
  private WebElement playlistBrandsTile;

  @FindBy(xpath = "//admin-tiles/div/div/div/div[3]")
  private WebElement teamTile;

  @FindBy(xpath = "//admin-tiles/div/div/div/div[4]")
  private WebElement playSiteTile;

  public HomeAdmin (WebDriver driver) {super(driver);}

  public void clickUsersTopLink(){
    usersTopLink.click();
  }

  public void clickPlaylistBrandsTopLink(){
    playlistBrandsTopLink.click();
  }

  public void clickTeamTopLink(){
    teamTopLink.click();
  }

  public void clickPlaySiteTopLink(){
    playSiteTopLink.click();
  }

  public void clickTagsTopLink(){    tagsTopLink.click();  }

  public void clickYoutubeTopLink(){
    youtubeTopLink.click();
  }

  public void clickParentBrandsTopLink(){
    parentBrandsTopLink.click();
  }

  public void clickImportAccountTopLink(){
    importAccountTopLink.click();
  }

  public void clickContactTopLink(){
    contactTopLink.click();
  }

  public void clickUsersTile(){
    usersTile.click();
  }

  public void clickPlaylistBrandsTile(){
    playlistBrandsTile.click();
  }

  public void clickTeamTile(){
    teamTile.click();
  }

  public void clickPlaySiteTile(){
    playSiteTile.click();
  }

}
