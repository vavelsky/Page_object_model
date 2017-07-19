package utility;

import com.testobject.screens.PitchedApp;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

public abstract class AbstractTest {

    private WebDriver driver;
    protected PitchedApp app;

    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws MalformedURLException{

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        app = new PitchedApp(driver);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
    }

}
}
