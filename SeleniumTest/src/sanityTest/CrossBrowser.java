package sanityTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CrossBrowser {
public static WebDriver driver;
public static int browser;
public static String name;
	public static void main(String[] args) {
  
		for(browser  = 1;browser<=2;browser++){
			if (browser == 1){
				driver = new FirefoxDriver();
				name="Firefox :";
				System.out.println(name);			
			}
			else if (browser==2){
				System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
				driver = new ChromeDriver();
				name="Chrome";
				System.out.println(name);
				}
			/*else if (browser==3){
				System.setProperty("webdriver.ie.driver", "E:\\IEDriverServer.exe");
				 driver = new InternetExplorerDriver();
				 name="IE";
				 System.out.println(name);
			}*/
		
	driver.get("http://www.gcrit.com/build3/admin");
	driver.manage().window().maximize();
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
	driver.close();
	}
	}
}
