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
        driver.get("https://labsqajobs.qaharbor.com/candidate-registration/");
        RegistrationPage regi = new RegistrationPage();
        Thread.sleep(2000);
        regi.Registration("Admiqntt_123654", "shgmail.com","QAH12harbor","QAHharbor");

        String ExpectedURL = "https://labsqajobs.qaharbor.com/candidate-registration/?status=success";
        String ActualURL=driver.getCurrentUrl();
        Assert.assertNotEquals(ActualURL,ExpectedURL,"Registration error");
    }



    @Test(priority = 1)
    public void validRegistration() throws InterruptedException {
        driver.get("https://labsqajobs.qaharbor.com/candidate-registration/");
       RegistrationPage regis = new RegistrationPage();
       regis.Registration("Admin65432","Admin65432@gmail.com", "Admin65432","Admin65432");
        Thread.sleep(5000);

        String ExpectedURL = "https://labsqajobs.qaharbor.com/candidate-registration/?status=success";
        String ActualURL = driver.getCurrentUrl();
        Thread.sleep(5000);
        Assert.assertEquals(ActualURL,ExpectedURL,"Registration error");
    }

}
