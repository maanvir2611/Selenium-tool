package sanityTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementLoacators {
public static void main(String[]args){
	WebDriver driver = new FirefoxDriver();
	driver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier");
	WebElement email = driver.findElement(By.name("Email"));
	email.sendKeys("maanvir2611");
	boolean next = driver.findElement(By.id("next")).isEnabled();
	System.out.println(next);
	//driver.findElement(By.id("Email")).sendKeys("maanvir2611");
	driver.findElement(By.id("next")).click();
}
}
