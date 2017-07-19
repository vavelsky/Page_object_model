package com.testobject.screens.StaticPages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractScreen {

    protected final WebDriver driver;

    @FindBy(linkText = "Import")
    private WebElement importTopLink;

    public AbstractScreen(WebDriver driver){
        this.driver = driver;

        PageFactory.initElements(driver, this);
    }

    public void openPage(String Page){
       driver.get(Page);
    }
    public void openImportPage() {importTopLink.click();}
}
