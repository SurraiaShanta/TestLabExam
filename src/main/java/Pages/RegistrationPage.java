package Pages;

import Utils.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class RegistrationPage {
    private WebDriver driver;

    public RegistrationPage(){
        this.driver = DriverManager.getDriver();
    }

   public void setUsername(String username){
       // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        //WebElement UserName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"username\"]")));
        WebElement UserName = driver.findElement(By.xpath("//*[@id=\"username\"]"));
        UserName.clear();
        UserName.sendKeys(username);
    }

    public void SetEmailAddress(String email){
        WebElement EmailAddress = driver.findElement(By.id("email"));
        EmailAddress.clear();
        EmailAddress.sendKeys(email);
    }

    public void SetPassword(String password){
        WebElement Password = driver.findElement(By.id("password"));
        Password.clear();
        Password.sendKeys(password);
    }

    public void SetConfirmPassword(String confirmpassword){
        WebElement ConfrimPassword = driver.findElement(By.id("conf-pass"));
        ConfrimPassword.clear();
        ConfrimPassword.sendKeys(confirmpassword);
    }

    public void ClickRegistrationNow() throws InterruptedException {
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        //WebElement RegistrationButtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"jet-theme-core-document\"]/div/div/div/div/div/div/div[2]/div[4]/div/form/div[5]/div/div/button")));

        WebElement RegistrationButtn = driver.findElement(By.xpath("//*[@id=\"jet-theme-core-document\"]/div/div/div/div/div/div/div[2]/div[4]/div/form/div[5]/div/div/button"));
        Actions action = new Actions(driver);
        action.moveToElement(RegistrationButtn).perform();
        Thread.sleep(5000);
        action.doubleClick(RegistrationButtn).perform();
        //RegistrationButtn.click();
    }

    public void Registration(String username, String email, String password, String confirmpassword) throws InterruptedException {
        setUsername(username);
        SetEmailAddress(email);
        SetPassword(password);
        SetConfirmPassword(confirmpassword);
        ClickRegistrationNow();
    }
}
