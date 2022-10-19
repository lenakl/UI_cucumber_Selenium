package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.EbayElectronicsPage;
import runner.RunnerTest;

public class EbayElectronicsPageDefSteps extends RunnerTest {
    EbayElectronicsPage ebayElectronicsPage;
    public WebDriver driver = browserDriver;

    @Before
    public void testsSetup(){
        ebayElectronicsPage = PageFactory.initElements(driver, EbayElectronicsPage.class);
    }

    @Given("open electronics page")
    public void openEbayElectronicsPage() {
        ebayElectronicsPage.open();
        ebayElectronicsPage.maxSize();
    }

    @When("choose Camera-Drones in left menu shop by Category")
    public void chooseCameraDronesInLeftMenuShopByCategory() {
        ebayElectronicsPage.getFilterItem();
    }

    @And("choose Auction in main menu")
    public void chooseAuctionInMainMenu() {
        ebayElectronicsPage.getItemAuction();
    }

    @Then("check buying format")
    public void checkBuyingFormat() {
        String str = ebayElectronicsPage.getText();
        Assert.assertTrue(str.contains("Buying Format: Auction"));
    }

    @When("choose item See all in Smart Home Devices in menu of category")
    public void chooseItemSeeAllInSmartHomeDevicesInMenuOfCategory() {
        ebayElectronicsPage.getCategoryItem();
        ebayElectronicsPage.getCategory();
    }

    @Then("check page Smart Home Devices")
    public void checkPageSmartHomeDevices() {
        String str = ebayElectronicsPage.getCategoryText();
        Assert.assertTrue(str.contains("Smart Home Devices"));
    }
}
