package com.testobject.screens.Create;

import com.testobject.screens.StaticPages.AbstractScreen;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DatabasePage extends AbstractScreen{

    @FindBy(xpath = "//database/div/div/div[1]/h1")
    private WebElement databasePageTitle;

    @FindBy(xpath = "//playlists-table/table/tbody/tr[2]/td/p")
    private WebElement emptyPlaylistlist;

    @FindBy(xpath = "//playlists-table/table/tbody/tr[2]/td/p")
    private  WebElement filterByParrentBrand;

    @FindBy(xpath = "")
    private WebElement filterByPlaylistBrand;

    @FindBy(xpath = "")
    private WebElement filterByTeam;

    @FindBy(xpath = "//body/md-toast/div/span")
    private WebElement Notification;

    @FindBy(xpath = "//tr[@class='playlist-row ng-scope']/td/a")
    private WebElement Playlist;

    @FindBy(xpath = "//playlists-table/table/tbody/tr[3]/td[1]/a")
    private WebElement playlistNameOnList;

    @FindBy(xpath = "//playlists-table/table/tbody/tr[3]/td[6]/span/span")
    private WebElement playlistStatus;

    @FindBy(xpath = "//button[contains(., 'Publish')]")
    private WebElement publishButton;

    @FindBy(xpath = "//button[contains(., 'Search')]")
    private WebElement searchButton;

    @FindBy(xpath = "//input[@type='text']")
    private WebElement searchInput;

    @FindBy(xpath = "//ui-view/database/div/div/div[4]/button")
    private WebElement showMoreButton;

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
