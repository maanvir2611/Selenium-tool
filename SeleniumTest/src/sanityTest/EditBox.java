package sanityTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EditBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new FirefoxDriver();
driver.get("https://gmail.com/");
driver.findElement(By.id("Email")).sendKeys("maanvir2611");
System.out.println(driver.findElement(By.id("Email")).getAttribute("value"));

driver.navigate().to("https://google.com/");
System.out.println(driver.findElement(By.xpath(".//*[@id='hplogo']")).isDisplayed());
System.out.println(driver.findElement(By.xpath(".//*[@id='hplogo']")).getAttribute("title"));
System.out.println(driver.findElement(By.linkText("Gmail")).isDisplayed());
System.out.println(driver.findElement(By.linkText("Gmail")).isEnabled());
WebElement email = driver.findElement(By.linkText("Gmail"));
email.click();

	}
	

}
