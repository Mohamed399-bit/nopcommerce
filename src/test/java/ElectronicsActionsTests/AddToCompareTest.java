package ElectronicsActionsTests;

import io.qameta.allure.*;
import org.testng.annotations.Test;
import pages.*;
import tests.TestBase;

public class AddToCompareTest extends TestBase {

    public static String productName = "HTC One Mini Blue";
    HomePage homeObject;
    ProductsPage ElectronicsObject;
    ProductsItemPage productsItemObject;
    ProductDetailsPage productDetailsObject;
    ComparePage compareObject;

    @Test(priority = 2)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Add To Compare")
    @Feature("Electronics Actions Epic")
    @Epic("Electronics Actions Epic")
    public void AddToCompare() throws InterruptedException {


        homeObject = new HomePage(driver);
        homeObject.clickOnItem("Electronics");

        ElectronicsObject = new ProductsPage(driver);
        ElectronicsObject.clickOnItem("Cell phones");

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
