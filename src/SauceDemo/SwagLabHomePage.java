package SauceDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabHomePage {

@FindBy (xpath="//button[text()='Add to cart']") private WebElement addToCart;
	public SwagLabHomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	public void AddProductCart() {
		addToCart.click();
	}
}
