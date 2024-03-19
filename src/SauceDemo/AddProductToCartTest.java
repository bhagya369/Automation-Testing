package SauceDemo;

import org.openqa.selenium.WebDriver;

import basic.LaunchBrowser;

public class AddProductToCartTest {
	public void AddProductToCart() {
  WebDriver driver = LaunchBrowser.Chrome("https://www.saucedemo.com/");
  
  SwagLabLoginPage swagLabLoginPage = new SwagLabLoginPage(driver);
  swagLabLoginPage.enterUserName("Problem_user");
  swagLabLoginPage.enterPassword("secret_sauce");
  swagLabLoginPage.clickOnLogin();
 
  SwagLabHomePage swagLabHomePage = new SwagLabHomePage(driver);
  swagLabHomePage.AddProductCart();
  
  }	
	public static void main(String[] args) {
		AddProductToCartTest addProductToCartTest= new AddProductToCartTest();
		//addProductToCartTest.AddProductCart();
		
	}
	
}
