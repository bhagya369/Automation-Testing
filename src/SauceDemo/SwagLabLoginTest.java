package SauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.LaunchBrowser;

public class SwagLabLoginTest {

	public void LoginWithValidCredentials() {
 WebDriver driver =LaunchBrowser.Chrome("https://www.saucedemo.com/");
 WebElement username = driver.findElement(By.xpath("//input [@id='user-name']"));
  username.sendKeys("standard_user");
 WebElement password =driver.findElement(By.xpath("//input [@id='password']"));		
        password.sendKeys("secret_sauce");
 WebElement login = driver.findElement(By.xpath("//input [@id='login-button']"));
	login.click();
	}
	
 public void LoginWithLockedOutUser() {
	 
	 WebDriver driver =LaunchBrowser.Chrome("https://www.saucedemo.com/");
	 WebElement username = driver.findElement(By.xpath("//input [@id='user-name']"));
	  username.sendKeys("locked_out_user");
	 WebElement password =driver.findElement(By.xpath("//input [@id='password']"));		
	        password.sendKeys("secret_sauce");
	 WebElement login = driver.findElement(By.xpath("//input [@id='login-button']"));
		login.click();
		}
 
   public void LoginWithProblemUser() {
	 
	 WebDriver driver =LaunchBrowser.Chrome("https://www.saucedemo.com/");
	 WebElement username = driver.findElement(By.xpath("//input [@id='user-name']"));
	  username.sendKeys("problem_user");
	 WebElement password =driver.findElement(By.xpath("//input [@id='password']"));		
	        password.sendKeys("secret_sauce");
	 WebElement login = driver.findElement(By.xpath("//input [@id='login-button']"));
		login.click();
		}
   
   public void LoginWithPerformanceGlitchUser() {
		 
		 WebDriver driver =LaunchBrowser.Chrome("https://www.saucedemo.com/");
		 WebElement username = driver.findElement(By.xpath("//input [@id='user-name']"));
		  username.sendKeys("performance_glitch_user");
		 WebElement password =driver.findElement(By.xpath("//input [@id='password']"));		
		        password.sendKeys("secret_sauce");
		 WebElement login = driver.findElement(By.xpath("//input [@id='login-button']"));
			login.click();
			}
	
	public static void main(String[] args) {
		SwagLabLoginTest swagLabLoginTest= new SwagLabLoginTest();
		swagLabLoginTest.LoginWithValidCredentials();
		swagLabLoginTest.LoginWithLockedOutUser();
		swagLabLoginTest.LoginWithProblemUser();
		swagLabLoginTest.LoginWithPerformanceGlitchUser();
	}
}