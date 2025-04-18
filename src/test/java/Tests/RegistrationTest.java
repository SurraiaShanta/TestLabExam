package Tests;


import Pages.RegistrationPage;
import Utils.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.security.PublicKey;


public class RegistrationTest extends BaseTest {

    @Test(priority = 1)
    public void Invalidregistration() throws InterruptedException {
        RegistrationPage regi = new RegistrationPage();
        regi.Registration("Admin_123456", "shgmail.com","QAH12harbor","QAHharbor");

        Thread.sleep(3000);
        String ActualURL=driver.getCurrentUrl();
        String ExpectedURL = "https://labsqajobs.qaharbor.com/candidate-registration/?status=success";
        Assert.assertEquals(ActualURL,ExpectedURL,"Registration error");
    }



    @Test(priority = 2)
    public void validRegistration(){
       RegistrationPage regis = new RegistrationPage();
       regis.Registration("Admin_1234568","shanta@gmail.com", "QAH132harbor","QAH132harbor");

        String ActualURL = driver.getCurrentUrl();
        String ExpectedURL = "https://labsqajobs.qaharbor.com/candidate-registration/?status=success";
        Assert.assertEquals(ActualURL,ExpectedURL,"Registration error");
    }

}
