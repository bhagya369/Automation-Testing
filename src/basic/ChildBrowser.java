package basic;

import java.io.IOException;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser {

	public static void main(String[] args) throws IOException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\91708\\Pictures\\Screenshots\\chromedriver\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.naukri.com/");
   WebElement mnc= driver.findElement(By.xpath("(//a[@title='MNC'])[2]"));
			mnc.click();
			mnc.click();
			mnc.click();
       Set<String>handles =driver.getWindowHandles();
     // Iterator<String> i=handles.iterator();
       System.out.println(handles);
	}		
}
