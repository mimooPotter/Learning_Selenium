import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ChromeDriver driver = new ChromeDriver();
		//webdriver methods can access webdriver methods + class methods
		
//		System.setProperty("webdriver.chrome.driver", "/users/mimoo/Documents/chromeDriver");   [to invoke the browser from local storage]
		
//		to  invoke the browser through selenium manager
		
		WebDriver driver = new ChromeDriver();
		
		
		//firefox launch
//		System.setProperty("webdriver.gecko.driver", "/users/mimoo/Documents/chromeDriver"); 
//		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		//driver.close();  
		// driver.quit can also be used. difference is close will only close what selenium has opened however quit will also closed any concurrent tab that was opened during automation

	}

}
