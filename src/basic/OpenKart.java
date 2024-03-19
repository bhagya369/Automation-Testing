package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import SetUp.BaseClass;

public class OpenKart extends BaseClass{                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	BaseClass.Chrome("https://www.opencart.com/?route=account/login");
	WebElement loginclk=driver.findElement(By.xpath("//input[@id='input-email']"));
			
	loginclk.sendKeys("bhagya");

}
}