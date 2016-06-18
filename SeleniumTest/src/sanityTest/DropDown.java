package sanityTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new FirefoxDriver();
driver.get("http://www.gcrit.com/build3/create_account.php");
Select dropDown = new Select(driver.findElement(By.name("country")));
//dropDown.selectByIndex(2); // select by index 
dropDown.selectByVisibleText("India");// select by visible text
List<WebElement> e = dropDown.getOptions();
int items = e.size();
System.out.println(items);
	}

}
