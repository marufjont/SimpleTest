import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import static com.thoughtworks.selenium.SeleneseTestBase.assertEquals;

/**
 * Created by Maruf on 9/15/2014.
 */
public class SimpleTestRun {
    @Test
    public void testRun() {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");
        driver.findElement(By.name("q")).sendKeys("seach");
        driver.findElement(By.name("q")).submit();
        assertEquals(true, true);
    }
}
