package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ProductDetailsPage extends PageBase{
    public ProductDetailsPage(WebDriver driver) {
        super(driver);
        jse = (JavascriptExecutor)driver;
    }

    @FindBy(css = "div.add-to-cart-panel")
    WebElement addToCartPanel;

    WebElement qtyLable = addToCartPanel.findElement(By.tagName("input"));
    WebElement addToCartBtn = addToCartPanel.findElement(By.tagName("button"));

    @FindBy(css = "div.add-to-wishlist")
    WebElement addToWishListBtn;

    @FindBy(css = "div.compare-products")
    WebElement addToCompareBtn;

    @FindBy(css = "p.content")
    WebElement contentMsg;

    @FindBy(css = "span.close")
    WebElement closeBtn;

    @FindBy(xpath = "//*[@id=\"bar-notification\"]/div/p/a")
    WebElement compareLink;

    @FindBy(css = "div.email-a-friend")
    WebElement EmailFriendBtn;

    public void enterQuantity(String quantity){
        qtyLable.clear();
        setTextWebElement(qtyLable,quantity);
    }

    public void clickOnAddToCart(){
        clickButton(addToCartBtn);
    }

    public void clickOnAddToWishList(){
        scrollToBottom();
        clickButton(addToWishListBtn);
    }

    public void clickOnAddToCompare(){
        scrollToBottom();
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
