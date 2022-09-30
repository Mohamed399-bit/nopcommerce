package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class MyAccountPage extends PageBase {
    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "Customer info")
    WebElement customerInfoLink;

    @FindBy(linkText = "Addresses")
    WebElement addressesLink;

    @FindBy(id = "FirstName")
    WebElement firstNameTxt;

    @FindBy(id = "LastName")
    WebElement lastNameTxt;

    @FindBy(name = "DateOfBirthDay")
    WebElement dateOfBirthDayList;

    @FindBy(name = "DateOfBirthMonth")
    WebElement dateOfBirthMonthList;

    @FindBy(name = "DateOfBirthYear")
    WebElement dateOfBirthYearList;

    @FindBy(id = "Email")
    WebElement emailTxt;

    @FindBy(id = "Company")
    WebElement companyTxt;

    @FindBy(id = "save-info-button")
    WebElement saveBtn;

    @FindBy(linkText = "Change password")
    WebElement changePasswordLink;

    public void clickOnCustomerLink() {
        clickButton(customerInfoLink);
    }

    public void clickOnAddressLink() {
        clickButton(addressesLink);
    }

    public void updateAccountInformation(String fName, String lName) {

        clearField(firstNameTxt);
        setTextWebElement(firstNameTxt, fName);
        clearField(lastNameTxt);
        setTextWebElement(lastNameTxt, lName);
    }

    public void updateBirthDay(String day, String month, String year) {

        Select dataOfBirth = new Select(dateOfBirthDayList);
        dataOfBirth.selectByVisibleText(day);

        Select monthOfBirth = new Select(dateOfBirthMonthList);
        monthOfBirth.selectByVisibleText(month);

        Select yearOfBirth = new Select(dateOfBirthYearList);
        yearOfBirth.selectByVisibleText(year);
    }

    public void updateEmailAndCompany(String email, String company) {
        clearField(emailTxt);
        setTextWebElement(emailTxt, email);
        clearField(companyTxt);
        setTextWebElement(companyTxt, company);
    }

    public void clickOnSaveButton() {
        clickButton(saveBtn);
    }

    public void clickOnChangePassword() {
        clickButton(changePasswordLink);
    }

}
