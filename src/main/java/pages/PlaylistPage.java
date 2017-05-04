package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class PlaylistPage {

    WebDriver $;

    By PlaylistPageTitle = By.xpath("//ui-view/playlist-edit/div/div/div[1]/h1/span[2]");
    By Notification = By.xpath("//body/md-toast/div/span");

    //Page static buttons

    By DeleteButton = By.xpath("//button[contains(., 'Delete')]");
    By ReimportButton = By.xpath("//button[contains(., 'Reimport')]");
    By SaveButton = By.xpath("//button[contains(., 'Save')]");
    By SyndicateButton = By.xpath("//button[contains(., 'Syndicate')]");
    By UpdateButton = By.xpath("//button[contains(., 'Update')]");

    //Popup statuses

    By ReimportStatus = By.xpath("//md-dialog/div/div/div/div[2]");
    By SyndicateStatus = By.xpath("//div/strong[@class='ng-binding']");

    //Playlist owners

    By SecondaryPlaylistOwner = By.xpath("//playlist-edit/div/div/div[3]/div[2]/div/div/div[1]/span");
    By PrimaryPlaylistOwner = By.xpath("//playlist-edit/div/div/div[3]/div[1]/div/div/div[1]/span/span[2]");
    By PrimaryPlaylistOwnerDropdown = By.className("ui-select-choices-group");

    //Playlist text fields for edit

    By PlaylistName = By.xpath("//expandable-section/div[2]/div/content/div[1]/div[1]/input");
    By PlaylistDescription = By.xpath("//expandable-section/div[2]/div/content/div[1]/div[2]/textarea");

    //

    By PopupDeleteButton = By.xpath("//md-dialog-actions/button[2]");

    //

    By SyndicateDeezerCheckbox = By.cssSelector("div.playlist-publish-dialog__services-checkboxes > md-checkbox[name=\"Deezer\"] > div.md-label > span.ng-binding.ng-scope");
    By SyndicateNapsterCheckbox = By.cssSelector("");
    By SyndicateYoutubeCheckbox = By.cssSelector("");

    public PlaylistPage(WebDriver $) {
        this.$ = $;
    }

    public String getNotification() {

        return $.findElement(Notification).getText();
    }

    //method to get Playlist name

    public String getPlaylistPageTitle() {

        return $.findElement(PlaylistPageTitle).getText();
    }

    //method to get get Reimport status

    public String getReimportStatus() {
        return $.findElement(ReimportStatus).getText();
    }

    //method to get Reimport status

    public String getSyndicateStatus() {
        return $.findElement(SyndicateStatus).getText();
    }


    //click on Delete button

    public void clickDelete() {

        $.findElement(DeleteButton).click();
    }

    public void clickDeleteOnPopup() {
        $.findElement(PopupDeleteButton).click();
    }

    //click on Reimport button

    public void clickReimport() {

        $.findElement(ReimportButton).click();
    }

    //click on Save button

    public void clickSave() {

        $.findElement(SaveButton).click();
    }

    //click on Syndicate button

    public void clickSyndicate() {

        $.findElement(SyndicateButton).click();
    }

    //click on Update button

    public void clickUpdate() {
        $.findElement(UpdateButton).click();
    }


    public void syndicateToDeezer() {
        $.findElement(SyndicateDeezerCheckbox).click();
    }

    public void setPlaylistName(String strPlaylistName) {
        $.findElement(PlaylistName).clear();
        $.findElement(PlaylistName).sendKeys(strPlaylistName);
    }

    public void setPlaylistDescription(String strPlaylistDescription) {
        $.findElement(PlaylistDescription).clear();
        $.findElement(PlaylistDescription).sendKeys(strPlaylistDescription);
    }

    public void select(String strPrimarylistOwner) {
        WebElement owner = $.findElement(PrimaryPlaylistOwner);
        owner.click();

    }
}