package ActionClassSel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basic.LaunchBrowser;

public class DragandDrop {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=LaunchBrowser.Chrome("https://www.globalsqa.com/demo-site/draganddrop/");
    
	WebElement iframe=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
      driver.switchTo().frame(iframe);

//	WebElement drimg=driver.findElement(By.xpath("//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle'][1]"));
//	WebElement drimg1=driver.findElement(By.xpath("//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle'][2]"));
//	WebElement drimg2=driver.findElement(By.xpath("//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle'][3]"));
//	WebElement drimg3=driver.findElement(By.xpath("//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle'][4]"));

//	WebElement target=driver.findElement(By.xpath("//div[@id='trash']"));
//    Actions action = new Actions(driver);
        
//        action.dragAndDrop(drimg, target);
//    	Thread.sleep(2000);
//
//        action.dragAndDrop(drimg1, target);
//    	Thread.sleep(2000);
//        action.perform();
//        action.dragAndDrop(drimg2, target);
//    	Thread.sleep(2000);
//        action.perform();
//        action.dragAndDrop(drimg3, target);
//        action.perform();
    List<WebElement> drag=  driver.findElements(By.xpath("//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle']"));      
        drag.size();
       WebElement target=driver.findElement(By.xpath("//div[@id='trash']"));
        Actions action = new Actions(driver);
        
        for(int i=0; i<drag.size();i++) {
        action.dragAndDrop(drag.get(i), target);
    	Thread.sleep(2000);
        action.perform();
        }
        Thread.sleep(2000);

        
   List<WebElement>recycle= driver.findElements(By.xpath("//a[@title='Recycle this image']"));

   for(int i =0; i<recycle.size();i++ ) {
    	recycle.get(i).click();
        }
}
}
