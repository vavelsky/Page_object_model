package pages;

import org.apache.regexp.RE;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PlaylistPage {

    WebDriver $;
    By DeleteButton = By.xpath("//button[contains(., 'Delete')]");
    By UpdateButton = By.xpath("//button[contains(., 'Update')]");
    By ReimportButton = By.xpath("//button[contains(., 'Reimport')]");
    By SaveButton = By.xpath("//button[contains(., 'Save')]");
    By SyndicateButton = By.xpath("//button[contains(., 'Syndicate')]");
    By PlaylistPageTitle = By.xpath("//ui-view/playlist-edit/div/div/div[1]/h1/span[2]");
    By PlaylistName = By.xpath("//expandable-section/div[2]/div/content/div[1]/div[1]/input");
    By PlaylistDescription = By.xpath("//expandable-section/div[2]/div/content/div[1]/div[2]/textarea");
    By PopupDeleteButton = By.xpath("//md-dialog-actions/button[2]");
    By PrimaryPlaylistOwner = By.xpath("//playlist-edit/div/div/div[3]/div[1]/div/div/div[1]/span");
    By SecondaryPlaylistOwner = By.xpath("//playlist-edit/div/div/div[3]/div[2]/div/div/div[1]/span");

    public PlaylistPage(WebDriver $){
        this.$ = $;
    }

    //click on Delete button

    public void clickDelete(){

        $.findElement(DeleteButton).click();
    }

    public void clickDeleteOnPopup(){
        $.findElement(PopupDeleteButton).click();
    }

    //click on Update button

    public void clickUpdate(){
        $.findElement(UpdateButton).click();
    }

    //click on Reimport button

    public void clickReimport(){

        $.findElement(ReimportButton).click();
    }

    //click on Save button

    public void clickSave(){

        $.findElement(SaveButton).click();
    }

    //click on Syndicate button

    public void clickSyndicate(){

        $.findElement(SyndicateButton).click();
    }

    //get Playlist name

    public String getPlaylistPageTitle(){

        return $.findElement(PlaylistPageTitle).getText();
    }

}
