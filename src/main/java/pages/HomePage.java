package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver $;
    By homePageName = By.xpath("//navigation-primary/div/div/h1");
    By linkText = By.linkText("Import");
    By SearchField = By.xpath("//input[@type='text']");
    By SearchButton = By.xpath("//button[contains(., 'Search')]");

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
        $.findElement(linkText).click();
    }
}
