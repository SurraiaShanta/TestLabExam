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

    public void ClickRegisterNow(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement RegisterNowButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div[2]/div[2]/div/div/a/span/span")));
        RegisterNowButton.click();
    }

    public void ClickCandidateButton(){
        WebElement CandidateButton = driver.findElement(By.xpath("//*[@id=\"jet-theme-core-document\"]/div/div/div/div/div/div/div/div[3]/div/div[2]/div/div/div/a/div[4]"));
        CandidateButton.click();
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

    public void ClickRegistrationNow(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement RegistrationButtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/div/div/div/div/div[2]/div[4]/div/form/div[5]/div/div/button")));
        //WebElement RegistrationButtn = driver.findElement(By.xpath("//*[@id=\"jet-theme-core-document\"]/div/div/div/div/div/div/div[2]/div[4]/div/form/div[5]/div/div/button"));
        RegistrationButtn.click();
    }

    public void Registration(String username, String email, String password, String confirmpassword){
        ClickRegisterNow();
        ClickCandidateButton();
        setUsername(username);
        SetEmailAddress(email);
        SetPassword(password);
        SetConfirmPassword(confirmpassword);
        ClickRegistrationNow();
    }
}
