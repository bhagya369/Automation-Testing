package SauceDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.LaunchBrowser;

public class AddToCart {

			public void AddToCardProduct() {
	 WebDriver driver =LaunchBrowser.Chrome("https://www.saucedemo.com/");
	 WebElement username = driver.findElement(By.xpath("//input [@id='user-name']"));
	  username.sendKeys("standard_user");
	 WebElement password =driver.findElement(By.xpath("//input [@id='password']"));		
	        password.sendKeys("secret_sauce");
	 WebElement login = driver.findElement(By.xpath("//input [@id='login-button']"));
		login.click();
		List<WebElement>addtocart1 =driver.findElements(By.xpath("//button[text()='Add to cart']"));
		addtocart1.get(0).click();
		}
	public static void main(String[] args) {
		AddToCart addtocart = new AddToCart();
		addtocart.AddToCardProduct();
	}	
}
