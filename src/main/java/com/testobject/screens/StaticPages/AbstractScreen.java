package com.testobject.screens.StaticPages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractScreen {

    protected final WebDriver driver;

    @FindBy(className = "login-page__img")
    private WebElement topLogo;

    @FindBy(linkText = "Import")
    private WebElement importTopLink;

    @FindBy(linkText = "Optimize")
    private WebElement optimizeTopLink;

    @FindBy(linkText = "Create")
    private WebElement createTopLink;

    @FindBy(linkText = "Play")
    private WebElement playTopLink;

    @FindBy(xpath = "//navigation-primary/div/div/ul[2]/li[1]/span")
    private WebElement adminTopLink;

    @FindBy(xpath = "//navigation-primary/div/div/ul[2]/li[2]/span")
    private WebElement logoutTopLink;


    public AbstractScreen(WebDriver driver){
        this.driver = driver;

        PageFactory.initElements(driver, this);
    }

    public void openPage(String Page){
       driver.get(Page);
    }

    public void openAdminPage(){adminTopLink.click();}
    public void openCreatePage() {createTopLink.click();}
    public void openImportPage() {importTopLink.click();}
    public void openOptimizePage() {optimizeTopLink.click();}
    public void openPlayPage(){playTopLink.click();}

    public void logOut(){
        logoutTopLink.click();
        topLogo.isDisplayed();
    }
}
