package com.testobject.screens.StaticPages.PlaylistDetailPage;


import com.testobject.screens.StaticPages.AbstractScreen;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PlaylistInfo extends AbstractScreen{

    public PlaylistInfo(WebDriver driver){super(driver);}

    //Playlist text fields for edit

    @FindBy(xpath = "//expandable-section/div[2]/div/content/div[1]/div[1]/input")
    private WebElement playlistName;

    @FindBy(xpath = "//expandable-section/div[2]/div/content/div[1]/div[2]/textarea")
    private WebElement playlistDescription;

    //Playlist owners

    @FindBy(xpath = "//playlist-edit/div/div/div[3]/div[1]/div/div/div[1]/span/span[2]")
    private WebElement primaryPlaylistOwner;

    @FindBy(xpath = "//playlist-edit/div/div/div[3]/div[2]/div/div/div[1]/span")
    private WebElement secondaryPlaylistOwner;

    // Do not import Spotify description (check-box)

    @FindBy(xpath = "//expandable-section/div[2]/div/content/div[1]/div[3]/md-checkbox/div[1]")
    private WebElement spotifyDescriptionCheckbox;



    public void setPlaylistName(String strPlaylistName) {
        playlistName.clear();
        playlistName.sendKeys(strPlaylistName);
    }

    public void setPlaylistDescription(String strPlaylistDescription) {
        playlistDescription.clear();
        playlistDescription.sendKeys(strPlaylistDescription);
    }


    public void selectPrimaryPlaylistOwner(String PrOwner) {
        primaryPlaylistOwner.click();
        JavascriptExecutor je = (JavascriptExecutor)driver;
        je.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//span[contains(.,'"+PrOwner+"')]")));
        WebElement clickowner = driver.findElement(By.xpath("//span[contains(.,'"+PrOwner+"')]"));
        clickowner.click();
    }

    public void selectSecondaryPlaylistOwner(String SecOwner) {
        secondaryPlaylistOwner.click();
        JavascriptExecutor je = (JavascriptExecutor)driver;
        je.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//span[contains(., '"+SecOwner+"')]")));
        WebElement clickowner = driver.findElement(By.xpath("//span[contains(.,'"+SecOwner+"')]"));
        clickowner.click();
    }

    public void selectDoNotImportSpotifyDescription(){
        spotifyDescriptionCheckbox.click();
    }
}
