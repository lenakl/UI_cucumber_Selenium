package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.EbayMainPage;
import runner.RunnerTest;

public class EbayMainPageDefSteps extends RunnerTest {
    EbayMainPage ebayMainPage;
    public WebDriver driver = browserDriver;

    @Before
    public void testsSetup(){
        ebayMainPage = PageFactory.initElements(driver, EbayMainPage.class);
    }

    @Given("open main page")
    public void openEbayMainPage() {
        ebayMainPage.open();
        ebayMainPage.maxSize();
    }

    @When("enter {string} and search")
    public void enterKeywordAndSearch(String keyword) {
        ebayMainPage.enterKeywordForSearch(keyword);
    }

    @Then("check {string} in list")
    public void checkExp_itemInList(String exp_item) {
        String str = ebayMainPage.getMainContentText();
        Assert.assertTrue(str.contains(exp_item));
    }

    @When("open menu for shopping by categories")
    public void openMenuForShoppingByCategories() {
        ebayMainPage.getSearchCategoryItem();
    }

    @And("choose item of all categories")
    public void chooseItemOfAllCategories() {
        ebayMainPage.getCategoryItem();
    }

    @Then("check page with list of all categories")
    public void checkPageWithListOfAllCategories() {
        String str = ebayMainPage.getCategoryText();
        Assert.assertTrue(str.contains("All Categories"));
    }
}
