package tests;

import org.testng.annotations.Test;
import pages.HomePage;

public class EditAccountInformationTest extends TestBase {

    HomePage homeObject;

    @Test
    public void EditAccountInformation() {

        homeObject = new HomePage(driver);
        homeObject.clickOnMyAccount();

    }
}
