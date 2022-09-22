package google;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import webdriver.WDChrome;

import java.util.ArrayList;
import java.util.List;

public class GoogleSearchTest {
    private WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = WDChrome.get();
        driver.get("https://www.google.com/");

    }

    @Test
    public void googleSearch() {
        String query = "nissan";
        driver.findElement(By.cssSelector("input[name='q']")).sendKeys(query);
        driver.findElement(By.cssSelector("input[name='q']")).sendKeys(Keys.ENTER);
        List<WebElement> elements = new ArrayList<>();
         elements.addAll(driver.findElements(By.cssSelector("div.yuRUbf")));
         elements.addAll(driver.findElements(By.cssSelector("div.MjjYud")));
        for (WebElement el : elements) {
            try {
                Assert.assertTrue(el.getText().toLowerCase().contains(query));
            } catch (AssertionError e) {
                System.out.println(el.getText());
                throw new AssertionError(e.getMessage());
            }
        }
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
}
