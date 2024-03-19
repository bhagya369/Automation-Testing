package ActionClassSel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basic.LaunchBrowser;

public class KeyboardAct {
	public static void main(String[] args) {
  WebDriver driver=LaunchBrowser.Chrome("https://demoqa.com/text-box");
  WebElement firname=driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
  WebElement submit = driver.findElement(By.xpath("//button[text()='Submit']"));

  firname.sendKeys("bhagayshri patil");
	 Actions action = new Actions(driver);
	 action.sendKeys(Keys.TAB);
	// action.perform();
	 action.sendKeys("bhagya1123@gmail.com");
	// action.perform();
	 action.sendKeys(Keys.TAB);
	 action.sendKeys("baner pune");
	// action.perform();
	 action.keyDown(Keys.CONTROL);
	 action.sendKeys("a");
	// action.perform();
	 action.sendKeys("c");
//	 action.perform();
	 action.keyUp(Keys.CONTROL);
	 action.scrollToElement(submit);
	// action.perform();
	 action.sendKeys(Keys.TAB);
	 action.keyDown(Keys.CONTROL);
	 action.sendKeys("v");
	// action.perform();
      action.build().perform();
	}
}
