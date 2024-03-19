package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {

	public static void main(String[] args) {
		WebDriver driver =LaunchBrowser.Chrome("https://demo.automationtesting.in/Frames.html");
		
	WebElement iframe=driver.findElement(By.xpath("//iframe[@name='SingleFrame']"));
	iframe.click();
	driver.switchTo().frame(iframe);
	WebElement text= driver.findElement(By.xpath("//input[@type='text']"));	
	text.sendKeys("bhagyashri");
	
	
	}
}
