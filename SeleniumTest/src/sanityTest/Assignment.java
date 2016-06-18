package sanityTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new FirefoxDriver();
driver.get("http://www.infibeam.com/");
driver.manage().window().maximize();
driver.findElement(By.linkText("LOGIN / REGISTER")).click();
driver.findElement(By.xpath(".//*[@id='new-account-btn']")).click();
//Select s = new Select(driver.findElement(By.xpath(".//*[@id='password']")));
driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("maan");
System.out.println("Welcome to the first commit");
	}

}
