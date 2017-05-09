package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import sun.jvm.hotspot.utilities.Assert;

public class PlaylistDetailPage {

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

    // Select and add tags

    By Artist_tag = By.xpath("//div/md-autocomplete/md-autocomplete-wrap/input");
    By Genre_tag = By.xpath("//playlist-tags/div/div/div/div/div/div/span");
    By Mode_tag = By.xpath("//playlist-tags/div/div/div[2]/div/div/div/span/span[2]/span");
    By System_tag = By.xpath("//playlist-tags/div/div/div[5]/div/div/div/span/span[2]/span");
    By Theme_tag = By.xpath("//playlist-tags/div/div/div[3]/div/div/div/span/span[2]/span");

    // Do not import Spotify description (check-box)

    By Spotify_description_checkbox = By.xpath("//expandable-section/div[2]/div/content/div[1]/div[3]/md-checkbox/div[1]");

    // Streaming service playlists block

    By ss_Hide_button = By.className("expandable-section__button-icon");

    By ss_Reimport_Apple_music_button = By.xpath("");
    By ss_Reimport_Deezer_button = By.xpath("");
    By ss_Reimport_Napster_button = By.xpath("");
    By ss_Reimport_Soundcloud_button = By.xpath("");
    By ss_Reimport_Spotify_button = By.xpath("//expandable-section/div[2]/div/content/div[1]/span[3]/span[1]/button");
    By ss_Reimport_YouTube_button = By.xpath("");

    By ss_Edit_Apple_music_button = By.xpath("//expandable-section/div[2]/div/content/div[6]/span[2]/span[1]/button");
    By ss_Edit_Deezer_button = By.xpath("//expandable-section/div[2]/div/content/div[2]/span[3]/span[1]/button");
    By ss_Edit_Napster_button = By.xpath("//expandable-section/div[2]/div/content/div[3]/span[3]/span[1]/button");
    By ss_Edit_Soundcloud_button = By.xpath("//expandable-section/div[2]/div/content/div[5]/span[3]/span[1]/button");
    By ss_Edit_Spotify_button = By.xpath("//expandable-section/div[2]/div/content/div[1]/span[3]/span[2]/button");
    By ss_Edit_YouTube_button = By.xpath("//expandable-section/div[2]/div/content/div[4]/span[3]/span[1]/button");

    By ss_View_Apple_music_button = By.xpath("");
    By ss_View_Deezer_button = By.xpath("");
    By ss_View_Napster_button = By.xpath("");
    By ss_view_Soundcloud_button = By.xpath("");
    By ss_View_Spotify_button = By.xpath("//expandable-section/div[2]/div/content/div[1]/span[3]/span[3]/a");
    By ss_View_YouTube_button = By.xpath("");

    By input_Music_url = By.xpath("//div/md-dialog/div[2]/div/md-input-container/input");


