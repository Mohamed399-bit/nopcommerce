package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WishListPage extends PageBase{
    public WishListPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "div.page-title")
    WebElement pageTitle;

    @FindBy(tagName = "table")
    WebElement tableItems;

    public void getPageTitle(){
        System.out.println("Page Title is : " + pageTitle.getText());
    }

    public void VerifyThatItemAddToWishList(String item){

        List<WebElement> trs = tableItems.findElements(By.tagName("tr"));

        for (WebElement ele : trs){
            List<WebElement> tds = tableItems.findElements(By.tagName("td"));
            WebElement productName = tds.get(3);
            if (productName.getText().contains(item)){
                System.out.println("Product Name is : " + productName.getText());
                break;
            }
        }
    }

    public void RemoveFromWishList(String productName){

        List<WebElement> trs = tableItems.findElements(By.tagName("tr"));

        for (WebElement ele : trs){
            List<WebElement> tds = tableItems.findElements(By.tagName("td"));
            WebElement productName1 = tds.get(3);
            WebElement RemoveCol = tds.get(tds.size()-1);;
            WebElement RemoveIcon = RemoveCol.findElement(By.name("updatecart"));
            if (productName1.getText().contains(productName)){
                System.out.println("Product Name is : " + productName1.getText());
                clickButton(RemoveIcon);
                break;
            }
        }
    }


}
