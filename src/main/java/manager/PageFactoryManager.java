package manager;

import org.openqa.selenium.WebDriver;
import pages.MainPage;

public class PageFactoryManager {
    WebDriver driver;

    public PageFactoryManager(WebDriver driver) {this.driver = driver;}

    public MainPage getMainPage() {return new MainPage(driver);}

}
