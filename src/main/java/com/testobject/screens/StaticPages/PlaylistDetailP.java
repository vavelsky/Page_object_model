package com.testobject.screens.StaticPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PlaylistDetailP extends AbstractScreen{

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

    //Playlist owners

    @FindBy(xpath = "//playlist-edit/div/div/div[3]/div[1]/div/div/div[1]/span/span[2]")
    private WebElement primaryPlaylistOwner;

    @FindBy(xpath = "//playlist-edit/div/div/div[3]/div[2]/div/div/div[1]/span")
    private WebElement secondaryPlaylistOwner;

    //Playlist text fields for edit

    @FindBy(xpath = "//expandable-section/div[2]/div/content/div[1]/div[1]/input")
    private WebElement playlistName;

    @FindBy(xpath = "//expandable-section/div[2]/div/content/div[1]/div[2]/textarea")
    private WebElement playlistDescription;

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

    // Music streaming services check-boxes on page

    @FindBy(xpath = "")
    private WebElement streamToDeezerPageCheckbox;

    @FindBy(xpath = "")
    private WebElement streamToNapsterPageCheckbox;

    @FindBy()
    private WebElement streamToSoundcloudPageCheckbox;

    @FindBy()
    private WebElement streamToYoutubePageCheckbox;

    // Automatically import and syndicate playlist

    @FindBy(xpath = "//playlist-edit/div/div/div[6]/div/md-checkbox/div[1]")
    private WebElement dynamicCheckBox;

    @FindBy(xpath = "//playlist-edit/div/div/div[6]/div/div/div/div[1]")
    private WebElement periodToSyndicate;

    // Select and add tags

    @FindBy(xpath = "//div/md-autocomplete/md-autocomplete-wrap/input")
    private WebElement artistTag;

    @FindBy(xpath = "//playlist-tags/div/div/div/div/div/div/span")
    private WebElement genreTag;

    @FindBy(xpath = "//playlist-tags/div/div/div[2]/div/div/div/span/span[2]/span")
    private WebElement modeTag;

    @FindBy(xpath = "//playlist-tags/div/div/div[5]/div/div/div/span/span[2]/span")
    private WebElement systemTag;

    @FindBy(xpath = "//playlist-tags/div/div/div[3]/div/div/div/span/span[2]/span")
    private WebElement themeTag;

    // Do not import Spotify description (check-box)

    @FindBy(xpath = "//expandable-section/div[2]/div/content/div[1]/div[3]/md-checkbox/div[1]")
    private WebElement spotifyDescriptionCheckbox;

    // Streaming service playlists block

    @FindBy(className = "expandable-section__button-icon")
    private WebElement ssHideButton;

    @FindBy()
    private WebElement ssReimportAppleMusicButton;

    @FindBy()
    private WebElement ssReimportDeezerButton;

    @FindBy()
    private WebElement ssReimportNapsterButton;

    @FindBy()
    private WebElement ssReimportSoundcloudButton;

    @FindBy(xpath = "//expandable-section/div[2]/div/content/div[1]/span[3]/span[1]/button")
    private WebElement ssReimportSpotifyButton;

    @FindBy(xpath = "")
    private WebElement ssReimportYouTubeButton;

    @FindBy(xpath = "//expandable-section/div[2]/div/content/div[6]/span[2]/span[1]/button")
    private WebElement ssEditAppleMusicButton;

    @FindBy(xpath = "//expandable-section/div[2]/div/content/div[2]/span[3]/span[1]/button")
    private WebElement ssEditDeezerButton;

    @FindBy(xpath = "//expandable-section/div[2]/div/content/div[3]/span[3]/span[1]/button")
    private WebElement ssEditNapsterButton;

    @FindBy(xpath = "//expandable-section/div[2]/div/content/div[5]/span[3]/span[1]/button")
    private WebElement ssEditSoundcloudButton;

    @FindBy(xpath = "//expandable-section/div[2]/div/content/div[1]/span[3]/span[2]/button")
    private WebElement ssEditSpotifyButton;

    @FindBy(xpath = "//expandable-section/div[2]/div/content/div[4]/span[3]/span[1]/button")
    private WebElement ssEditYouTubeButton;

    @FindBy()
    private WebElement ssViewAppleMusicButton;

    @FindBy()
    private WebElement ssViewDeezerButton;

    @FindBy()
    private WebElement ssViewNapsterButton;

    @FindBy()
    private WebElement ssViewSoundcloudButton;

    @FindBy(xpath = "//expandable-section/div[2]/div/content/div[1]/span[3]/span[3]/a")
    private WebElement ssViewSpotifyButton;

    @FindBy()
    private WebElement ssViewYouTubeButton;

    @FindBy(xpath = "//div/md-dialog/div[2]/div/md-input-container/input")
    private WebElement inputMusicUrl;


    public PlaylistDetailP(WebDriver driver) {super(driver);}

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

    public void activateDailyAutoImportAndSyndicating(){
        dynamicCheckBox.click();
        periodToSyndicate.click();
        JavascriptExecutor je = (JavascriptExecutor)driver;
        je.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//span[contains(.,'Daily')]")));
        WebElement clickPeriod = driver.findElement(By.xpath("//span[contains(.,'Daily')]"));
        clickPeriod.click();
    }

    public void activateWeeklyAutoImportAndSyndicating(){
        dynamicCheckBox.click();
        periodToSyndicate.click();
        JavascriptExecutor je = (JavascriptExecutor)driver;
        je.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//span[contains(.,'Weekly')]")));
        WebElement clickPeriod = driver.findElement(By.xpath("//span[contains(.,'Weekly')]"));
        clickPeriod.click();
    }

    public void activateMonthlyAutoImportAndSyndicating(){
        dynamicCheckBox.click();
        periodToSyndicate.click();
        JavascriptExecutor je = (JavascriptExecutor)driver;
        je.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//span[contains(.,'Monthly')]")));
        WebElement clickPeriod = driver.findElement(By.xpath("//span[contains(.,'Monthly')]"));
        clickPeriod.click();
    }

    public void syndicateTo_Deezer() {
        syndicateToDeezer.click();
    }

    public void selectGenreTag(String select_Genre_tag){
        genreTag.click();
        JavascriptExecutor je = (JavascriptExecutor)driver;
        je.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//span[contains(., '"+select_Genre_tag+"')]")));
        WebElement clickGenreTag = driver.findElement(By.xpath("//span[contains(.,'"+select_Genre_tag+"')]"));
        clickGenreTag.click();
    }

    public void selectModeTag(String select_mode_tag){
        modeTag.click();
        JavascriptExecutor je = (JavascriptExecutor)driver;
        je.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//span[contains(., '"+select_mode_tag+"')]")));
        WebElement clickModeTag = driver.findElement(By.xpath("//span[contains(.,'"+select_mode_tag+"')]"));
        clickModeTag.click();
    }

    public void selectSystemTag(String select_system_tag){
        systemTag.click();
        JavascriptExecutor je = (JavascriptExecutor)driver;
        je.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//span[contains(., '"+select_system_tag+"')]")));
        WebElement clickSystemTag = driver.findElement(By.xpath("//span[contains(.,'"+select_system_tag+"')]"));
        clickSystemTag.click();
    }

    public void selectThemeTag(String select_theme_tag){
        themeTag.click();
        JavascriptExecutor je = (JavascriptExecutor)driver;
        je.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//span[contains(., '"+select_theme_tag+"')]")));
        WebElement clickThemeTag = driver.findElement(By.xpath("//span[contains(.,'"+select_theme_tag+"')]"));
        clickThemeTag.click();
    }

    public void selectArtistTag(String selectArtistTag){
        artistTag.click();
        artistTag.sendKeys(selectArtistTag);
        artistTag.click();
        JavascriptExecutor je = (JavascriptExecutor)driver;
        je.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//span[contains(., '"+selectArtistTag+"')]")));
        WebElement clickThemeTag = driver.findElement(By.xpath("//span[contains(.,'"+selectArtistTag+"')]"));
        clickThemeTag.click();
    }

    public void scrollTo(String elementToScroll) {
        JavascriptExecutor je = (JavascriptExecutor)driver;
        je.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//label[contains(., '"+elementToScroll+"')]")));
    }

    public void set_All_of_tags(String genreTag, String modeTag, String themeTag, String artistTag, String systemTag){
        this.selectArtistTag(artistTag);
        this.selectGenreTag(genreTag);
        this.selectModeTag(modeTag);
        this.selectThemeTag(themeTag);
        this.selectSystemTag(systemTag);
        this.clickSave();
    }

    public void selectDoNotImportSpotifyDescription(){
        spotifyDescriptionCheckbox.click();
    }
}