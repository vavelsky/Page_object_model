package com.testobject.screens.Create;

import com.testobject.screens.StaticPages.AbstractScreen;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by dimakostiukevych on 7/5/17.
 */
public class HomeCreate extends AbstractScreen{

    @FindBy(xpath = "//navigation-primary/div/div/ul[2]/li[1]/span")
    private WebElement adminTopLink;

    public HomeCreate(WebDriver driver) {super(driver);}

    public void openAdmin(){
        adminTopLink.click();
    }
}
