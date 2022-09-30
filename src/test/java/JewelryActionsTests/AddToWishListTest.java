package JewelryActionsTests;

import io.qameta.allure.*;
import org.testng.annotations.Test;
import pages.*;
import tests.TestBase;

public class AddToWishListTest extends TestBase {

    public static String productName = "Flower Girl Bracelet";
    HomePage homeObject;
    ProductsItemPage productsItemObject;
    ProductDetailsPage productDetailsObject;
    WishListPage wishListObject;

    @Test(priority = 3)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Add To Wish List")
    @Feature("Jewelry Actions Epic")
    @Epic("Jewelry Actions Epic")
    public void AddToWishList() throws InterruptedException {

        homeObject = new HomePage(driver);
        homeObject.clickOnItem("Jewelry");

        productsItemObject = new ProductsItemPage(driver);
        productsItemObject.ClickOnItemName(productName);

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
