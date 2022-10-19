package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class EbayMainPage {

    private WebDriver driver;

    public EbayMainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://www.ebay.com/");
    }

    public void maxSize() {
        driver.manage().window().maximize();
    }

    private By inputSearch = By.xpath("//*[@id=\"gh-ac\"]");

    private By searchButton = By.xpath("//*[@id=\"gh-btn\"]");

    public void enterKeywordForSearch(String searchItem) {
        driver.findElement((inputSearch)).sendKeys(searchItem);
        driver.findElement((searchButton)).click();
    }

    private By mainContentText = By.xpath("//*[@id=\"mainContent\"]/div[1]/div/div[2]/div[1]/div[1]/h1/span[2]");

    public String getMainContentText() {
        return driver.findElement(mainContentText).getText();
    }




    private By searchCategoryButton = By.xpath("//*[@id=\"gh-shop-a\"]");

    public void getSearchCategoryItem() {
        driver.findElement((searchCategoryButton)).click();
    }

    private By categoryButton = By.xpath("//*[@id=\"gh-shop-see-all\"]");

    public void getCategoryItem() {
        driver.findElement((categoryButton)).click();
    }

    private By elementCategoryText = By.xpath("//*[@id=\"wrapper\"]/div[1]/div/div/div[2]/div[1]/h1");

    public String getCategoryText() {
        return driver.findElement(elementCategoryText).getText();
    }

}
