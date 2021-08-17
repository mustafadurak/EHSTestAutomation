package EHS.pages;

import EHS.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public abstract class BasePage {

    public  BasePage(){ PageFactory.initElements(Driver.get(), this); }

    @FindBy(xpath = "//th")
    public WebElement pageHeading;

    public String getPageHeadindText(){
        return pageHeading.getText();
    }
}
