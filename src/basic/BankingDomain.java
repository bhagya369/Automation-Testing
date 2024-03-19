package basic;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BankingDomain {
  public static void main(String[] args) {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\91708\\Pictures\\Screenshots\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
WebElement bankf= driver.findElement(By.xpath("(//a[@title='MNC'])[2]"));
          bankf.click();
        Set<String>handle =driver.getWindowHandles();
               Iterator<String> i  = handle.iterator();
          while(i.hasNext()) {
        	     String handles  =i.next();
        	     driver.switchTo().window(handles);
        	     System.out.println(handles);
          }
          WebElement data=driver.findElement(By.xpath("//i[@class='ni-icon-unchecked']"));
	  data.click();
	  System.out.println(driver.getTitle());
	  
}
}
