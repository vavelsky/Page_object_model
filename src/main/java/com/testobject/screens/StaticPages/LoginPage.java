package com.testobject.screens.StaticPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractScreen{

    @FindBy(name = "login")
    private WebElement userName;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(css = "button.login-form__submit")
    private WebElement loginBnn;


    public LoginPage(WebDriver driver) {super(driver);}

    public void setUserName(String strUserName) {userName.sendKeys(strUserName);}

    public void setPassword(String strPassword) {password.sendKeys(strPassword);}

    public void clickLogin() {loginBnn.click();}

    public void loginToCms(String strUserName,String strPassword){
        //Fill user name
        this.setUserName(strUserName);
        //Fill password
        this.setPassword(strPassword);
        //Click Login button
        this.clickLogin();

    }

}
