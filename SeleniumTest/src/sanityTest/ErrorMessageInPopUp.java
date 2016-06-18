package sanityTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ErrorMessageInPopUp {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[1]/div/form/div/div[6]/div[1]/input")).click();
		Alert a = driver.switchTo().alert();//control goes to pop-up
		String message = a.getText();
		System.out.println(message);
		a.dismiss();
		driver.findElement(By.xpath(".//*[@id='login1']")).sendKeys("maanvir2611");

	}

}
