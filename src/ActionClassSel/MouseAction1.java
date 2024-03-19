package ActionClassSel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basic.LaunchBrowser;

public class MouseAction1 {

	public static void main(String[] args) {
		      WebDriver driver =LaunchBrowser.Chrome("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement rightclk=driver.findElement(By.xpath("//span[text()='right click me']"));
		WebElement doubleclk=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));

		Actions action =new Actions(driver);
         action.contextClick(rightclk);
       //action.doubleClick(doubleclk);
        // action.dragAndDrop(rightclk, doubleclk);
		//action.scrollToElement(doubleclk);
		
		action.perform();
		
         
         
	}
}
