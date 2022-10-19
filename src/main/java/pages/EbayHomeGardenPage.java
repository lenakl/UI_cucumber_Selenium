package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EbayHomeGardenPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public EbayHomeGardenPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    public void open() {
        driver.get("https://www.ebay.com/b/Home-Garden/11700/bn_1853126");
    }

    public void maxSize() {
        driver.manage().window().maximize();
    }

    private By itemButton = By.xpath("//*[@id=\"mainContent\"]/section[3]/div[2]/a[2]/div[2]");

    private By waitFor = By.xpath("/html/body/div[4]/div[4]/div[3]/section[2]/section/ul[1]/li[2]/div");

    public void getCategoryItem() {
        driver.findElement((itemButton)).click();
    }

    private By itemCondition = By.xpath("//*[@id=\"s0-27-9-0-1[0]-0-1[1]-0-12-list\"]/li[1]/a/p");

    public void getItemCondition() {
        driver.findElement((itemCondition)).click();
    }

    private By elementTextCondition = By.xpath("/html/body/div[4]/div[2]/h1/span");

    public String getTextCondition() {
        return driver.findElement(elementTextCondition).getText();
    }

    private By furnitureButton = By.xpath("//*[@id=\"mainContent\"]/section[1]/div[2]/a[1]/div[2]");

    public void getItem() {
        driver.findElement((furnitureButton)).click();
    }

    private By view = By.xpath("/html/body/div[4]/div[4]/div[3]/section[1]/div[1]/div[1]/div[2]/div[2]/span/button");

    public void getView() {
        driver.findElement((view)).click();
    }


    private By listView = By.xpath("//*[@id=\"s0-27_2-9-0-1[0]-0-0-6-4-19-1-content-menu\"]/li/a/span");

    public void getListView() {
        driver.findElement((listView)).click();
    }

    private By elementText = By.xpath("//*[@id=\"s0-27_2-9-0-1[0]-0-0-6-4-19-1-content-menu\"]/li/a/span");

    public String getTextView() {
        return driver.findElement(elementText).getText();
    }

}


