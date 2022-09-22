package google;

import google.page.Assertions;
import google.page.GooglePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import webdriver.WDChrome;
import java.util.List;

public class GoogleSearchTest {
    private WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = WDChrome.get();
    }

    @Test
    public void googleSearch() {
        String query = "nissan";
        GooglePage page = new GooglePage();
        List<String> searchResult = page.getSearchResult(query);
        Assertions.assertEachContainsSubstring(searchResult, query);
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
}
