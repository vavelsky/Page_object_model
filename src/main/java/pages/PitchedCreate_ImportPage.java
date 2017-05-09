package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PitchedCreate_ImportPage {

    WebDriver $;
    By linkText = By.linkText("Import");
    By ImportPageName = By.xpath("//div[@class='container']/div/div/h1");

    By ImportButton = By.xpath("//button[contains(., 'Import')]");

    By NapsterInputField = By.xpath("//playlist-import/div/div/div[2]/div/div[3]/div/input");
    By DeezerInputField = By.xpath("//playlist-import/div/div/div[2]/div/div[2]/div/input");
    By SpotifyInputField = By.xpath("//playlist-import/div/div/div[2]/div/div[1]/input");
    By YoutubeInputField = By.xpath("//playlist-import/div/div/div[2]/div/div[4]/div/input");
    By SoundcloudInputField = By.xpath("//ui-view/playlist-import/div/div/div[2]/div/div[5]/div/input");
    By PlaylistBrandDrop = By.xpath("//playlist-import/div/div/div[2]/div/div[6]/div[2]/div[1]");
    By DigsterFmPlaylistBrand = By.cssSelector("#ui-select-choices-row-0-31 > span.ui-select-choices-row-inner > span.ng-binding.ng-scope");
    By NoSpotifyTokenPlaylistBrand = By.cssSelector("#ui-select-choices-row-0-2 > span.ui-select-choices-row-inner > span.ng-binding.ng-scope");
    By Notification = By.xpath("//body/md-toast/div/span");


    public PitchedCreate_ImportPage(WebDriver $) {
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

    public void select_PlaylistBrand(String PlBrand){
        WebElement brand = $.findElement(PlaylistBrandDrop);
        brand.click();
        brand.click();
        JavascriptExecutor je = (JavascriptExecutor)$;
        je.executeScript("arguments[0].scrollIntoView(true);",$.findElement(By.xpath("//span[contains(.,'"+PlBrand+"')]")));
        WebElement clickbrand = $.findElement(By.xpath("//span[contains(.,'"+PlBrand+"')]"));
        clickbrand.click();
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
