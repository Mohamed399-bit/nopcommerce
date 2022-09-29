package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ContactUsSuccsessPage extends PageBase{
    public ContactUsSuccsessPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "div.result")
    WebElement resultLabel;

    public String getMessage(){
       return resultLabel.getText();
    }

    public void verifyThatContactSend(String message){
        Assert.assertEquals(resultLabel.getText(), message);
        System.out.println("Contact Us message : " + resultLabel.getText());
    }


}
