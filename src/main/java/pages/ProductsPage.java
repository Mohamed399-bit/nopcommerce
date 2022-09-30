package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductsPage extends PageBase {
    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "div.item-grid")
    WebElement itemGrid;

    List<WebElement> items = itemGrid.findElements(By.cssSelector("div.item-box"));

    public void getItemsSize() {
        System.out.println("Items Size : " + items.size());
    }

    public void clickOnItem(String item) {
        for (WebElement ele : items) {
            if (ele.getText().contains(item)) {
                clickButton(ele);
                break;
            }
        }

    }
}
