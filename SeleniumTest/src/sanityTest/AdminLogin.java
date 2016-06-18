package sanityTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdminLogin {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();// launches firefox browser with blank URL
        driver.get("http://www.gcrit.com/build3/admin");
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin@123");
        driver.findElement(By.id("tdb1")).click();
        String url = driver.getCurrentUrl();
        if (url.equals("http://www.gcrit.com/build3/admin/index.php")){
        	System.out.println("Login successfully passed");
        }
        else{
        	System.out.println("Login unsuccesfull - failed");
        }
		driver.close(); // closes the browser
	}

}
