package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AboutUsPage extends PageBase {
    public AboutUsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "ph-title")
    WebElement aboutUsTxt;

    public void VerifyThatAboutUsOpen(String title) {

        Assert.assertEquals(aboutUsTxt.getText(), "About us");
        System.out.println("Tile is : " + aboutUsTxt.getText());
    }
}
