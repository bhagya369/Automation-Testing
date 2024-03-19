package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91708\\Pictures\\Screenshots\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		WebElement iframe=driver.findElement(By.xpath("//iframe[@name='SingleFrame']"));
	      driver.switchTo().frame(iframe);

		WebElement iframe2=driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
	iframe2.click();
      driver.switchTo().frame(iframe2);
      WebElement text=driver.findElement(By.xpath("//input[@type='text']"));

}
}