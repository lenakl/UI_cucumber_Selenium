package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.EbayHomeGardenPage;
import runner.RunnerTest;

public class EbayHomeGardenPageDefSteps extends RunnerTest {
    EbayHomeGardenPage ebayHomeGardenPage;
    public WebDriver driver = browserDriver;

    @Before
    public void testsSetup(){
        ebayHomeGardenPage = PageFactory.initElements(driver, EbayHomeGardenPage.class);
    }

    @Given("open home-garden page")
    public void openEbayElectronicsPage() {
        ebayHomeGardenPage.open();
        ebayHomeGardenPage.maxSize();
    }

    @When("choose item furniture")
    public void chooseItemFurniture() {
        ebayHomeGardenPage.getItem();
    }

    @And("choose list format")
    public void chooseListFormat() {
        ebayHomeGardenPage.getView();
        ebayHomeGardenPage.getListView();
    }

    @Then("check opportunity to switch on gallery format")
    public void checkOpportunityToSwitchOnGalleryFormat() {
        ebayHomeGardenPage.getView();
        String str = ebayHomeGardenPage.getTextView();
        Assert.assertTrue(str.contains("Gallery View"));
    }

    @When("choose item of category")
    public void chooseItemOfCategory() {
        ebayHomeGardenPage.getCategoryItem();
    }

    @And("choose filtering by condition")
    public void chooseFilteringByNewCondition() {
        ebayHomeGardenPage.getItemCondition();
    }

    @Then("check condition")
    public void checkCondition() {
        String str = ebayHomeGardenPage.getTextCondition();
        Assert.assertTrue(str.contains("Unbranded Home Improvement"));
    }
}
