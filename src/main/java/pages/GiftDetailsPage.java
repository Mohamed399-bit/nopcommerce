package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GiftDetailsPage extends PageBase{
    public GiftDetailsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input.recipient-name")
    WebElement recipientNameTxt;

    @FindBy(css = "input.sender-name")
    WebElement senderNameTxt;

    @FindBy(css = "textarea.message")
    WebElement messageTxt;

    public void enterGiftInformation(String recipient ,String sender , String message){

        setTextWebElement(recipientNameTxt,recipient);
        setTextWebElement(senderNameTxt,sender);
        setTextWebElement(messageTxt,message);
    }
}
