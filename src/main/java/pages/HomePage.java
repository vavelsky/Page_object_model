package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver $;
    By homePageName = By.xpath("//navigation-primary/div/div/h1");
    By Importlink = By.linkText("Import");
    By SearchField = By.xpath("//input[@type='text']");
    By SearchButton = By.xpath("//button[contains(., 'Search')]");
    By Notification = By.xpath("//body/md-toast/div/span");
    By PlayLink = By.linkText("Play");

    public HomePage(WebDriver $) {
        this.$ = $;
    }

    public String getHomePageName() {
        return $.findElement(homePageName).getText();
    }

    public void findPlaylist(String strSearchField){
        $.findElement(SearchField).sendKeys(strSearchField);
    }

    public void clickSearch(){
        $.findElement(SearchButton).click();
    }

    public void clickImport() {
        $.findElement(Importlink).click();
    }

    public void waitNotification(){
        $.findElement(Notification);
    }

    public void clickPlay(){
        $.findElement(PlayLink).click();
    }
}
