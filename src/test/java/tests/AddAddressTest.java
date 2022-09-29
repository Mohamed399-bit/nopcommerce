package tests;

import io.qameta.allure.*;
import org.testng.annotations.Test;
import pages.AddressAddPage;
import pages.AddressPage;
import pages.HomePage;
import pages.MyAccountPage;
import utilities.Helper;

public class AddAddressTest extends TestBase{

    public static String fName = Helper.generateRandomName(8);
    public static String lName = Helper.generateRandomName(9);
    public static String email1 = Helper.generateRandomName(7) + "Test.com";
    public static String company = Helper.generateRandomName(12);
    public static String city = Helper.generateRandomName(8);
    public static String address = Helper.generateRandomName(15);
    public static String zip = Helper.generateRandomNumber(4);
    public static String phone = Helper.generateRandomNumber(10);


    HomePage homeObject;
    MyAccountPage myAccountObject;
    AddressPage addressObject;
    AddressAddPage addressAddObject;

    @Test(priority = 6)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Add New Address ")
    @Feature("Register Epic")
    @Epic("Register Epic")
    public void AddNewAddress() throws InterruptedException {

        homeObject = new HomePage(driver);
        homeObject.clickOnMyAccount();

        myAccountObject = new MyAccountPage(driver);
        myAccountObject.clickOnAddressLink();

        addressObject = new AddressPage(driver);
        addressObject.clickOnAddNewButton();

        addressAddObject = new AddressAddPage(driver);
        addressAddObject.AddAddressAndEmailAndCompany(fName,lName,email1,company);
        addressAddObject.AddCountry(5);
        addressAddObject.AddCityAndAddressAndZipAndPhone(city,address,zip,phone);
        addressAddObject.clickOnSaveButton();

        Thread.sleep(7000);
    }
}
