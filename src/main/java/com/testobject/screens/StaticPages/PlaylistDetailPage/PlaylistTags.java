package com.testobject.screens.StaticPages.PlaylistDetailPage;

import com.testobject.screens.StaticPages.AbstractScreen;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PlaylistTags extends AbstractScreen{

    public PlaylistTags(WebDriver driver){super(driver);}

    @FindBy(xpath = "//button[contains(., 'Save')]")
    private WebElement saveButton;

    // Select and add tags

    @FindBy(xpath = "//div/md-autocomplete/md-autocomplete-wrap/input")
    private WebElement artistTag;

    @FindBy(xpath = "//playlist-tags/div/div/div/div/div/div/span")
    private WebElement genreTag;

    @FindBy(xpath = "//playlist-tags/div/div/div[2]/div/div/div/span/span[2]/span")
    private WebElement modeTag;

    @FindBy(xpath = "//playlist-tags/div/div/div[5]/div/div/div/span/span[2]/span")
    private WebElement systemTag;

    @FindBy(xpath = "//playlist-tags/div/div/div[3]/div/div/div/span/span[2]/span")
    private WebElement themeTag;

    public void clickSave(){saveButton.click();}

    public void selectGenreTag(String select_Genre_tag){
        genreTag.click();
        JavascriptExecutor je = (JavascriptExecutor)driver;
        je.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//span[contains(., '"+select_Genre_tag+"')]")));
        WebElement clickGenreTag = driver.findElement(By.xpath("//span[contains(.,'"+select_Genre_tag+"')]"));
        clickGenreTag.click();
    }

    public void selectModeTag(String select_mode_tag){
        modeTag.click();
        JavascriptExecutor je = (JavascriptExecutor)driver;
        je.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//span[contains(., '"+select_mode_tag+"')]")));
        WebElement clickModeTag = driver.findElement(By.xpath("//span[contains(.,'"+select_mode_tag+"')]"));
        clickModeTag.click();
    }

    public void selectSystemTag(String select_system_tag){
        systemTag.click();
        JavascriptExecutor je = (JavascriptExecutor)driver;
        je.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//span[contains(., '"+select_system_tag+"')]")));
        WebElement clickSystemTag = driver.findElement(By.xpath("//span[contains(.,'"+select_system_tag+"')]"));
        clickSystemTag.click();
    }

    public void selectThemeTag(String select_theme_tag){
        themeTag.click();
        JavascriptExecutor je = (JavascriptExecutor)driver;
        je.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//span[contains(., '"+select_theme_tag+"')]")));
        WebElement clickThemeTag = driver.findElement(By.xpath("//span[contains(.,'"+select_theme_tag+"')]"));
        clickThemeTag.click();
    }

    public void selectArtistTag(String selectArtistTag){
        artistTag.click();
        artistTag.sendKeys(selectArtistTag);
        artistTag.click();
        JavascriptExecutor je = (JavascriptExecutor)driver;
        je.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//span[contains(., '"+selectArtistTag+"')]")));
        WebElement clickThemeTag = driver.findElement(By.xpath("//span[contains(.,'"+selectArtistTag+"')]"));
        clickThemeTag.click();
    }

    public void set_All_of_tags(String genreTag, String modeTag, String themeTag, String artistTag, String systemTag){
        this.selectArtistTag(artistTag);
        this.selectGenreTag(genreTag);
        this.selectModeTag(modeTag);
        this.selectThemeTag(themeTag);
        this.selectSystemTag(systemTag);
        this.clickSave();
    }

    public void scrollTo(String elementToScroll) {
        JavascriptExecutor je = (JavascriptExecutor)driver;
        je.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//label[contains(., '"+elementToScroll+"')]")));
    }



}
