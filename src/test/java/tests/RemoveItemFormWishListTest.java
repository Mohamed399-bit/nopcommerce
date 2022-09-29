package tests;

import org.testng.annotations.Test;
import pages.*;

public class RemoveItemFormWishListTest extends TestBase{

    public static String productName = "Lenovo Thinkpad X1 Carbon Laptop";
    HomePage homeObject;
    ProductsPage computersObject;
    ProductsItemPage productsItemObject;
    ProductDetailsPage productDetailsObject;
    WishListPage wishListObject;

    @Test
    public void RemoveItem() throws InterruptedException {

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
        productDetailsObject.clickOnAddToWishList();
        productDetailsObject.VerifyThatItemAddToWatchList("The product has been added to your wishlist");

        Thread.sleep(4000);

        homeObject.clickOnWishList();

        wishListObject = new WishListPage(driver);
        wishListObject.getPageTitle();
        wishListObject.RemoveFromWishList(productName);

        Thread.sleep(4000);
    }
}
