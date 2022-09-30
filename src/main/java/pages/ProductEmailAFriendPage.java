package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductEmailAFriendPage extends PageBase {
    public ProductEmailAFriendPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "FriendEmail")
    WebElement friendEmailTxt;

    @FindBy(id = "YourEmailAddress")
    WebElement yourEmailAddressTxt;

    @FindBy(id = "PersonalMessage")
    WebElement personalMessageTxt;

    @FindBy(name = "send-email")
    WebElement sendEmailBtn;

    public void enterInformationFromEmailFrind(String eFriend, String yEmail, String Message) {

        setTextWebElement(friendEmailTxt, eFriend);
        setTextWebElement(yourEmailAddressTxt, yEmail);
        setTextWebElement(personalMessageTxt, Message);
    }

    public void clickOnSendEmail() {
        clickButton(sendEmailBtn);
    }

}
