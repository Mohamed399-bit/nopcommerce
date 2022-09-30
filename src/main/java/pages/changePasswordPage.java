package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class changePasswordPage extends PageBase {
    public changePasswordPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "OldPassword")
    WebElement oldPasswordTxt;

    @FindBy(id = "NewPassword")
    WebElement newPasswordTxt;

    @FindBy(id = "ConfirmNewPassword")
    WebElement confirmPasswordTxt;

    @FindBy(css = "button.button-1.change-password-button")
    WebElement changePasswordBtn;

    @FindBy(css = "p.content")
    WebElement successMessage;

    @FindBy(css = "span.close")
    WebElement closeBtn;

    public void enterNewPassword(String oldPassword, String newPassword) {

        setTextWebElement(oldPasswordTxt, oldPassword);
        setTextWebElement(newPasswordTxt, newPassword);
        setTextWebElement(confirmPasswordTxt, newPassword);
    }

    public void clickOnChangePasswordButton() {
        clickButton(changePasswordBtn);
    }

    public void VerifyThatUserChangePassword(String Message) {

        Assert.assertEquals(successMessage.getText(), Message);
        System.out.println("Success message After user change password : " + successMessage.getText());
    }

    public void closedMessage() {
        clickButton(closeBtn);
    }
}
