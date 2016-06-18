package sanityTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementHandling {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://gmail.com/");
		/*WebElement email = driver.findElement(By.id("Email"));
		email.sendKeys("maanvir2611");
		System.out.println(email.getText());//returns the value
		System.out.println(email.isDisplayed());
		System.out.println(email.isEnabled());*/
		//capture text area
		//String s = driver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/h1")).getText();
       // System.out.println(s);
		//capture error message
		driver.findElement(By.xpath(".//*[@id='next']")).click();
		String s = driver.findElement(By.xpath(".//*[@id='errormsg_0_Email']")).getText();
		System.out.println(s);
	}

}
