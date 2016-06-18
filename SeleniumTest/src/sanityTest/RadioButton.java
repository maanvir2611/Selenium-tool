package sanityTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new FirefoxDriver();
driver.get("http://book.theautomatedtester.co.uk/chapter1");
System.out.println(driver.findElement(By.xpath("html/body/div[2]/p[2]")).isDisplayed());
System.out.println(driver.findElement(By.xpath("html/body/div[2]/p[2]")).isEnabled());
System.out.println(driver.findElement(By.xpath(".//*[@id='radiobutton']")).isSelected());
driver.findElement(By.xpath(".//*[@id='radiobutton']")).click();
System.out.println(driver.findElement(By.xpath(".//*[@id='radiobutton']")).isSelected());
	}

}
