package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductsItemPage extends PageBase{
    public ProductsItemPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "div.item-grid")
    WebElement itemsDiv;

    List<WebElement> items = itemsDiv.findElements(By.cssSelector("div.item-box"));

    public void getItemSize(){
        System.out.println("Product Size : " + items.size());
    }
    public void ClickOnItemName(String name){

        for(WebElement ele : items){
            if (ele.getText().contains(name)){
                clickButton(ele);
                break;
            }
        }
    }
}
