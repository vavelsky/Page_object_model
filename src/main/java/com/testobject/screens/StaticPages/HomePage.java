package com.testobject.screens.StaticPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends AbstractScreen{

    By homePageName = By.xpath("//navigation-primary/div/div/h1");
    By Importlink = By.linkText("Import");
    By SearchField = By.xpath("//input[@type='text']");
    By SearchButton = By.xpath("//button[contains(., 'Search')]");
    By Notification = By.xpath("//body/md-toast/div/span");
    By PlayLink = By.linkText("Play");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public String getHomePageName() {
        return driver.findElement(homePageName).getText();
    }

    public void findPlaylist(String strSearchField){
        driver.findElement(SearchField).sendKeys(strSearchField);
    }

    public void clickSearch(){
        driver.findElement(SearchButton).click();
    }

    public void clickImport() {
        driver.findElement(Importlink).click();
    }

    public void waitNotification(){
        driver.findElement(Notification);
    }

    public void clickPlay(){
        driver.findElement(PlayLink).click();
    }
}
