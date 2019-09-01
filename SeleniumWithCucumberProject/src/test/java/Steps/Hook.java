package Steps;

import Driver.DriverUtils;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hook extends DriverUtils {

    //This is the class for opening and closing the browser

    private DriverUtils driver;

    public Hook(DriverUtils driver) {
        this.driver = driver;
    }

    @Before
    public void InitializeTest(Scenario scenario) {

        //ChromeDriver
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Fitor\\Desktop\\Java Automation Tester\\Selenium\\chromedriver.exe");
        driver.Driver = new ChromeDriver();
        driver.Driver.manage().window().maximize();
    }

    @After
    public void TearDown(Scenario scenario) {
        driver.Driver.close();
    }
}
