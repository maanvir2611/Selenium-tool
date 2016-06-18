package sanityTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InLine {
public static void main(String[]args){
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.google.ca");
	driver.manage().window().maximize();
	driver.findElement(By.className("gb_b gb_Rb")).click();
	
	driver.findElement(By.xpath(".//*[@id='gb36']/span[1]")).click();
	
}
}
