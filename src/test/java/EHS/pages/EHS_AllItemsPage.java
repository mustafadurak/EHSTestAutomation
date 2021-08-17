package EHS.pages;

import EHS.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class EHS_AllItemsPage extends BasePage {


    public void clickOpens(int number){
        Driver.get().findElement(By.id("OpenItem"+number+"Button")).click();
    }

    public List<WebElement> getAllItems(){
        return Driver.get().findElements(By.xpath("//tr/td/.."));
    }
}
