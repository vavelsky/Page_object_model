package com.testobject.screens.Create;

import com.testobject.screens.StaticPages.AbstractScreen;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DatabasePage extends AbstractScreen{
git config user.name
    @FindBy(xpath = "//database/div/div/div[1]/h1")
    private WebElement databasePageTitle;

    By emptyPlaylistlist = By.xpath("//playlists-table/table/tbody/tr[2]/td/p");
    By FilterByParrentBrand = By.xpath("");
    By FilterByPlaylistBrand = By.xpath("");
    By FilterByTeam = By.xpath("");
    By Notification = By.xpath("//body/md-toast/div/span");
    By Playlist = By.xpath("//tr[@class='playlist-row ng-scope']/td/a");
    By playlistNameOnList = By.xpath("//playlists-table/table/tbody/tr[3]/td[1]/a");
    By playlistStatus = By.xpath("//playlists-table/table/tbody/tr[3]/td[6]/span/span");
    By publishButton = By.xpath("//button[contains(., 'Publish')]");
    By searchButton = By.xpath("//button[contains(., 'Search')]");
    By SearchInput = By.xpath("//input[@type='text']");
    By ShowMoreButton = By.xpath("//ui-view/database/div/div/div[4]/button");


    public DatabasePage(WebDriver driver) {super(driver);}

    public String getDatabasePageTitle(){
        return databasePageTitle.getText();
    }

    public String getPlaylistListExeption(){
        return emptyPlaylistlist.getText();
    }

    public String getPlaylistNameOnList(){
        return playlistNameOnList.getText();
    }

    public String getPlaylistStatus(){
        return playlistStatus.getText();
    }

    public void openPlaylist(){
        Playlist.click();
    }

    public void clickSearch(){
        searchButton.click();
    }

    public void clickPublish(){
        publishButton.click();
    }

    public String getNotification(){
        return Notification.getText();
    }
}
