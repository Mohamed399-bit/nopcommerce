package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class HomePage extends PageBase {
    public HomePage(WebDriver driver) {
        super(driver);
        jse = (JavascriptExecutor) driver;
    }

    @FindBy(css = "a.ico-register")
    WebElement registerLink;

    @FindBy(css = "a.ico-logout")
    public WebElement logoutLink;

    @FindBy(css = "a.ico-login")
    WebElement loginLink;

    @FindBy(xpath = "//a[@href = '/about-us']")
    WebElement aboutUsLink;

    @FindBy(xpath = "//a[@href = '/contactus']")
    WebElement contactUsLink;

    @FindBy(css = "ul.top-menu.notmobile")
    WebElement itemsList;

    List<WebElement> items = itemsList.findElements(By.tagName("li"));

    @FindBy(css = "a.ico-wishlist")
    WebElement wishListBtn;

    @FindBy(id = "topcartlink")
    WebElement shoppingCartBtn;

    @FindBy(css = "div.header-logo")
    WebElement logo;

    @FindBy(css = "a.ico-account")
    WebElement myAccountLink;

    public void getItemSize() {
        System.out.println("Item Size : " + items.size());
    }

    public void clickOnItem(String item) {
        for (WebElement ele : items) {
            if (ele.getText().contains(item)) {
                clickButton(ele);
                break;
            }
        }
    }

    public void clickOnRegisterLink() {
        clickButton(registerLink);
    }

    public void clickOnLogOut() {
        clickButton(logoutLink);
    }

    public void clickOnLoginLink() {
        clickButton(loginLink);
    }

    public void verifyThatUserLogin() {
        Assert.assertTrue(logoutLink.isDisplayed());
        System.out.println("Logout is display : " + logoutLink.isDisplayed());
    }

    public void clickOnAboutUs() {

        scrollToBottom();
        clickButton(aboutUsLink);

    }

    public void clickOnContactUs() {

        scrollToBottom();

        clickButton(contactUsLink);
    }

    public void clickOnWishList() {
        clickButton(wishListBtn);
    }

    public void clickOnShoppingCart() {
        clickButton(shoppingCartBtn);
    }

    public void clickOnLogo() {
        clickButton(logo);
    }

    public void clickOnMyAccount() {
        clickButton(myAccountLink);
    }
}
