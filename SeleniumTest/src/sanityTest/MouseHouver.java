package sanityTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHouver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new FirefoxDriver();
driver.get("https://www.carmax.com/");
// create action builder instance by passing webdriver instance
Actions builder = new Actions(driver);
WebElement menu = driver.findElement(By.linkText("FIND YOUR CAR"));
builder.moveToElement(menu).build().perform();
driver.findElement(By.linkText("Transfers")).click();
	}

}
