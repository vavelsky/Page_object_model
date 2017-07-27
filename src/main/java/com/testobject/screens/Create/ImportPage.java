package com.testobject.screens.Create;

import com.testobject.screens.StaticPages.AbstractScreen;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ImportPage extends AbstractScreen{

    //buttons, links, other

    @FindBy(linkText = "Import")
    private WebElement importTopLink;

    @FindBy(xpath = "//button[contains(., 'Import')]")
    private WebElement importButton;

    @FindBy(xpath = "//div[@class='container']/div/div/h1")
    private WebElement pageTitle;

    //input fields

    @FindBy(xpath = "//playlist-import/div/div/div[2]/div/div[3]/div/input")
    private WebElement napsterInputField;

    @FindBy(xpath = "//playlist-import/div/div/div[2]/div/div[2]/div/input")
    private WebElement deezerInputField;

    @FindBy(xpath = "//playlist-import/div/div/div[2]/div/div[1]/input")
    private WebElement spotifyInputField;

    @FindBy(xpath = "//playlist-import/div/div/div[2]/div/div[4]/div/input")
    private WebElement youtubeInputField;

    @FindBy(xpath = "//ui-view/playlist-import/div/div/div[2]/div/div[5]/div/input")
    private WebElement soundcloudInputField;

    //

    @FindBy(xpath = "//playlist-import/div/div/div[2]/div/div[7]/div[2]/div/span/span[2]")
    private WebElement playlistBrandDrop;

    By DigsterFmPlaylistBrand = By.cssSelector("#ui-select-choices-row-0-31 > span.ui-select-choices-row-inner > span.ng-binding.ng-scope");
    By NoSpotifyTokenPlaylistBrand = By.cssSelector("#ui-select-choices-row-0-2 > span.ui-select-choices-row-inner > span.ng-binding.ng-scope");

    @FindBy(xpath = "//body/md-toast/div/span")
    private WebElement notificationPopup;

    public ImportPage(WebDriver driver) {super(driver);}

    public void setSpotifyURI(String strSpotifyURI){
        spotifyInputField.clear();
        spotifyInputField.sendKeys(strSpotifyURI);
    }

    public void setDeezer(String strDeezerURL){
        deezerInputField.sendKeys(strDeezerURL);
    }

    public void setNapster(String strNapsterURL){

        napsterInputField.sendKeys(strNapsterURL);
    }

    public void setYoutube(String strYoutubeURL){

        youtubeInputField.sendKeys(strYoutubeURL);
    }

    public void setSoundCloud(String strSoundcloudURL){
        soundcloudInputField.sendKeys(strSoundcloudURL);
    }

    public void selectPlaylistBrand(String PlBrand){
        WebElement brand = playlistBrandDrop;
        brand.click();
        brand.click();
        JavascriptExecutor je = (JavascriptExecutor)driver;
        je.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//span[contains(.,'"+PlBrand+"')]")));
        WebElement clickbrand = driver.findElement(By.xpath("//span[contains(.,'"+PlBrand+"')]"));
        clickbrand.click();
    }

    public void selectPlaylistBrandWithoutToken(){

        driver.findElement(NoSpotifyTokenPlaylistBrand).click();
    }

    public String getPageTitle(){

        return pageTitle.getText();
    }

    public void clickBrands(){

        playlistBrandDrop.click();
    }

    public void clickImport() {

        importButton.click();
    }

    public String getNotificationPopup(){

        return notificationPopup.getText();
    }
}
