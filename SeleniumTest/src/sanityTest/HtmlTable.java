package sanityTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HtmlTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new FirefoxDriver();
driver.get("http://www.w3schools.com/html/html_tables.asp");
WebElement html = driver.findElement(By.xpath(".//*[@id='main']/table[1]"));
List<WebElement> rows = html.findElements(By.tagName("tr"));
System.out.println(rows.size());
List<WebElement> cells = html.findElements(By.tagName("td"));
System.out.println(cells.size());
	}

}
