package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    WebDriver driver;

    @FindBy(xpath="//input[@id='gh-ac']")
    public
    WebElement searchInput;

    public MainPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openPage(String url) {
        driver.get(url);
    }

    public void searchKeyword(String keyword) {
        searchInput.clear();
        searchInput.sendKeys(keyword, Keys.ENTER);
    }

}
