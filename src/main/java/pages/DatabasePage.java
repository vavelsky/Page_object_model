package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DatabasePage {

    WebDriver $;

    By DatabasePageTitle = By.xpath("//database/div/div/div[1]/h1");
    By FilterByParrentBrand = By.xpath("");
    By FilterByPlaylistBrand = By.xpath("");
    By FilterByTeam = By.xpath("");
    By PlaylistStatus = By.xpath("//playlists-table/table/tbody/tr[3]/td[6]/span/span");
    By SearchButton = By.xpath("//button[contains(., 'Search')]");
    By SearchInput = By.xpath("//div/div/div[2]/playlists-filter/div/form/div/input");
    By ShowMoreButton = By.xpath("//ui-view/database/div/div/div[4]/button");


    public DatabasePage(WebDriver $){
        this.$ = $;
    }

    public String getDatabasePageTitle(){
        return $.findElement(DatabasePageTitle).getText();
    }

    public void clickSearch(){
        $.findElement(SearchButton).click();
    }
}
