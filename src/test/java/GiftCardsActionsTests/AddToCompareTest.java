package GiftCardsActionsTests;

import io.qameta.allure.*;
import org.testng.annotations.Test;
import pages.ComparePage;
import pages.HomePage;
import pages.ProductDetailsPage;
import pages.ProductsItemPage;
import tests.TestBase;

public class AddToCompareTest extends TestBase {

    public static String productName = "$50 Physical Gift Card";
    HomePage homeObject;
    ProductsItemPage productsItemObject;
    ProductDetailsPage productDetailsObject;
    ComparePage compareObject;

    @Test(priority = 2)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Add To Compare")
    @Feature("Gift Cards Actions Epic")
    @Epic("Gift Cards Actions Epic")
    public void AddToCompare() throws InterruptedException {


        homeObject = new HomePage(driver);
        homeObject.clickOnItem("Gift Cards");

        productsItemObject = new ProductsItemPage(driver);
        productsItemObject.ClickOnItemName(productName);

        productDetailsObject = new ProductDetailsPage(driver);
        productDetailsObject.clickOnAddToCompare();
        productDetailsObject.VerifyThatItemAddToCompare("The product has been added to your product comparison");
        productDetailsObject.clickOnCompareLink();

        compareObject = new ComparePage(driver);
        compareObject.getPageTitle();

        homeObject.clickOnLogo();

        Thread.sleep(1000);


    }
}
