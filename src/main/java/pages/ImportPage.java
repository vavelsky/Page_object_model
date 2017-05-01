package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ImportPage {

    WebDriver $;
    By linkText = By.linkText("Import");
    By ImportPageName = By.xpath("//div[@class='container']/div/div/h1");
    By ImportButton = By.xpath("//button[contains(., 'Import')]");
    By NapsterInputField = By.xpath("//playlist-import/div/div/div[2]/div/div[3]/div/input");
    By DeezerInputField = By.xpath("//playlist-import/div/div/div[2]/div/div[2]/div/input");
    By SpotifyInputField = By.xpath("//playlist-import/div/div/div[2]/div/div[1]/input");
    By YoutubeInputField = By.xpath("//playlist-import/div/div/div[2]/div/div[4]/div/input");
    By SoundcloudInputField = By.xpath("//ui-view/playlist-import/div/div/div[2]/div/div[5]/div/input");
    By PlaylistBrandDrop = By.cssSelector("span.ui-select-match-text.pull-left");
    By PlaylistBrand = By.cssSelector("#ui-select-choices-row-0-31 > span.ui-select-choices-row-inner > span.ng-binding.ng-scope");
    By Notification = By.xpath("//body/md-toast/div/span");


    public ImportPage(WebDriver $) {
        this.$ = $;
    }

    public void setSpotifyInputField(String strSpotifyURI){
        $.findElement(SpotifyInputField).sendKeys(strSpotifyURI);
    }

    public void setDeezerInputField(String strDeezerURL){
        $.findElement(DeezerInputField).sendKeys(strDeezerURL);
    }

    public void setNapsterInputField(String strNapsterURL){
        $.findElement(NapsterInputField).sendKeys(strNapsterURL);
    }

    public void setYoutubeInputField(String strYoutubeURL){
        $.findElement(YoutubeInputField).sendKeys(strYoutubeURL);
    }

    public void setSoundcloudInputField(String strSoundcloudURL){
        $.findElement(SoundcloudInputField).sendKeys(strSoundcloudURL);
    }

    public void selectPlaylistBrand(){
        $.findElement(PlaylistBrand).click();
    }

    public String getImportPageName(){
       return $.findElement(ImportPageName).getText();
    }

    public void clickBrands(){
        $.findElement(PlaylistBrandDrop).click();
    }

    public void clickImport() {
        $.findElement(ImportButton).click();
    }

    public void waitNotification(){
        $.findElement(Notification);
    }
}
