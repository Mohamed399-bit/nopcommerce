package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CheckOutPage extends PageBase {
    public CheckOutPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "BillingNewAddress_FirstName")
    WebElement firstNameTxt;

    @FindBy(id = "BillingNewAddress_LastName")
    WebElement lastNameTxt;

    @FindBy(id = "BillingNewAddress_Email")
    WebElement emailTxt;

    @FindBy(id = "BillingNewAddress_Company")
    WebElement companyTxt;

    @FindBy(id = "BillingNewAddress_CountryId")
    WebElement countryList;

    @FindBy(id = "BillingNewAddress_City")
    WebElement cityTxt;

    @FindBy(id = "BillingNewAddress_Address1")
    WebElement address1Txt;

    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    WebElement zipCodeTxt;

    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement phoneNumberTxt;

    @FindBy(xpath = "//*[@id=\"billing-buttons-container\"]/button[4]")
    WebElement continueBtn;

    @FindBy(xpath = "//*[@id=\"shipping-method-buttons-container\"]/button")
    WebElement continueForShippingBtn;

    @FindBy(xpath = "//*[@id=\"payment-method-buttons-container\"]/button")
    WebElement continueForPaymentMethodBtn;

    @FindBy(xpath = "//*[@id=\"payment-info-buttons-container\"]/button")
    WebElement continueForPaymentInfo;

    @FindBy(xpath = "//*[@id=\"confirm-order-buttons-container\"]/button")
    WebElement confirmBtn;

    public void enterInformationUser(String fName, String lName, String email, String company) {

        setTextWebElement(firstNameTxt, fName);
        setTextWebElement(lastNameTxt, lName);
        setTextWebElement(emailTxt, email);
        setTextWebElement(companyTxt, company);
    }

    public void enterCountry(int index) {

        Select country = new Select(countryList);
        country.selectByIndex(index);
    }

    public void enterCityAndAddressAndPhoneNumber(String city, String address, String zipCode, String phone) {
        setTextWebElement(cityTxt, city);
        setTextWebElement(address1Txt, address);
        setTextWebElement(zipCodeTxt, zipCode);
        setTextWebElement(phoneNumberTxt, phone);
    }

    public void clickOnContinueButton() {
        clickButton(continueBtn);
    }

    public void clickOnContinueForShippingBtn() {
        clickButton(continueForShippingBtn);
    }

    public void clickOnContinueForPaymentMethodBtn() {
        clickButton(continueForPaymentMethodBtn);
    }

    public void clickOnContinueForPaymentInfo() {
        clickButton(continueForPaymentInfo);
    }

    public void clickOnConfirmButton() {
        clickButton(confirmBtn);
    }


}
