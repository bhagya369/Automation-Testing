package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\91708\\Pictures\\Screenshots\\chromedriver\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
WebElement rightClk=driver.findElement(By.xpath("//span[text()='right click me']"));
WebElement doubClk=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));


Actions actions= new Actions(driver);
	actions.contextClick(rightClk);
	actions.contextClick(doubClk);

	actions.perform();
}
}
