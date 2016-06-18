package sanityTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGTest {
@Test (priority = 1)
public void verfiyTitle(){

WebDriver driver = new FirefoxDriver();
driver.get("https://gmail.com/");
String title = driver.getTitle();
Assert.assertEquals(title, "Gmail");
}
}