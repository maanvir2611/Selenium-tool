package sanityTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new FirefoxDriver();
driver.get("https://www.google.ca");
String title = driver.getTitle();
System.out.println(title);
//String pageSource = driver.getPageSource();
//System.out.println(pageSource);
String url = driver.getCurrentUrl();
System.out.println(url);

driver.navigate().to("https://login.yahoo.com/");
url = driver.getCurrentUrl();
System.out.println(url);

driver.navigate().back();
url = driver.getCurrentUrl();
System.out.println(url);

driver.navigate().forward();
url = driver.getCurrentUrl();
System.out.println(url);

driver.navigate().refresh();
url = driver.getCurrentUrl();
System.out.println(url);

driver.manage().window().maximize();

driver.close();
	}

}
