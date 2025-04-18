package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
    public static WebDriver driver;

    private DriverManager(){

    }

    public static WebDriver getDriver(){
        if(driver==null){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void quiteDriver(){
        if(driver!=null){
            driver.quit();
        }
    }
}
