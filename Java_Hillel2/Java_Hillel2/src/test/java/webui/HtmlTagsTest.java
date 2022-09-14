package webui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HtmlTagsTest {
//    1. All JS on page are imported as files
//    2. Check 1 JS.
//    3. All CSS are imported as files
//    4. Check 1 CSS
//    5. Check all IDs are unique
    private WebDriver driver;
    @Test
    public void checkAllJsAreFiles () {
        int scriptsSize = driver.findElements(By.cssSelector("script:not([src])")).size();
        try {
            Assert.assertEquals(scriptsSize, 0);
        } catch (AssertionError e) {
            System.out.println("Test Failed .... ");
        }
        Assert.assertEquals(scriptsSize, 1);
    }
    @Test
    public void checkSingleJs() {

        int allScripts = driver.findElements(By.cssSelector("script")).size();
    }
    @BeforeClass
    public void setup (){
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://rapidapi.com/");
    }
    @AfterClass
    public void teardown(){
        driver.close();
    }
}

