package Tests;

import Pages.LoginPage;
import Utils.BaseTest;
import net.bytebuddy.build.Plugin;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

     @Test(priority = 2)
    public void validlogin() throws InterruptedException {
        driver.get("https://labsqajobs.qaharbor.com/login/");
        LoginPage log = new LoginPage();
        log.login("Admin65432@gmail.com", "Admin65432");
        Thread.sleep(2000);

        String ActualURL=driver.getCurrentUrl();
        Thread.sleep(2000);
        String ExpectedURL = "https://labsqajobs.qaharbor.com/account/";
        Assert.assertEquals(ActualURL,ExpectedURL,"Login error");
    }

    @Test(priority = 1)
    public void invalidLogin() throws InterruptedException {
        driver.get("https://labsqajobs.qaharbor.com/login/");
            LoginPage log = new LoginPage();
            log.login(" QAharbor53@gmail.com", "QAH123harborrr");
            Thread.sleep(2000);

            String ActualURL=driver.getCurrentUrl();
            Thread.sleep(2000);
            String ExpectedURL = "https://labsqajobs.qaharbor.com/account/";
            Assert.assertNotEquals(ActualURL,ExpectedURL,"Login error");
    }


}
