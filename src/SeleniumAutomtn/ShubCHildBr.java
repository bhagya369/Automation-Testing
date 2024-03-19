package SeleniumAutomtn;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShubCHildBr {
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

	WebElement job=driver.findElement(By.xpath("//a[@data-label='Work from home Jobs']"));
	         
	           job.click();
	}
}
}