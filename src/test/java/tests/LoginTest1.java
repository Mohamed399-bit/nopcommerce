package tests;

import org.testng.annotations.Test;
import pages.loginPage2;

public class LoginTest1 extends TestBase{

    loginPage2 loginObject;

    @Test
    public void login() throws InterruptedException {

        loginObject = new loginPage2(driver);
        loginObject.login("Admin", "admin123");

        Thread.sleep(7000);

    }
}
