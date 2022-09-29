package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class RegisterResultPage extends PageBase{
    public RegisterResultPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "div.result")
    public WebElement resultLabel;

    @FindBy(css = "a.button-1.register-continue-button")
    WebElement continueBtn;

    public void clickOnContinueButton(){
        clickButton(continueBtn);
    }

    public void verifyFromRegisterUser(String message){
        Assert.assertEquals(resultLabel.getText(),message);
        System.out.println("Register Message Is : " + resultLabel.getText());
    }
}
