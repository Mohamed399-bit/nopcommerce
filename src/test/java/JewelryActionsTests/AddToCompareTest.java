package JewelryActionsTests;

import io.qameta.allure.*;
import org.testng.annotations.Test;
import pages.*;
import tests.TestBase;

public class AddToCompareTest extends TestBase {

    public static String productName = "Flower Girl Bracelet";
    HomePage homeObject;
    ProductsItemPage productsItemObject;
    ProductDetailsPage productDetailsObject;
    ComparePage compareObject;

    @Test(priority = 2)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Add To Compare")
    @Feature("Jewelry Actions Epic")
    @Epic("Jewelry Actions Epic")
    public void AddToCompare() throws InterruptedException {


        homeObject = new HomePage(driver);
        homeObject.clickOnItem("Jewelry");

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
