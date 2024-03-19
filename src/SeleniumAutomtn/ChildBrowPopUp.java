package SeleniumAutomtn;

import java.util.BitSet;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ChildBrowPopUp {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =LaunchBrowser.Chrome("https://www.naukri.com/");
	WebElement software=driver.findElement(By.xpath("(//a[@title='MNC'])[2]"));
       software.click();

Set<String>handle=driver.getWindowHandles();
Iterator<String>i=handle.iterator();

while(i.hasNext()) {
    String handles  =i.next();
    driver.switchTo().window(handles);
    System.out.println(handles);
}  
Thread.sleep(2000);
    WebElement job=driver.findElement(By.xpath("//div[text()='Jobs']"));
    Thread.sleep(2000);
    Actions action = new Actions(driver);
    action.moveToElement(job).build().perform();
   
       	
}
}
