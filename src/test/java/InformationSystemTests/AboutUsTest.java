package InformationSystemTests;

import io.qameta.allure.*;
import org.testng.annotations.Test;
import pages.AboutUsPage;
import pages.HomePage;
import tests.TestBase;

public class AboutUsTest extends TestBase {

    HomePage homeObject;
    AboutUsPage aboutUsObject;

    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("About Us")
    @Feature("Information System Epic")
    @Epic("Information System Epic")
    public void openAboutUsTest() {

        homeObject = new HomePage(driver);
        homeObject.clickOnAboutUs();

        aboutUsObject = new AboutUsPage(driver);
        aboutUsObject.VerifyThatAboutUsOpen("About us");


    }
}
