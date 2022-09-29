package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComparePage extends PageBase{
    public ComparePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "div.page-title")
    WebElement pageTitle;

    public void getPageTitle(){
        System.out.println("Page Title is : " + pageTitle.getText());
    }
}
