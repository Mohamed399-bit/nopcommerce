package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ShoppingPage extends PageBase {
    public ShoppingPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "div.page-title")
    WebElement pageTitle;

    @FindBy(tagName = "table")
    WebElement tableItems;

    @FindBy(id = "checkout")
    WebElement checkoutBtn;

    @FindBy(id = "termsofservice")
    WebElement termsOfServiceCheckBox;

    public void getPageTitle() {
        System.out.println("Page Title is : " + pageTitle.getText());
    }

    public void VerifyThatItemAddToShoppingCart(String item) {

        List<WebElement> trs = tableItems.findElements(By.tagName("tr"));

        for (WebElement ele : trs) {
            List<WebElement> tds = tableItems.findElements(By.tagName("td"));
            WebElement productName = tds.get(3);
            if (productName.getText().contains(item)) {
                System.out.println("Product Name is : " + productName.getText());
                break;
            }
        }
    }

    public void clickOnCheckoutButton() {
        clickButton(termsOfServiceCheckBox);
        clickButton(checkoutBtn);
    }
}
