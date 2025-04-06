import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		System.setProperty("webdriver.chrome.driver", "/users/mimoo/Documents/chromeDriver");   //[to invoke the browser from local storage]
				
//				to  invoke the browser through selenium manager
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://rahulshettyacademy.com/locatorspractice/");
				driver.findElement(By.id("inputUsername")).sendKeys("mimoo");
				driver.findElement(By.name("inputPassword")).sendKeys("hello123");
				driver.findElement(By.className("signInBtn")).click();
				
				
				/*How to create css selector
				 * 
				 * <input type="text" placeholder="Username" id="inputUsername" value="">
				 * 
				 * input> tag name
				 * red> attribute
				 * green> attribute associated value
				 * 
				 * <button class="submit signInBtn" type="submit">Sign In</button>
				 * class name > tagname.classname >> button.signInBtn
				 * id> tagname#id >> input#inputUsername
				 * 
				 * Tagname[attribute='value']   ;for generic if you dont have classname/id
				 * 
				 *  <input type="text" placeholder="Username"  value="">
				 *  Tagname[placeholder="Username"]
				 *  
				*/
				
				
				//<p class="error">* Incorrect username or password </p>
				
				System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
	}

}
