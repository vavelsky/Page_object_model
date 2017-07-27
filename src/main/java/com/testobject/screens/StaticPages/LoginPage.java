package com.testobject.screens.StaticPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.testobject.screens.Data.Credentials.*;
import static com.testobject.screens.Data.allStrings.cmsDev;

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

    //login methods

    public void loginAsSuperAdmin(){
        this.openPage(cmsDev);
        this.setUserName(superAdminLogin);
        this.setPassword(superAdminPassword);
        this.clickLogin();
    }

    public void loginAsPlayEditor(){
        this.openPage(cmsDev);
        this.setUserName(playEditorLogin);
        this.setPassword(playEditorPassword);
        this.clickLogin();
    }

    public void loginAsPlaySiteAdmin(){
        this.openPage(cmsDev);
        this.setUserName(playSiteAdminLogin);
        this.setPassword(playSiteAdminPassword);
        this.clickLogin();
    }

    public void loginAsPlayListProgrammer(){
        this.openPage(cmsDev);
        this.setUserName(playListPragrammerLogin);
        this.setPassword(playListPragrammerPassword);
        this.clickLogin();
    }

    public void loginAsTeamAdmin(){
        this.openPage(cmsDev);
        this.setUserName(teamAdminLogin);
        this.setPassword(teamAdminPassword);
        this.clickLogin();
    }

    public void loginAsParrentBrandAdmin(){
        this.openPage(cmsDev);
        this.setUserName(parrentBrandAdminLogin);
        this.setPassword(parrentBrandAdminPassword);
        this.clickLogin();
    }
}
