package google.page;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class Assertions {
    public static void assertEachContainsSubstring(List<String> searchResult, String query) {
        for (String str : searchResult) {
            try {
                Assert.assertTrue(str.contains(query));
            } catch (AssertionError e) {
                System.out.println(str);
                throw new AssertionError(e.getMessage());
            }
        }
    }
}
