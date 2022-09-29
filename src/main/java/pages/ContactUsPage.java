package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends PageBase{
    public ContactUsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "FullName")
    WebElement nameTxt;

    @FindBy(id = "Email")
    WebElement emailTxt;

    @FindBy(id = "Enquiry")
    WebElement enquiryTxt;

    @FindBy(name = "send-email")
    WebElement submitBtn;

    public void enterName(String name){
        setTextWebElement(nameTxt,name);
    }

    public void enterEmail(String email){
        setTextWebElement(emailTxt,email);
    }

    public void enterEnquiry(String enquiry){
        setTextWebElement(enquiryTxt,enquiry);
    }

    public void clickOnSubmit(){
        clickButton(submitBtn);
    }



}
