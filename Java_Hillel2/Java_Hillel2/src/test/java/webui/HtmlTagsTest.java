package webui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import webui.exceprions.CustomAssertionError;

public class HtmlTagsTest {
    //    1. All JS on page are imported as files
//    2. Check 1 JS.
//    3. All CSS are imported as files
//    4. Check 1 CSS
//    5. Check all IDs are unique
    private WebDriver driver;

    @Test
    public void checkAllJsAreFiles() {
        int scriptsSize = driver.findElements(By.cssSelector("script:not([src])")).size();
        try {
            Assert.assertEquals(scriptsSize, 0);
        } catch (AssertionError e) {
            throw new CustomAssertionError(e.getMessage());
        }

    }

    @Test
    public void checkSingleJS() {

        int allScripts = driver.findElements(By.cssSelector("script")).size();
        Assert.assertEquals(allScripts, 1);
    }

    @Test
    public void checkAllCSSAreFiles() {

        int stylesSize = driver.findElements(By.cssSelector("style")).size();
        Assert.assertEquals(stylesSize, 0);
    }

    @Test
    public void checkSingleCSS() {

        int allStyles = driver.findElements(By.cssSelector("link[rel='stylesheet']")).size();
        Assert.assertEquals(allStyles, 1);
    }

    @Test
    public void checkUniqueIDs() {
        driver.findElements(By.cssSelector("*[id]"));

    }

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://stackoverflow.com");
    }

    @AfterClass
    public void teardown() {
        driver.close();
    }
}

