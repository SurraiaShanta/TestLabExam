package Tests;

import Pages.LoginPage;
import Utils.BaseTest;
import net.bytebuddy.build.Plugin;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    @Test(priority = 2)
    public void validlogin() throws InterruptedException {
        LoginPage log = new LoginPage();
        log.login(" probaldighi53@gmail.com", "QAH123harbor");
        Thread.sleep(2000);

        String ActualURL=driver.getCurrentUrl();
        String ExpectedURL = "https://labsqajobs.qaharbor.com/account/";
        Assert.assertEquals(ActualURL,ExpectedURL,"Login error");
    }

    @Test(priority = 1)
    public void invalidLogin() throws InterruptedException {
            LoginPage log = new LoginPage();
            log.login(" probaldighi53@gmail.com", "QAH123harborrr");
            Thread.sleep(2000);

            String ActualURL=driver.getCurrentUrl();
            String ExpectedURL = "https://labsqajobs.qaharbor.com/account/";
            Assert.assertEquals(ActualURL,ExpectedURL,"Login error");
    }


}
