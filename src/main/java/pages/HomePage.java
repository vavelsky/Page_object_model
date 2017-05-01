package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver $;
    By homePageName = By.xpath("//navigation-primary/div/div/h1");
    By linkText = By.linkText("Import");

    public HomePage(WebDriver $) {
        this.$ = $;
    }

    public String getHomePageName() {
        return $.findElement(homePageName).getText();
    }

    public void clickImport() {
        $.findElement(linkText).click();
    }
}
