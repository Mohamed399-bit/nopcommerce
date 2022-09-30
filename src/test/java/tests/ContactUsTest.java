package tests;

import org.testng.annotations.Test;
import pages.ContactUsPage;
import pages.ContactUsSuccsessPage;
import pages.HomePage;
import utilities.Helper;

public class ContactUsTest extends TestBase {

    public static String fName = Helper.generateRandomName(6);
    public static String lName = Helper.generateRandomName(7);
    public static String email = Helper.generateRandomName(8) + "@Test.com";
    public static String enquiry = Helper.generateRandomName(50);

    HomePage homeObject;
    ContactUsPage contactUsObject;
    ContactUsSuccsessPage contactUsSuccsessObject;

    @Test(priority = 3)

    public void contactUs() throws InterruptedException {

        homeObject = new HomePage(driver);
        homeObject.clickOnContactUs();

        contactUsObject = new ContactUsPage(driver);
        contactUsObject.enterName(fName + " " + lName);
        contactUsObject.enterEmail(email);
        contactUsObject.enterEnquiry(enquiry);
        contactUsObject.clickOnSubmit();

        contactUsSuccsessObject = new ContactUsSuccsessPage(driver);
        contactUsSuccsessObject.verifyThatContactSend("Your enquiry has been successfully sent to the store owner.");

        Thread.sleep(200);
    }
}
