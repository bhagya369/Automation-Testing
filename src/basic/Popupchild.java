package basic;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popupchild {
public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\91708\\Pictures\\Screenshots\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
//WebElement hand= driver.findElement(By.xpath("//button[@id='newWindowBtn']"));
//   hand.click();
//   Thread.sleep(3000);
//   WebElement hand2= driver.findElement(By.xpath("(//button[@onclick='newBrowserTab()']"));
//   hand2.click();
WebElement hand3= driver.findElement(By.xpath("//button[@onclick='newTabsBrowserWindows()']"));
hand3.click();
//System.out.println(driver.getCurrentUrl());
//System.out.println(driver.getTitle());
        Set<String>handles = driver.getWindowHandles();
        Iterator<String>i=handles.iterator();
        while(i.hasNext()){
        String handle =i.next();
        
        driver.switchTo().window(handle);
        String currentTitle=driver.getTitle();
        System.out.println(currentTitle);
        
        }
	}
}
