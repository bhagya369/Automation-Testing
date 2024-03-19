package basic;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoGuru1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\91708\\Pictures\\Screenshots\\chromedriver\\chromedriver-win64\\chromedriver.exe");
 WebDriver driver =new ChromeDriver();
		 driver.get("https://demo.guru99.com/insurance/v1/index.php");
 
 WebElement email= driver.findElement(By.xpath("//input[@autofocus='autofocus']"));
 email.sendKeys("1303");
 WebElement pwd= driver.findElement(By.xpath("//input[@id='password']"));
 pwd.sendKeys("Guru99");
 
 
	
}
}
