package EHS.step_definitions;

import EHS.pages.EHS_AllItemsPage;
import EHS.pages.EHS_HomePage;
import EHS.pages.EHS_ItemPage;
import EHS.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import java.util.ArrayList;


public class EHSAutomationStepDefs {
    EHS_HomePage homePage=new EHS_HomePage();
    EHS_AllItemsPage allItemsPage=new EHS_AllItemsPage();
    EHS_ItemPage itemPage=new EHS_ItemPage();

    ArrayList<String> productId=new ArrayList<>();

    @Given("go to EHS Home page and verify to be at home page")
    public void go_to_EHS_Home_page_and_verify_to_be_at_home_page() {

        Driver.get().get("EHS_HomePage_Url");
        Assert.assertEquals("EHS - Home",homePage.getPageHeadindText());

    }

    @When("click ListAllItems button and verify to be All Items Page")
    public void click_ListAllItems_button_and_verify_to_be_All_Items_Page() {

        homePage.listAllItemsButton.click();
        Assert.assertEquals("EHS - All Items",allItemsPage.getPageHeadindText());

    }

    @Then("verify to be able to see all available items")
    public void verify_to_be_able_to_see_all_available_items() {

        Assert.assertEquals(9,allItemsPage.getAllItems().size());

    }

    @Then("click all items open button respectively then verify to see all infos and get product ids to store")
    public void click_all_items_open_button_respectively_then_verify_to_see_all_infos_and_get_product_ids_to_store() {

        for (int i=1; i<=allItemsPage.getAllItems().size(); i++){
            allItemsPage.clickOpens(i);

           Assert.assertEquals("STD "+i,itemPage.getProductId());
           Assert.assertTrue(itemPage.productId.isDisplayed());
           Assert.assertTrue(itemPage.nameRow.isDisplayed());
           Assert.assertTrue(itemPage.materialRow.isDisplayed());
           Assert.assertTrue(itemPage.retailPriceRow.isDisplayed());

            productId.add(itemPage.getProductId());

           Driver.get().navigate().back();
        }

    }

    @Then("click Open Button for EHS item {int} and verify to see all info")
    public void click_Open_Button_for_EHS_item_and_verify_to_see_all_info(Integer itemNumber) {

        allItemsPage.clickOpens(itemNumber);

        Assert.assertEquals("STD "+itemNumber,itemPage.getProductId());
        Assert.assertTrue(itemPage.productId.isDisplayed());
        Assert.assertTrue(itemPage.nameRow.isDisplayed());
        Assert.assertTrue(itemPage.materialRow.isDisplayed());
        Assert.assertTrue(itemPage.retailPriceRow.isDisplayed());
    }

    @When("Search EHSItem {int} with productId and click find button")
    public void search_EHSItem_with_productId_and_click_find_button(Integer itemNumber) {

        homePage.productIdInputBox.sendKeys(productId.get(itemNumber));
        homePage.findButton.click();

    }

    @Then("verify to see all info for the searching item")
    public void verify_to_see_all_info_for_the_searching_item() {

        Assert.assertTrue(itemPage.productId.isDisplayed());
        Assert.assertTrue(itemPage.productId.isDisplayed());
        Assert.assertTrue(itemPage.nameRow.isDisplayed());
        Assert.assertTrue(itemPage.materialRow.isDisplayed());
        Assert.assertTrue(itemPage.retailPriceRow.isDisplayed());


    }

}
