package EHS.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class EHS_ItemPage extends BasePage{

    @FindBy(id = "ProductId")
    public WebElement productId;

    @FindBy(xpath = "//td[text()='Name']")
    public WebElement nameRow;

    @FindBy(xpath = "//td[text()='Material']")
    public WebElement materialRow;

    @FindBy(xpath = "//td[text()='Manufacturer']")
    public WebElement manufacturerRow;

    @FindBy(xpath = "//td[text()='Retail price']")
    public WebElement retailPriceRow;

    public String getProductId(){
        return productId.getText();
    }
}
