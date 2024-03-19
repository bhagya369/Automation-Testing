package basic;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp {
 public static void main(String[] args) throws IOException {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\91708\\Pictures\\Screenshots\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		WebElement jsalert = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
             jsalert.click();
             Alert alert = driver.switchTo().alert();
             System.out.println(alert.getText());
              alert.accept();
            
              ScreenShot.takeScreenshot(driver,"alert");
 }
}
