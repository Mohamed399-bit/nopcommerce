package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AddressPage extends PageBase {
    public AddressPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "button.button-1.add-address-button")
    WebElement addNewBtn;

    @FindBy(css = "div.page-title")
    WebElement addressPageTitle;

    public void clickOnAddNewButton() {
        clickButton(addNewBtn);
    }

    public void VerifyThatAddressAdded() {
        Assert.assertTrue(addressPageTitle.isDisplayed());
        System.out.println("Page Title : " + addressPageTitle.getText());
    }
}
