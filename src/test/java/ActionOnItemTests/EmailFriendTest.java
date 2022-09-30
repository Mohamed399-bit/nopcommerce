package ActionOnItemTests;

import io.qameta.allure.*;
import org.testng.annotations.Test;
import pages.*;
import tests.TestBase;
import utilities.Helper;

public class EmailFriendTest extends TestBase {

    public static String productName = "Lenovo Thinkpad X1 Carbon Laptop";
    public static String emailFriend = Helper.generateRandomName(8) + "@Test.com";
    public static String message = Helper.generateRandomName(45);

    HomePage homeObject;
    ProductsPage computersObject;
    ProductsItemPage productsItemObject;
    ProductDetailsPage productDetailsObject;
    ProductEmailAFriendPage productEmailAFriendObject;

    @Test(priority = 4)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Add To Wish List")
    @Feature("Actions Epic")
    @Epic("Actions Epic")
    public void EmailFriend() throws InterruptedException {

        homeObject = new HomePage(driver);
        homeObject.clickOnItem("Computers");

        computersObject = new ProductsPage(driver);
        computersObject.clickOnItem("Notebooks");

        productsItemObject = new ProductsItemPage(driver);
        productsItemObject.ClickOnItemName(productName);

        productDetailsObject = new ProductDetailsPage(driver);
        productDetailsObject.clickOnEmailFriend();

        productEmailAFriendObject = new ProductEmailAFriendPage(driver);
        productEmailAFriendObject.enterInformationFromEmailFrind(emailFriend,
                RegisterationTest.UpdateAccountInformationTest.email,message);
        productEmailAFriendObject.clickOnSendEmail();

        Thread.sleep(1000);


    }
}
