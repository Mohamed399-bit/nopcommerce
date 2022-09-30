package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class OrderDetailsPage extends PageBase {
    public OrderDetailsPage(WebDriver driver) {
        super(driver);
        actions = new Actions(driver);
    }

    @FindBy(css = "a.button-2.print-order-button")
    WebElement printBtn;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[1]/h1")
    WebElement PageTitle;

    @FindBy(css = "a.button-2.pdf-invoice-button")
    WebElement PdfInvoiceBtn;

    public void clickOnPrintButton() {
        clickButton(printBtn);
    }

    public void GetOderDetailsTilePage() {
        System.out.println(PageTitle.getText());
    }

    public void clickOnPDFInvoiceButton() {
        clickButton(PdfInvoiceBtn);
    }

    public void clickOnEcpButton(WebDriver driver) {
        driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);
    }


}
