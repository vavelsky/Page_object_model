package com.testobject.screens.Play;

import com.testobject.screens.StaticPages.AbstractScreen;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PlaylistsPage extends AbstractScreen{

    @FindBy(xpath = "//navigation-primary/div/div/h1")
    private WebElement pageTitle;

    @FindBy(xpath = "//ui-view/playlists/div/div/div[1]/h1")
    private WebElement pageSubTitle;

    // Header second level links

    @FindBy(linkText = "Playlists")
    private WebElement playlistsTopLink;

    @FindBy(linkText = "Your Sites")
    private WebElement yourSitesTopLink;

    // Search block items

    @FindBy(xpath = "//input[@type='text']")
    private WebElement searchField;

    @FindBy(xpath = "//button[contains(., 'Search')]")
    private WebElement searchButton;

    // Filter your playlist block items

    @FindBy(xpath ="//button[contains(., 'Add')]")
    private WebElement addButton;

    @FindBy(css = ".expandable-section__button-icon")
    private WebElement hideButton;

    @FindBy(css = ".ui-select-placeholder.text-muted.ng-binding")
    private WebElement playlistBrandSelector;

    @FindBy(css = ".ui-select-match-text.pull-left")
    private WebElement playSiteSelector;

    @FindBy(css = ".btn.btn-default.form-control.ui-select-toggle")
    private WebElement plylistBrandSelector;

    @FindBy(css = ".ui-select-search.input-xs.ng-pristine.ng-valid.ng-empty.ng-touched")
    private WebElement playlistCategoryInputField;

    @FindBy(css =".playlist-table__name.ng-binding")
    private WebElement playlistName;


    public PlaylistsPage(WebDriver driver) {super(driver);}

    public void findPlaylist(String strSearchField){

        searchField.sendKeys(strSearchField);
        searchButton.click();
    }

    public void selectPlaySite(String PlaySite_name){
        WebElement selPlaySite = playSiteSelector;
        selPlaySite.click();
        JavascriptExecutor je = (JavascriptExecutor)driver;
        je.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//span[contains(., '"+PlaySite_name+"')]")));
        WebElement clickPlaySiteSelector = driver.findElement(By.xpath("//span[contains(.,'"+PlaySite_name+"')]"));
        clickPlaySiteSelector.click();
    }

    public void selectPlaylistBrand(String PlaylistBrand_name){
        WebElement selPlaylistBrand = playlistBrandSelector;
        selPlaylistBrand.click();
        JavascriptExecutor je = (JavascriptExecutor)driver;
        je.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//span[contains(., '"+PlaylistBrand_name+"')]")));
        WebElement clickPlaylistBrandSelector = driver.findElement(By.xpath("//span[contains(.,'"+PlaylistBrand_name+"')]"));
        clickPlaylistBrandSelector.click();
    }

    public String gePageSubTitle() {
        return pageSubTitle.getText();
    }

    public String getPageTitle() {
        return pageTitle.getText();
    }

    public void clickHideButton() {
        hideButton.click();
    }

    public void clickPlaylitsLink() {
        playlistsTopLink.click();
    }

    public void clickAddButton() {
        addButton.click();
    }

    public void select_Category(String Category) {
        WebElement selPlaylistCategory = playlistCategoryInputField;
        selPlaylistCategory.click();
        JavascriptExecutor je = (JavascriptExecutor)driver;
        je.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//span[contains(., '"+Category+"')]")));
        WebElement clickPlaylistCategory = driver.findElement(By.xpath("//span[contains(.,'"+Category+"')]"));
        clickPlaylistCategory.click();
    }

    public String checkPlaylist_Is_Exist() {
        return playlistName.getText();
    }
}
