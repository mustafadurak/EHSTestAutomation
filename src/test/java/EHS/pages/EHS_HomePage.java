package EHS.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EHS_HomePage extends BasePage {


    @FindBy(id = "FindItemButton")
    public WebElement findButton;

    @FindBy(id = "ListAllItemsButton")
    public WebElement listAllItemsButton;

    @FindBy(id = "ProductIdField")
    public WebElement productIdInputBox;


}
