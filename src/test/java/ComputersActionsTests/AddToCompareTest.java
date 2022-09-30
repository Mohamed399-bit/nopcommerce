package ComputersActionsTests;

import io.qameta.allure.*;
import org.testng.annotations.Test;
import pages.*;
import tests.TestBase;

public class AddToCompareTest extends TestBase {

    public static String productName = "Lenovo Thinkpad X1 Carbon Laptop";
    HomePage homeObject;
    ProductsPage computersObject;
    ProductsItemPage productsItemObject;
    ProductDetailsPage productDetailsObject;
    ComparePage compareObject;

    @Test(priority = 2)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Add To Compare")
    @Feature("Computers Actions Epic")
    @Epic("Computers Actions Epic")
    public void AddToCompare() throws InterruptedException {


        homeObject = new HomePage(driver);
        homeObject.clickOnItem("Computers");

        computersObject = new ProductsPage(driver);
        computersObject.clickOnItem("Notebooks");

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
