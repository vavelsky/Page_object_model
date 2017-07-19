package com.testobject.screens.Play;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PlaylistsPage {

    WebDriver $;

    private By PageTitle = By.xpath("//navigation-primary/div/div/h1");
    private By PageSubTitle = By.xpath("//ui-view/playlists/div/div/div[1]/h1");

    // Header second level links

    private By Playlists_top_link = By.linkText("Playlists");
    private By Your_sites_top_link = By.linkText("Your Sites");

    // Search block items

    private By SearchField = By.xpath("//input[@type='text']");
    private By SearchButton = By.xpath("//button[contains(., 'Search')]");

    // Filter your playlist block items

    private By AddButton = By.xpath("//button[contains(., 'Add')]");
    private By HideButton = By.cssSelector(".expandable-section__button-icon");
    private By PlaylistBrand_selector = By.cssSelector(".ui-select-placeholder.text-muted.ng-binding");
    private By PlaySite_selector = By.cssSelector(".ui-select-match-text.pull-left");
    private By Plylist_brand_selector = By.xpath(".btn.btn-default.form-control.ui-select-toggle");
    private By Playlist_Category_input_field = By.cssSelector(".ui-select-search.input-xs.ng-pristine.ng-valid.ng-empty.ng-touched");
    private By PlaylistName = By.cssSelector(".playlist-table__name.ng-binding");


    public PlaylistsPage(WebDriver $) {
        this.$ = $;
    }

    public void findPlaylist(String strSearchField){

        $.findElement(SearchField).sendKeys(strSearchField);
        $.findElement(SearchButton).click();
    }

    public void select_PlaySite(String PlaySite_name){
        WebElement selPlaySite = $.findElement(PlaySite_selector);
        selPlaySite.click();
        JavascriptExecutor je = (JavascriptExecutor)$;
        je.executeScript("arguments[0].scrollIntoView(true);", $.findElement(By.xpath("//span[contains(., '"+PlaySite_name+"')]")));
        WebElement clickPlaySiteSelector = $.findElement(By.xpath("//span[contains(.,'"+PlaySite_name+"')]"));
        clickPlaySiteSelector.click();
    }

    public void select_Playlist_Brand(String PlaylistBrand_name){
        WebElement selPlaylistBrand = $.findElement(PlaylistBrand_selector);
        selPlaylistBrand.click();
        JavascriptExecutor je = (JavascriptExecutor)$;
        je.executeScript("arguments[0].scrollIntoView(true);", $.findElement(By.xpath("//span[contains(., '"+PlaylistBrand_name+"')]")));
        WebElement clickPlaylistBrandSelector = $.findElement(By.xpath("//span[contains(.,'"+PlaylistBrand_name+"')]"));
        clickPlaylistBrandSelector.click();
    }

    public String gePageSubTitle() {
        return $.findElement(PageSubTitle).getText();
    }

    public String getPageTitle() {
        return $.findElement(PageTitle).getText();
    }

    public void clickHideButton() {
        $.findElement(HideButton).click();
    }

    public void clickPlaylitsLink() {
        $.findElement(Playlists_top_link).click();
    }

    public void clickAddButton() {
        $.findElement(AddButton).click();
    }

    public void select_Category(String Category) {
        WebElement selPlaylistCategory = $.findElement(Playlist_Category_input_field);
        selPlaylistCategory.click();
        JavascriptExecutor je = (JavascriptExecutor)$;
        je.executeScript("arguments[0].scrollIntoView(true);", $.findElement(By.xpath("//span[contains(., '"+Category+"')]")));
        WebElement clickPlaylistCategory = $.findElement(By.xpath("//span[contains(.,'"+Category+"')]"));
        clickPlaylistCategory.click();
    }

    public String checkPlaylist_Is_Exist() {
        return $.findElement(PlaylistName).getText();
    }
}