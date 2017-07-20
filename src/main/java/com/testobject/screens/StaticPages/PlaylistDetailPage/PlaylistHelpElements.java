package com.testobject.screens.StaticPages.PlaylistDetailPage;

import com.testobject.screens.StaticPages.AbstractScreen;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PlaylistHelpElements extends AbstractScreen {

    @FindBy(xpath = "//ui-view/playlist-edit/div/div/div[1]/h1/span[2]")
    private WebElement playlistPageTitle;

    @FindBy(xpath = "//body/md-toast/div/span")
    private WebElement Notification;

    //Page static buttons

    @FindBy(xpath = "//button[contains(., 'Delete')]")
    private WebElement deleteButton;

    @FindBy(xpath = "//button[contains(., 'Reimport')]")
    private WebElement reimportButton;

    @FindBy(xpath = "//button[contains(., 'Save')]")
    private WebElement saveButton;

    @FindBy(xpath = "//button[contains(., 'Syndicate')]")
    private WebElement syndicateButton;

    @FindBy(xpath = "//button[contains(., 'Update')]")
    private WebElement updateButton;

    //Popup statuses

    @FindBy(xpath = "//md-dialog/div/div/div/div[2]")
    private WebElement reimportStatus;

    @FindBy(xpath = "//div/strong[@class='ng-binding']")
    private WebElement syndicateStatus;

    //

    @FindBy(xpath = "//md-dialog-actions/button[2]")
    private WebElement popupDeleteButton;

    // Syndicate popup - Music streaming services check-boxes

    @FindBy(css = "div.playlist-publish-dialog__services-checkboxes > md-checkbox[name=\"Deezer\"] > div.md-label > span.ng-binding.ng-scope")
    private WebElement syndicateToDeezer;

    @FindBy(css = "")
    private WebElement syndicateToNapster;

    @FindBy(css = "")
    private WebElement syndicateToYoutube;

    @FindBy(css = "")
    private WebElement syndicateToSoundcloud;

    public PlaylistHelpElements(WebDriver driver) {super(driver);}

    public String getNotification() {

        return Notification.getText();
    }

    //method to get Playlist name

    public String getPlaylistPageTitle() {

        return playlistPageTitle.getText();
    }

    //method to get get Reimport status

    public String getReimportStatus() {

        return reimportStatus.getText();
    }

    //method to get Reimport status

    public String getSyndicateStatus() {

        return syndicateStatus.getText();
    }

    //click on Delete button

    public void clickDelete() {

        deleteButton.click();
    }

    public void clickDeleteOnPopup() {
        popupDeleteButton.click();
    }

    //click on Reimport button

    public void clickReimport() {

        reimportButton.click();
    }

    //click on Save button

    public void clickSave() {

        saveButton.click();
    }

    //click on Syndicate button

    public void clickSyndicate() {

       syndicateButton.click();
    }

    //click on Update button

    public void clickUpdate() {
        updateButton.click();
    }

    public void syndicateTo_Deezer() {
        syndicateToDeezer.click();
    }

    public void scrollTo(String elementToScroll) {
        JavascriptExecutor je = (JavascriptExecutor)driver;
        je.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//label[contains(., '"+elementToScroll+"')]")));
    }
}