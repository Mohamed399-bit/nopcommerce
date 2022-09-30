package ElectronicsActionsTests;

import io.qameta.allure.*;
import org.testng.annotations.Test;
import pages.*;
import tests.TestBase;

public class AddToCartTest extends TestBase {

    public static String productName = "HTC One Mini Blue";

    HomePage homeObject;
    ProductsPage ElectronicsObject;
    ProductsItemPage productsItemObject;
    ProductDetailsPage productDetailsObject;
    ShoppingPage shoppingObject;

    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Add To Cart")
    @Feature("Electronics Actions Epic")
    @Epic("Electronics Actions Epic")
    public void AddToCart() throws InterruptedException {

        homeObject = new HomePage(driver);
        homeObject.clickOnItem("Electronics");

        ElectronicsObject = new ProductsPage(driver);
        ElectronicsObject.clickOnItem("Cell phones");

        productsItemObject = new ProductsItemPage(driver);
        productsItemObject.ClickOnItemName(productName);

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
