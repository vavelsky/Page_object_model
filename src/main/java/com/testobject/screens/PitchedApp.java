package com.testobject.screens;

import com.testobject.screens.Admin.EditUserPage;
import com.testobject.screens.Admin.HomeAdmin;
import com.testobject.screens.Admin.UsersPage;
import com.testobject.screens.Create.*;
import com.testobject.screens.Play.HomePlay;
import com.testobject.screens.Play.PlaylistsPage;
import com.testobject.screens.Play.YourSitesPage;
import com.testobject.screens.StaticPages.HomePage;
import com.testobject.screens.StaticPages.LoginPage;
import com.testobject.screens.StaticPages.PlaylistDetailPage.CreateInPitched.Playlist;
import com.testobject.screens.StaticPages.PlaylistDetailPage.CreateInPitched.TrackSearch;
import com.testobject.screens.StaticPages.PlaylistDetailPage.PlaylistHelpElements;
import com.testobject.screens.StaticPages.PlaylistDetailPage.PlaylistInfo;
import com.testobject.screens.StaticPages.PlaylistDetailPage.PlaylistStreamingServices;
import com.testobject.screens.StaticPages.PlaylistDetailPage.PlaylistTags;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PitchedApp {

    private final WebDriver driver;

    public PitchedApp(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public HomePage homePage(){return new HomePage(driver);}
    public LoginPage loginPage(){return new LoginPage(driver);}

    //PLAYLIST DETAIL PAGE

    public PlaylistHelpElements playlistDetailPage(){return new PlaylistHelpElements(driver);}
    public PlaylistInfo playlistInfo(){return new PlaylistInfo(driver);}
    public PlaylistTags playlistTags(){return new PlaylistTags(driver);}
    public PlaylistStreamingServices playlistStreamingServices(){return new PlaylistStreamingServices(driver);}
    public Playlist playlistCreateInPitched(){return new Playlist(driver);}
    public TrackSearch trackSearchCreateInPitched(){return new TrackSearch(driver);}

    //CREATE

    public CreatePage createPage(){return new CreatePage(driver);}
    public DatabasePage databasePage(){return new DatabasePage(driver);}
    public ExportPage exportPage(){return new ExportPage(driver);}
    public HomeCreate homeCreate(){return new HomeCreate(driver);}
    public ImportPage importPage(){return new ImportPage(driver);}

    //PLAY

    public HomePlay homePlay(){return new HomePlay(driver);}
    public YourSitesPage yourSitesPage(){return new YourSitesPage(driver);}
    public PlaylistsPage playlistsPage(){return new PlaylistsPage(driver);}

    //ADMIN

    public HomeAdmin homeAdmin(){return new HomeAdmin(driver);}
    public UsersPage usersPage(){return new UsersPage(driver);}
    public EditUserPage editUserPage(){return new EditUserPage(driver);}

}
