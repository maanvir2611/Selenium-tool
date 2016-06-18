package sanityTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase1 {
public static WebDriver driver;
public static int i;
public static String s;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(i=1;i<=2;i++){
if(i==1){
	 driver = new FirefoxDriver();
	 s= "Firefox : ";
	 System.out.println(s);
}

else if (i==2){
	System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
	driver = new ChromeDriver();
	s = "Chrome is";
	System.out.println(s);
}
driver.get("https://en.wikipedia.org/wiki/Selenium_%28software%29");
driver.findElement(By.linkText("Create account")).click();
String url = driver.getCurrentUrl();
//System.out.println(url);
if (url.contains("wikipedia.org")){
	System.out.println("It is an internal link in the same application passed");
}
else{
	System.out.println("It is an extenal link redirecting to other application");
}
driver.navigate().back();
driver.findElement(By.linkText("seleniumhq.org")).click();
url = driver.getCurrentUrl();
if(! url.contains("wikipedia.org")){
	System.out.println("It redirects to an external link");
}
else{
	System.out.println("It is an internal link in the same application passed");
}
driver.close();
}
}
}