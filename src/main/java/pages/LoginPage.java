package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver $;
    By UserName = By.name("login");
    By Password = By.name("password");
    By login = By.cssSelector("button.login-form__submit");


    public LoginPage(WebDriver $) {
        this.$ = $;
    }

    public void setUserName(String strUserName) {
        $.findElement(UserName).sendKeys(strUserName);
    }

    public void setPassword(String strPassword) {
        $.findElement(Password).sendKeys(strPassword);
    }

    public void clickLogin() {
        $.findElement(login).click();
    }

    public void loginToCms(String strUserName,String strPassword){
        //Fill user name
        this.setUserName(strUserName);
        //Fill password
        this.setPassword(strPassword);
        //Click Login button
        this.clickLogin();
    }
}
