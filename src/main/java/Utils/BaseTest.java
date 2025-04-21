package Utils;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
   public static WebDriver driver;

    @BeforeSuite
    public void setup(){
        driver = DriverManager.getDriver();
        driver.get("https://labsqajobs.qaharbor.com/");
    }

    @BeforeMethod
    public static void manageWindows(){
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }

    @AfterSuite
    public void tearDown(){
        DriverManager.quiteDriver();
    }
}
