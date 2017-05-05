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
    By DigsterFmPlaylistBrand = By.cssSelector("#ui-select-choices-row-0-31 > span.ui-select-choices-row-inner > span.ng-binding.ng-scope");
    By NoSpotifyTokenPlaylistBrand = By.cssSelector("#ui-select-choices-row-0-2 > span.ui-select-choices-row-inner > span.ng-binding.ng-scope");
    By Notification = By.xpath("//body/md-toast/div/span");


    public ImportPage(WebDriver $) {
        this.$ = $;
    }

    public void set_SpotifyInputField(String strSpotifyURI){

        $.findElement(SpotifyInputField).sendKeys(strSpotifyURI);
    }

    public void set_DeezerInputField(String strDeezerURL){

        $.findElement(DeezerInputField).sendKeys(strDeezerURL);
    }

    public void set_NapsterInputField(String strNapsterURL){

        $.findElement(NapsterInputField).sendKeys(strNapsterURL);
    }

    public void set_YoutubeInputField(String strYoutubeURL){

        $.findElement(YoutubeInputField).sendKeys(strYoutubeURL);
    }

    public void set_SoundcloudInputField(String strSoundcloudURL){
        $.findElement(SoundcloudInputField).sendKeys(strSoundcloudURL);
    }

    public void selectDigsterFmPlaylistBrand(){
        $.findElement(DigsterFmPlaylistBrand).click();
    }

    public void selectPlaylistBrandWithoutToken(){

        $.findElement(NoSpotifyTokenPlaylistBrand).click();
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

    public String getNotification(){

        return $.findElement(Notification).getText();
    }
}
