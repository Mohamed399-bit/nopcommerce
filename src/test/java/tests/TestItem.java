package tests;

import org.testng.annotations.Test;
import pages.ProductsPage;
import pages.HomePage;
import pages.ProductsItemPage;

public class TestItem extends TestBase{

    HomePage homeObject;
    ProductsPage computersObject;
    ProductsItemPage productsItemObject;

    @Test
    public void test() throws InterruptedException {

        homeObject = new HomePage(driver);
        homeObject.getItemSize();
        homeObject.clickOnItem("Apparel");


        computersObject = new ProductsPage(driver);
        computersObject.getItemsSize();
        computersObject.clickOnItem("Clothing");

        productsItemObject = new ProductsItemPage(driver);
        productsItemObject.getItemSize();
        productsItemObject.ClickOnItemName("Oversized Women T-Shirt");

        Thread.sleep(7000);
    }
}
