package ApparelActionsTests;

import io.qameta.allure.*;
import org.testng.annotations.Test;
import pages.*;
import tests.TestBase;
import utilities.Helper;

public class EmailFriendTest extends TestBase {

    public static String productName = "Ray Ban Aviator Sunglasses";
    public static String emailFriend = Helper.generateRandomName(8) + "@Test.com";
    public static String message = Helper.generateRandomName(45);

    HomePage homeObject;
    ProductsPage ApparelObject;
    ProductsItemPage productsItemObject;
    ProductDetailsPage productDetailsObject;
    ProductEmailAFriendPage productEmailAFriendObject;

    @Test(priority = 4)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Add To Wish List")
    @Feature("Apparel Actions Epic")
    @Epic("Apparel Actions Epic")
    public void EmailFriend() throws InterruptedException {

        homeObject = new HomePage(driver);
        homeObject.clickOnItem("Apparel");

        ApparelObject = new ProductsPage(driver);
        ApparelObject.clickOnItem("Accessories");

        productsItemObject = new ProductsItemPage(driver);
        productsItemObject.ClickOnItemName(productName);

        productDetailsObject = new ProductDetailsPage(driver);
        productDetailsObject.clickOnEmailFriend();

        productEmailAFriendObject = new ProductEmailAFriendPage(driver);
        productEmailAFriendObject.enterInformationFromEmailFrind(emailFriend,
                RegisterationTest.UpdateAccountInformationTest.email, message);
        productEmailAFriendObject.clickOnSendEmail();

        Thread.sleep(1000);


    }
}
