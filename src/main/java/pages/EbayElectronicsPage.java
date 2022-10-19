package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EbayElectronicsPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public EbayElectronicsPage(WebDriver driver) {
        this.driver = driver;
      wait = new WebDriverWait(driver, 10);
    }

    public void open() {
        driver.get("https://www.ebay.com/b/Electronics/bn_7000259124");
    }

    public void maxSize() {
        driver.manage().window().maximize();
    }

    private By categoryButton = By.xpath("//*[@id=\"s0-16-12-0-1[0]-0-0-27[7]-0-toggle-button\"]");

    public void getCategoryItem() {
        driver.findElement((categoryButton)).click();
    }

    private By filterButton = By.xpath("//*[@id=\"s0-16-12-0-1[0]-0-0-27[7]-0\"]/ul/li[1]/a");

    public void getCategory() {
        driver.findElement((filterButton)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementCategoryText));
    }

    private By elementCategoryText = By.xpath("/html/body/div[4]/div[2]/div/nav/ul");

    public String getCategoryText() {
        return driver.findElement(elementCategoryText).getText();
    }


    private By itemFilter = By.xpath("//*[@id=\"mainContent\"]/section[1]/div[2]/a[6]/div[2]");

    private By waitFor = By.xpath("//*[@id=\"s0-27_1-9-0-1[0]-0-0-6-4\"]/div[1]/div[1]/div/ul/li[2]/a");

    public void getFilterItem() {
        driver.findElement((itemFilter)).click();
    }

    public void getItemAuction() {
        driver.get("https://www.ebay.com/b/Camera-Drones/179697/bn_89951?LH_Auction=1&mag=1&rt=nc");
    }

    private By itemFilterAuction = By.xpath("//*[@id=\"s0-27_1-9-0-1[0]-0-0-6-4\"]/div[1]/div[1]/div/ul/li[2]/a");

    private By waitForAuction = By.xpath("//*[@id=\"s0-27_1-9-0-1[0]-0-0\"]/section/ul[1]/li[1]/a/span[1]");

    public void getItemTestAuction() {
        driver.findElement((itemFilterAuction)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(waitForAuction));
    }

    private By elementText = By.xpath("//*[@id=\"s0-27_1-9-0-1[0]-0-0\"]/section/ul[1]/li[1]/a/span[1]");

    public String getText() {
        return driver.findElement(elementText).getText();
    }








}
