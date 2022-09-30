package GiftCardsActionsTests;

import io.qameta.allure.*;
import org.testng.annotations.Test;
import pages.*;
import tests.TestBase;
import utilities.Helper;

public class AddToCartTest extends TestBase {

    public static String productName = "$50 Physical Gift Card";
    public static String sender = Helper.generateRandomName(9);
    public static String message = Helper.generateRandomName(45);
    public static String recipient = Helper.generateRandomName(12);


    HomePage homeObject;
    ProductsItemPage productsItemObject;
    ProductDetailsPage productDetailsObject;
    ShoppingPage shoppingObject;
    GiftDetailsPage giftDetailsObject;

    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Add To Cart")
    @Feature("Gift Cards Actions Epic")
    @Epic("Gift Cards Actions Epic")
    public void AddToCart() throws InterruptedException {

        homeObject = new HomePage(driver);
        homeObject.clickOnItem("Gift Cards");

        productsItemObject = new ProductsItemPage(driver);
        productsItemObject.ClickOnItemName(productName);

        giftDetailsObject = new GiftDetailsPage(driver);
        giftDetailsObject.enterGiftInformation(recipient, sender, message);

        productDetailsObject = new ProductDetailsPage(driver);
        productDetailsObject.enterQuantity("2");
        productDetailsObject.clickOnAddToCart();
        productDetailsObject.VerifyThatItemAddToCart("The product has been added to your shopping cart");
        productDetailsObject.clickOnClose();

        Thread.sleep(1000);

        homeObject.clickOnShoppingCart();

        shoppingObject = new ShoppingPage(driver);
        shoppingObject.getPageTitle();
        shoppingObject.VerifyThatItemAddToShoppingCart(productName);
        shoppingObject.clickOnCheckoutButton();

        Thread.sleep(1000);

        homeObject.clickOnLogo();
    }
}
