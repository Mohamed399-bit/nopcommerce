package GiftCardsActionsTests;

import io.qameta.allure.*;
import org.testng.annotations.Test;
import pages.*;
import tests.TestBase;
import utilities.Helper;

public class AddToWishListTest extends TestBase {

    public static String productName = "$50 Physical Gift Card";
    public static String sender = Helper.generateRandomName(9);
    public static String message = Helper.generateRandomName(45);
    public static String recipient = Helper.generateRandomName(12);

    HomePage homeObject;
    ProductsItemPage productsItemObject;
    ProductDetailsPage productDetailsObject;
    WishListPage wishListObject;
    GiftDetailsPage giftDetailsObject;

    @Test(priority = 3)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Add To Wish List")
    @Feature("Gift Cards Actions Epic")
    @Epic("Gift Cards Actions Epic")
    public void AddToWishList() throws InterruptedException {


        homeObject = new HomePage(driver);
        homeObject.clickOnItem("Gift Cards");

        productsItemObject = new ProductsItemPage(driver);
        productsItemObject.ClickOnItemName(productName);

        giftDetailsObject = new GiftDetailsPage(driver);
        giftDetailsObject.enterGiftInformation(recipient, sender, message);

        productDetailsObject = new ProductDetailsPage(driver);
        productDetailsObject.clickOnAddToWishList();
        productDetailsObject.VerifyThatItemAddToWatchList("The product has been added to your wishlist");
        productDetailsObject.clickOnClose();

        Thread.sleep(1000);

        homeObject.clickOnWishList();

        wishListObject = new WishListPage(driver);
        wishListObject.getPageTitle();
        wishListObject.VerifyThatItemAddToWishList(productName);

        Thread.sleep(1000);

        homeObject.clickOnLogo();

    }
}
