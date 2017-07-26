package utility;

import com.testobject.screens.PitchedApp;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public abstract class AbstractTest {

    private WebDriver driver;
    protected PitchedApp app;

    @Before
    public void setUp() throws MalformedURLException{

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        app = new PitchedApp(driver);

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}
