package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CheckoutCompletedPage extends PageBase{
    public CheckoutCompletedPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div/div[1]/strong")
    WebElement successMessage;

    @FindBy(linkText = "Click here for order details.")
    WebElement oderDetailsLink;

    public void VerifyThatOderConfirmed(String message){
        Assert.assertEquals(successMessage.getText(),message);
        System.out.println("Success Message After Complete Oder : " + successMessage.getText());
    }

    public void clickOnOderDetailsLink(){
        clickButton(oderDetailsLink);
    }
}
