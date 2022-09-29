package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "Email")
    WebElement emailTxt;

    @FindBy(id = "Password")
    WebElement passwordTxt;

    @FindBy(css = "button.button-1.login-button")
    WebElement loginBtn;

    @Step("login Step with username: {0} , password: {1} for method : {method} step... ")
    public void LoginToAccount(String email , String password){

        setTextWebElement(emailTxt,email);
        setTextWebElement(passwordTxt,password);
        clickButton(loginBtn);
    }
}
