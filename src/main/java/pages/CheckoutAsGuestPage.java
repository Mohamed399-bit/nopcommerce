package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutAsGuestPage extends PageBase{
    public CheckoutAsGuestPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "button.button-1.checkout-as-guest-button")
    WebElement checkoutAsGuestBtn;

    public void clickOnCheckoutAsGuest(){
        clickButton(checkoutAsGuestBtn);
    }

}
