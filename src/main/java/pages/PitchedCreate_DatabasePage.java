package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PitchedCreate_DatabasePage {

    WebDriver $;

    By DatabasePageTitle = By.xpath("//database/div/div/div[1]/h1");
    By EmptyPlaylistlist = By.xpath("//playlists-table/table/tbody/tr[2]/td/p");
    By FilterByParrentBrand = By.xpath("");
    By FilterByPlaylistBrand = By.xpath("");
    By FilterByTeam = By.xpath("");
    By Notification = By.xpath("//body/md-toast/div/span");
    By Playlist = By.xpath("//tr[@class='playlist-row ng-scope']/td/a");
    By PlaylistNameOnList = By.xpath("//playlists-table/table/tbody/tr[3]/td[1]/a");
    By PlaylistStatus = By.xpath("//playlists-table/table/tbody/tr[3]/td[6]/span/span");
    By PublishButton = By.xpath("//button[contains(., 'Publish')]");
    By SearchButton = By.xpath("//button[contains(., 'Search')]");
    By SearchInput = By.xpath("//input[@type='text']");
    By ShowMoreButton = By.xpath("//ui-view/database/div/div/div[4]/button");


    public PitchedCreate_DatabasePage(WebDriver $){
        this.$ = $;
    }

    public String getDatabasePageTitle(){
        return $.findElement(DatabasePageTitle).getText();
    }

    public String getPlaylistListExeption(){
        return $.findElement(EmptyPlaylistlist).getText();
    }

    public String getPlaylistNameOnList(){
        return $.findElement(PlaylistNameOnList).getText();
    }

    public String getPlaylistStatus(){
        return $.findElement(PlaylistStatus).getText();
    }

    public void openPlaylist(){
        $.findElement(Playlist).click();
    }

    public void clickSearch(){
        $.findElement(SearchButton).click();
    }

    public void clickPublish(){
        $.findElement(PublishButton).click();
    }

    public String getNotification(){
        return $.findElement(Notification).getText();
    }
}
