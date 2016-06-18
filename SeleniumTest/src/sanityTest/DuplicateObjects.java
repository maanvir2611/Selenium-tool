package sanityTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DuplicateObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new FirefoxDriver();
driver.get("http://www.gcrit.com/build3/admin/login.php");
driver.findElement(By.name("username")).sendKeys("admin");
driver.findElement(By.name("password")).sendKeys("admin@12");
driver.findElement(By.id("tdb1")).click();
String url = driver.getCurrentUrl();
if(url.equals("http://www.gcrit.com/build3/admin/index.php")){
	driver.findElement(By.linkText("Online Catalog")).click();
	System.out.println(driver.getCurrentUrl());
}

	}

}
