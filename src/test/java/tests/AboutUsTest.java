package tests;

import org.testng.annotations.Test;
import pages.AboutUsPage;
import pages.HomePage;

public class AboutUsTest extends TestBase{

    HomePage homeObject;
    AboutUsPage aboutUsObject;
    @Test(priority = 4)
    public void openAboutUsTest(){

        homeObject = new HomePage(driver);
        homeObject.clickOnAboutUs();

        aboutUsObject = new AboutUsPage(driver);
        aboutUsObject.VerifyThatAboutUsOpen("About us");


    }
}
