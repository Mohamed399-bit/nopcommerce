package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage2 extends PageBase {
    public loginPage2(WebDriver driver) {
        super(driver);
    }

    @FindBy(name = "username")
    WebElement userNameTxt;

    @FindBy(name = "password")
    WebElement passwordTxt;

    @FindBy(xpath = "//button[@type ='submit']")
    WebElement loginBtn;

    public void login(String username, String password) {
        setTextWebElement(userNameTxt, username);
        setTextWebElement(passwordTxt, password);
        clickButton(loginBtn);
    }
}
