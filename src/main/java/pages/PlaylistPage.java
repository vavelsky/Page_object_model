package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import sun.jvm.hotspot.utilities.Assert;

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

    By PrimaryPlaylistOwner = By.xpath("//playlist-edit/div/div/div[3]/div[1]/div/div/div[1]/span/span[2]");
    By SecondaryPlaylistOwner = By.xpath("//playlist-edit/div/div/div[3]/div[2]/div/div/div[1]/span");

    //Playlist text fields for edit

    By PlaylistName = By.xpath("//expandable-section/div[2]/div/content/div[1]/div[1]/input");
    By PlaylistDescription = By.xpath("//expandable-section/div[2]/div/content/div[1]/div[2]/textarea");

    //

    By PopupDeleteButton = By.xpath("//md-dialog-actions/button[2]");

    // Syndicate popup - Music streaming services check-boxes

    By Syndicate_to_Deezer = By.cssSelector("div.playlist-publish-dialog__services-checkboxes > md-checkbox[name=\"Deezer\"] > div.md-label > span.ng-binding.ng-scope");
    By Syndicate_to_Napster = By.cssSelector("");
    By Syndicate_to_Youtube = By.cssSelector("");
    By Syndicate_to_Soundcloud = By.cssSelector("");

    // Music streaming services check-boxes on page

    By Stream_to_Deezer_page_checkbox = By.xpath("");
    By Stream_to_Napster_page_checkbox = By.xpath("");
    By Stream_to_Soundcloud_page_checkbox = By.xpath("");
    By Stream_to_Youtube_page_checkbox = By.xpath("");

    // Automatically import and syndicate playlist

    By Dynamic_check_box = By.xpath("//playlist-edit/div/div/div[6]/div/md-checkbox/div[1]");
    By Period_to_syndicate = By.xpath("//playlist-edit/div/div/div[6]/div/div/div/div[1]");

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


    public void set_PlaylistName(String strPlaylistName) {
        $.findElement(PlaylistName).clear();
        $.findElement(PlaylistName).sendKeys(strPlaylistName);
    }

    public void set_PlaylistDescription(String strPlaylistDescription) {
        $.findElement(PlaylistDescription).clear();
        $.findElement(PlaylistDescription).sendKeys(strPlaylistDescription);
    }

    public void select_PrimaryPlaylistOwner(String PrOwner) {
        WebElement owner = $.findElement(PrimaryPlaylistOwner);
        owner.click();
        JavascriptExecutor je = (JavascriptExecutor)$;
        je.executeScript("arguments[0].scrollIntoView(true);",$.findElement(By.xpath("//span[contains(.,'"+PrOwner+"')]")));
        WebElement clickowner = $.findElement(By.xpath("//span[contains(.,'"+PrOwner+"')]"));
        clickowner.click();
    }

    public void select_SecondaryPlaylistOwner(String SecOwner) {
        WebElement owner = $.findElement(SecondaryPlaylistOwner);
        owner.click();
        JavascriptExecutor je = (JavascriptExecutor)$;
        je.executeScript("arguments[0].scrollIntoView(true);", $.findElement(By.xpath("//span[contains(., '"+SecOwner+"')]")));
        WebElement clickowner = $.findElement(By.xpath("//span[contains(.,'"+SecOwner+"')]"));
        clickowner.click();
    }

    public void activate_daily_auto_import_and_syndicating(){
        WebElement autoImportCheck = $.findElement(Dynamic_check_box);
        autoImportCheck.click();
        WebElement autoImportPeriod = $.findElement(Period_to_syndicate);
        autoImportPeriod.click();
        JavascriptExecutor je = (JavascriptExecutor)$;
        je.executeScript("arguments[0].scrollIntoView(true);", $.findElement(By.xpath("//span[contains(.,'Daily')]")));
        WebElement clickPeriod = $.findElement(By.xpath("//span[contains(.,'Daily')]"));
        clickPeriod.click();
    }

    public void syndicateTo_Deezer() {
        $.findElement(Syndicate_to_Deezer).click();
    }
}