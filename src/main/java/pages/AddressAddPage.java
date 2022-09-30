package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AddressAddPage extends PageBase {
    public AddressAddPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "Address_FirstName")
    WebElement addressFirstNameTxt;

    @FindBy(id = "Address_LastName")
    WebElement addressLastNameTxt;

    @FindBy(id = "Address_Email")
    WebElement addressEmailTxt;

    @FindBy(id = "Address_Company")
    WebElement addressCompanyTxt;

    @FindBy(id = "Address_CountryId")
    WebElement addressCountryId;

    @FindBy(id = "Address_City")
    WebElement addressCityTxt;

    @FindBy(id = "Address_Address1")
    WebElement addressAddress1Txt;

    @FindBy(id = "Address_ZipPostalCode")
    WebElement addressZipPostalCodeTxt;

    @FindBy(id = "Address_PhoneNumber")
    WebElement addressPhoneNumberTxt;

    @FindBy(css = "button.button-1.save-address-button")
    WebElement saveBtn;

    public void AddAddressAndEmailAndCompany(String fName, String lName, String email, String company) {

        setTextWebElement(addressFirstNameTxt, fName);
        setTextWebElement(addressLastNameTxt, lName);
        setTextWebElement(addressEmailTxt, email);
        setTextWebElement(addressCompanyTxt, company);
    }

    public void AddCountry(int index) {

        Select cont = new Select(addressCountryId);
        cont.selectByIndex(index);
    }

    public void AddCityAndAddressAndZipAndPhone(String city, String address, String zip, String phone) {

        setTextWebElement(addressCityTxt, city);
        setTextWebElement(addressAddress1Txt, address);
        setTextWebElement(addressZipPostalCodeTxt, zip);
        setTextWebElement(addressPhoneNumberTxt, phone);
    }

    public void clickOnSaveButton() {
        clickButton(saveBtn);
    }
}
