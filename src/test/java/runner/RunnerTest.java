package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

@CucumberOptions(
//        features = "src/test/resources/feature/EbayHomeGardenPage.feature",
        features = "src/test/resources/feature",
        glue = {"stepdefinitions"}
//        ,tags = "@TestCase"
)

public class RunnerTest extends AbstractTestNGCucumberTests {
    public static WebDriver browserDriver;

    @BeforeClass
    public void setUp() {
            WebDriverManager.chromedriver().setup();
            browserDriver = new ChromeDriver();
            browserDriver.manage().window().maximize();
    }

    @AfterClass
    public void browserClose() {
        browserDriver.quit();
    }

}