    public PlaylistDetailPage(WebDriver $) {

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

    public void activate_weekly_auto_import_and_syndicating(){
        WebElement autoImportCheck = $.findElement(Dynamic_check_box);
        autoImportCheck.click();
        WebElement autoImportPeriod = $.findElement(Period_to_syndicate);
        autoImportPeriod.click();
        JavascriptExecutor je = (JavascriptExecutor)$;
        je.executeScript("arguments[0].scrollIntoView(true);", $.findElement(By.xpath("//span[contains(.,'Weekly')]")));
        WebElement clickPeriod = $.findElement(By.xpath("//span[contains(.,'Weekly')]"));
        clickPeriod.click();
    }

    public void activate_monthly_auto_import_and_syndicating(){
        WebElement autoImportCheck = $.findElement(Dynamic_check_box);
        autoImportCheck.click();
        WebElement autoImportPeriod = $.findElement(Period_to_syndicate);
        autoImportPeriod.click();
        JavascriptExecutor je = (JavascriptExecutor)$;
        je.executeScript("arguments[0].scrollIntoView(true);", $.findElement(By.xpath("//span[contains(.,'Monthly')]")));
        WebElement clickPeriod = $.findElement(By.xpath("//span[contains(.,'Monthly')]"));
        clickPeriod.click();
    }

    public void syndicateTo_Deezer() {
        $.findElement(Syndicate_to_Deezer).click();
    }

    public void select_Genre_tag(String select_Genre_tag){
        WebElement selGerTag = $.findElement(Genre_tag);
        selGerTag.click();
        JavascriptExecutor je = (JavascriptExecutor)$;
        je.executeScript("arguments[0].scrollIntoView(true);", $.findElement(By.xpath("//span[contains(., '"+select_Genre_tag+"')]")));
        WebElement clickGenreTag = $.findElement(By.xpath("//span[contains(.,'"+select_Genre_tag+"')]"));
        clickGenreTag.click();
    }

    public void select_Mode_tag(String select_mode_tag){
        WebElement selModeTag = $.findElement(Mode_tag);
        selModeTag.click();
        JavascriptExecutor je = (JavascriptExecutor)$;
        je.executeScript("arguments[0].scrollIntoView(true);", $.findElement(By.xpath("//span[contains(., '"+select_mode_tag+"')]")));
        WebElement clickModeTag = $.findElement(By.xpath("//span[contains(.,'"+select_mode_tag+"')]"));
        clickModeTag.click();
    }

    public void select_System_tag(String select_system_tag){
        WebElement selSystemTag = $.findElement(System_tag);
        selSystemTag.click();
        JavascriptExecutor je = (JavascriptExecutor)$;
        je.executeScript("arguments[0].scrollIntoView(true);", $.findElement(By.xpath("//span[contains(., '"+select_system_tag+"')]")));
        WebElement clickSystemTag = $.findElement(By.xpath("//span[contains(.,'"+select_system_tag+"')]"));
        clickSystemTag.click();
    }

    public void select_Theme_tag(String select_theme_tag){
        WebElement selThemeTag = $.findElement(Theme_tag);
        selThemeTag.click();
        JavascriptExecutor je = (JavascriptExecutor)$;
        je.executeScript("arguments[0].scrollIntoView(true);", $.findElement(By.xpath("//span[contains(., '"+select_theme_tag+"')]")));
        WebElement clickThemeTag = $.findElement(By.xpath("//span[contains(.,'"+select_theme_tag+"')]"));
        clickThemeTag.click();
    }

    public void select_Artist_tag(String select_artist_tag){
        WebElement selGerTag = $.findElement(Artist_tag);
        selGerTag.click();
        selGerTag.sendKeys(select_artist_tag);
        selGerTag.click();
        JavascriptExecutor je = (JavascriptExecutor)$;
        je.executeScript("arguments[0].scrollIntoView(true);", $.findElement(By.xpath("//span[contains(., '"+select_artist_tag+"')]")));
        WebElement clickThemeTag = $.findElement(By.xpath("//span[contains(.,'"+select_artist_tag+"')]"));
        clickThemeTag.click();
    }

    public void scroll_to(String element_to_scroll) {
        JavascriptExecutor je = (JavascriptExecutor)$;
        je.executeScript("arguments[0].scrollIntoView(true);", $.findElement(By.xpath("//label[contains(., '"+element_to_scroll+"')]")));
    }

    public void set_All_of_tags(String Genre_tag, String Mode_tag, String Theme_tag, String Artist_tag, String System_tag){
        this.select_Artist_tag(Artist_tag);
        this.select_Genre_tag(Genre_tag);
        this.select_Mode_tag(Mode_tag);
        this.select_Theme_tag(Theme_tag);
        this.select_System_tag(System_tag);
        this.clickSave();
    }

    public void select_Do_not_import_Spotify_description(){
        $.findElement(Spotify_description_checkbox).click();
    }
}