package com.testobject.screens.StaticPages.PlaylistDetailPage;

import com.testobject.screens.StaticPages.AbstractScreen;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PlaylistStreamingServices extends AbstractScreen{

    public PlaylistStreamingServices(WebDriver driver){super(driver);}

    // Streaming service playlists block

    @FindBy(className = "expandable-section__button-icon")
    private WebElement ssHideButton;

    @FindBy()
    private WebElement ssReimportAppleMusicButton;

    @FindBy()
    private WebElement ssReimportDeezerButton;

    @FindBy()
    private WebElement ssReimportNapsterButton;

    @FindBy()
    private WebElement ssReimportSoundcloudButton;

    @FindBy(xpath = "//expandable-section/div[2]/div/content/div[1]/span[3]/span[1]/button")
    private WebElement ssReimportSpotifyButton;

    @FindBy(xpath = "")
    private WebElement ssReimportYouTubeButton;

    @FindBy(xpath = "//expandable-section/div[2]/div/content/div[6]/span[2]/span[1]/button")
    private WebElement ssEditAppleMusicButton;

    @FindBy(xpath = "//expandable-section/div[2]/div/content/div[2]/span[3]/span[1]/button")
    private WebElement ssEditDeezerButton;

    @FindBy(xpath = "//expandable-section/div[2]/div/content/div[3]/span[3]/span[1]/button")
    private WebElement ssEditNapsterButton;

    @FindBy(xpath = "//expandable-section/div[2]/div/content/div[5]/span[3]/span[1]/button")
    private WebElement ssEditSoundcloudButton;

    @FindBy(xpath = "//expandable-section/div[2]/div/content/div[1]/span[3]/span[2]/button")
    private WebElement ssEditSpotifyButton;

    @FindBy(xpath = "//expandable-section/div[2]/div/content/div[4]/span[3]/span[1]/button")
    private WebElement ssEditYouTubeButton;

    @FindBy()
    private WebElement ssViewAppleMusicButton;

    @FindBy()
    private WebElement ssViewDeezerButton;

    @FindBy()
    private WebElement ssViewNapsterButton;

    @FindBy()
    private WebElement ssViewSoundcloudButton;

    @FindBy(xpath = "//expandable-section/div[2]/div/content/div[1]/span[3]/span[3]/a")
    private WebElement ssViewSpotifyButton;

    @FindBy()
    private WebElement ssViewYouTubeButton;

    @FindBy(xpath = "//div/md-dialog/div[2]/div/md-input-container/input")
    private WebElement inputMusicUrl;

    // Music streaming services check-boxes on page

    @FindBy(xpath = "")
    private WebElement streamToDeezerPageCheckbox;

    @FindBy(xpath = "")
    private WebElement streamToNapsterPageCheckbox;

    @FindBy()
    private WebElement streamToSoundcloudPageCheckbox;

    @FindBy()
    private WebElement streamToYoutubePageCheckbox;

    // Automatically import and syndicate playlist

    @FindBy(xpath = "//playlist-edit/div/div/div[6]/div/md-checkbox/div[1]")
    private WebElement dynamicCheckBox;

    @FindBy(xpath = "//playlist-edit/div/div/div[6]/div/div/div/div[1]")
    private WebElement periodToSyndicate;

    public void activateDailyAutoImportAndSyndicating(){
        dynamicCheckBox.click();
        periodToSyndicate.click();
        JavascriptExecutor je = (JavascriptExecutor)driver;
        je.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//span[contains(.,'Daily')]")));
        WebElement clickPeriod = driver.findElement(By.xpath("//span[contains(.,'Daily')]"));
        clickPeriod.click();
    }

    public void activateWeeklyAutoImportAndSyndicating(){
        dynamicCheckBox.click();
        periodToSyndicate.click();
        JavascriptExecutor je = (JavascriptExecutor)driver;
        je.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//span[contains(.,'Weekly')]")));
        WebElement clickPeriod = driver.findElement(By.xpath("//span[contains(.,'Weekly')]"));
        clickPeriod.click();
    }

    public void activateMonthlyAutoImportAndSyndicating(){
        dynamicCheckBox.click();
        periodToSyndicate.click();
        JavascriptExecutor je = (JavascriptExecutor)driver;
        je.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//span[contains(.,'Monthly')]")));
        WebElement clickPeriod = driver.findElement(By.xpath("//span[contains(.,'Monthly')]"));
        clickPeriod.click();
    }


}
