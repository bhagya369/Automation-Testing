package basic;



import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
  
public class LaunchBrowser {
	
	public static WebDriver Chrome(String url)  {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91708\\Pictures\\Screenshots\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get(url);
		driver.manage().window().maximize();
		
		return driver;
	}

	

}
