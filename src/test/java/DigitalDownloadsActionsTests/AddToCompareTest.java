package DigitalDownloadsActionsTests;

import io.qameta.allure.*;
import org.testng.annotations.Test;
import pages.*;
import tests.TestBase;

public class AddToCompareTest extends TestBase {

    public static String productName = "Night Visions";
    HomePage homeObject;
    ProductsPage computersObject;
    ProductsItemPage productsItemObject;
    ProductDetailsPage productDetailsObject;
    ComparePage compareObject;

    @Test(priority = 2)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Add To Compare")
    @Feature("Digital Downloads Actions Epic")
    @Epic("Digital Downloads Actions Epic")
    public void AddToCompare() throws InterruptedException {


        homeObject = new HomePage(driver);
        homeObject.clickOnItem("Digital downloads");

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
