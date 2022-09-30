package ShoppingCartTest;

import io.qameta.allure.*;
import org.testng.annotations.Test;
import pages.*;
import tests.TestBase;
import utilities.Helper;

public class ShoppingProductWithAsGusetUserTest extends TestBase {

    public static String productName = "Lenovo Thinkpad X1 Carbon Laptop";
    public static String fName = Helper.generateRandomName(6);
    public static String lName = Helper.generateRandomName(6);
    public static String email = Helper.generateRandomName(7) + "@Test.com";
    public static String company = Helper.generateRandomName(8);
    public static String city = Helper.generateRandomName(9);
    public static String address = Helper.generateRandomName(12);
    private static String zipCode = Helper.generateRandomNumber(4);
    public static String phoneNumber = Helper.generateRandomName(10);

    HomePage homeObject;
    ProductsPage computersObject;
    ProductsItemPage productsItemObject;
    ProductDetailsPage productDetailsObject;
    ShoppingPage shoppingObject;
    CheckoutAsGuestPage checkoutAsGuestObject;
    CheckOutPage checkOutObject;
    CheckoutCompletedPage checkoutCompletedObject;
    OrderDetailsPage orderDetailsObject;

    @Test()
    @Severity(SeverityLevel.CRITICAL)
    @Description("Shopping Product With As Guest User")
    @Feature("Shopping Product Feature")
    @Epic("Shopping Product Epic")
    public void AddToCart() throws InterruptedException {

        homeObject = new HomePage(driver);
        homeObject.clickOnItem("Computers");

        computersObject = new ProductsPage(driver);
        computersObject.clickOnItem("Notebooks");

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

        checkoutAsGuestObject = new CheckoutAsGuestPage(driver);
        checkoutAsGuestObject.clickOnCheckoutAsGuest();

        checkOutObject = new CheckOutPage(driver);
        checkOutObject.enterInformationUser(fName, lName, email, company);
        checkOutObject.enterCountry(5);
        checkOutObject.enterCityAndAddressAndPhoneNumber(city, address, zipCode, phoneNumber);
        checkOutObject.clickOnContinueButton();
        checkOutObject.clickOnContinueForShippingBtn();
        checkOutObject.clickOnContinueForPaymentMethodBtn();
        checkOutObject.clickOnContinueForPaymentInfo();
        checkOutObject.clickOnConfirmButton();

        checkoutCompletedObject = new CheckoutCompletedPage(driver);
        checkoutCompletedObject.VerifyThatOderConfirmed("Your order has been successfully processed!");
        checkoutCompletedObject.clickOnOderDetailsLink();

        orderDetailsObject = new OrderDetailsPage(driver);
        orderDetailsObject.GetOderDetailsTilePage();
        orderDetailsObject.clickOnPDFInvoiceButton();
        orderDetailsObject.clickOnPrintButton();
        orderDetailsObject.clickOnEcpButton(driver);

        Thread.sleep(2000);

    }
}
