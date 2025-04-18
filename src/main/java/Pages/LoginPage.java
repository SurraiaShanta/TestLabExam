package Pages;

import Utils.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(){
        this.driver= DriverManager.getDriver();
    }

    public void EmailInput(String email){
        WebElement EmailField = driver.findElement(By.id("email"));
        EmailField.sendKeys(email);
    }

    public void PasswordInput(String password){
        WebElement PasswordField = driver.findElement(By.id("password"));
        PasswordField.sendKeys(password);
    }

    public void RememberName(){
        WebElement clickRememberName = driver.findElement(By.xpath("//*[@id=\"jet-theme-core-document\"]/div/div/div/div/div[2]/div[1]/div/div[2]/div/form/div[5]/div/div/div/label/span"));
        clickRememberName.click();
    }

    public  void  clickLogin(){
        WebElement LoginButton = driver.findElement(By.xpath("//*[@id=\"jet-theme-core-document\"]/div/div/div/div/div[2]/div[1]/div/div[2]/div/form/div[6]/div/div/button"));
        LoginButton.click();
    }

    public void login(String email, String password){
        EmailInput(email);
        PasswordInput(password);
        RememberName();
        clickLogin();

    }
}
