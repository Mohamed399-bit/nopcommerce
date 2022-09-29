package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends PageBase{
    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "gender-male")
    WebElement genderMaleRadio;

    @FindBy(id = "gender-female")
    WebElement genderFemaleRadio;

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

    @FindBy(id = "Password")
    WebElement passwordTxt;

    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordTxt;

    @FindBy(id = "register-button")
    WebElement registerBtn;

    @Step("login Step with First Name: {0} , Last Name: {1} for method : {method} step... ")
    public void enterGenderAndName(String FName , String LName){
        clickButton(genderMaleRadio);
        setTextWebElement(firstNameTxt, FName);
        setTextWebElement(lastNameTxt,LName);
    }

    @Step("Register Step with data of Birth: {0},month of Birth: {1} , year of Birth: {2}for method : {method} step... ")
    public void enterDateOfBirth(String day , String month , String year){

        Select dataOfBirth = new Select(dateOfBirthDayList);
        dataOfBirth.selectByVisibleText(day);

        Select monthOfBirth = new Select(dateOfBirthMonthList);
        monthOfBirth.selectByVisibleText(month);

        Select yearOfBirth = new Select(dateOfBirthYearList);
        yearOfBirth.selectByVisibleText(year);
    }

    @Step("Register Step with email: {0} for method : {method} step... ")
    public void enterEmail(String email){
        setTextWebElement(emailTxt,email);
    }

    @Step("Register Step with Company name : {0} for method : {method} step... ")
    public void enterCompanyName(String company){
        setTextWebElement(companyTxt,company);
    }

    @Step("Register Step with password : {0} for method : {method} step... ")
    public void enterPassword(String password){
        setTextWebElement(passwordTxt,password);
        setTextWebElement(confirmPasswordTxt,password);
    }

    public void clickOnRegisterButton(){
        clickButton(registerBtn);
    }

}
