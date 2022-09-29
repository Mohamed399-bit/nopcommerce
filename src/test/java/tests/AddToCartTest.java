package tests;

import org.testng.annotations.Test;
import pages.*;

public class AddToCartTest extends TestBase{

    public static String productName = "Lenovo Thinkpad X1 Carbon Laptop";

    HomePage homeObject;
    ProductsPage computersObject;
    ProductsItemPage productsItemObject;
    ProductDetailsPage productDetailsObject;
    ShoppingPage shoppingObject;
    @Test
    public void AddToCart() throws InterruptedException {

        homeObject = new HomePage(driver);
        homeObject.getItemSize();
        homeObject.clickOnItem("Computers");

        computersObject = new ProductsPage(driver);
        computersObject.getItemsSize();
        computersObject.clickOnItem("Notebooks");

        productsItemObject = new ProductsItemPage(driver);
        productsItemObject.getItemSize();
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

        Thread.sleep(1000);

        homeObject.clickOnLogo();
    }
}
