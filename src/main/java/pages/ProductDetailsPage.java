package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ProductDetailsPage extends PageBase{
    public ProductDetailsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "product_enteredQuantity_9")
    WebElement productEnterQuantityTxt;

    @FindBy(id = "add-to-cart-button-9")
    WebElement addToCartBtn;

    @FindBy(id = "add-to-wishlist-button-9")
    WebElement addToWishListBtn;

    @FindBy(css = "div.compare-products")
    WebElement addToCompareBtn;

    @FindBy(css = "p.content")
    WebElement contentMsg;

    @FindBy(css = "span.close")
    WebElement closeBtn;

    @FindBy(xpath = "//*[@id=\"bar-notification\"]/div/p/a")
    WebElement compareLink;

    @FindBy(css = "button.button-2.email-a-friend-button")
    WebElement EmailFriendBtn;

    public void enterQuantity(String quantity){
        productEnterQuantityTxt.clear();
        setTextWebElement(productEnterQuantityTxt,quantity);
    }

    public void clickOnAddToCart(){
        clickButton(addToCartBtn);
    }

    public void clickOnAddToWishList(){
        clickButton(addToWishListBtn);
    }

    public void clickOnAddToCompare(){
        clickButton(addToCompareBtn);
    }

    public void VerifyThatItemAddToWatchList(String message){

        Assert.assertEquals(contentMsg.getText(),message);
        System.out.println("Message is : " + contentMsg.getText());
    }

    public void VerifyThatItemAddToCart(String message){

        Assert.assertEquals(contentMsg.getText(),message);
        System.out.println("Message is : " + contentMsg.getText());
    }

    public void VerifyThatItemAddToCompare(String message){

        Assert.assertEquals(contentMsg.getText(),message);
        System.out.println("Message is : " + contentMsg.getText());
    }

    public void clickOnClose(){
        clickButton(closeBtn);
    }

    public void clickOnCompareLink(){
        clickButton(compareLink);
    }

    public void clickOnEmailFriend(){
        clickButton(EmailFriendBtn);
    }


}
