package google.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import webdriver.WDChrome;

import java.util.ArrayList;
import java.util.List;

public class GooglePage {
    private WebDriver driver;

    private WebElement searchField;
    private List<WebElement> searchResults;
    public GooglePage(){
        WebDriver driver = WDChrome.get();
        driver.get("https://www.google.com/");
        searchField = driver.findElement(By.cssSelector("input[name='q']"));
        searchResults = driver.findElements(By.cssSelector("div.yuRUbf"));
        searchResults = driver.findElements(By.cssSelector("div.MjjYud"));

    }
    public List<String> getSearchResult(String query) {

        List<WebElement> resultElements = query(query);
        List<String> result = new ArrayList<>();
        for (WebElement el: resultElements) {
            result.add(el.getText().toLowerCase());
        }
        return result;

    }
    private List <WebElement> query(String query) {
        searchField.sendKeys(query);
        searchField.sendKeys(Keys.ENTER);
        return searchResults;

    }
}
