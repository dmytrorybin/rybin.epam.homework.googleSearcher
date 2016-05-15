package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import org.junit.*;


public class AbstractTest {
    protected WebDriver driver;

    @Before
    public void initEnv()
    {

//        File file = new File("\\src\\test\resources\\chromedriver.exe");
//        System.setProperty("webdriver.chrome.driver",file.getAbsolutePath());
//        driver = new ChromeDriver();
    	
    	driver = new FirefoxDriver();
    	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @After
    public void shutEnv()
    {
        if (driver != null)
            driver.quit();
    }
} 