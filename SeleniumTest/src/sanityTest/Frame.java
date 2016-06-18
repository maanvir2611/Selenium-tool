package sanityTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new FirefoxDriver();
driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
//driver.switchTo().frame(2);
driver.switchTo().frame("classFrame");
driver.findElement(By.xpath("html/body/div[3]/table/tbody[2]/tr[1]/td[1]/a")).click();
driver.manage().window().maximize();
Thread.sleep(100000);
driver.switchTo().defaultContent();
driver.switchTo().frame("packageListFrame");//html/body/div[2]/ul/li[2]/a
driver.findElement(By.xpath("html/body/div[2]/ul/li[2]/a")).click();
	}

}
