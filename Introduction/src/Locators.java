import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
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
				
				
				/*how to create xpath
				 * //Tagname[@attribute='value']
				 * example: <input type="text" placeholder="Name">
				 *  //input[@placeholder='name']
						 
				 */
				
				driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("mimoo");
				
				/* <input type="text" placeholder="Email">
				 * input[placeholder='Email']
				 * */
				driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("mimoo@gmail.com");
				driver.findElement(By.xpath("//input[@type=\"text\"][2]")).clear();  //to clear the field
				// (//tagname[@attribute='value'][2] = here 2 is the index number when you dont have a unique attribute. //Tagname[@attribute='value'][index]
				driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("mimoo123@gmail.com");
				driver.findElement(By.xpath("//form/input[3]")).sendKeys("0199105"); //custom xpath with parent child : //parentTagName/childTagName[index]
				driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
				//for css with parent-child ParentTagName childTagName
				System.out.println(driver.findElement(By.cssSelector("form p")).getText());
				
				driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();  //using xpath parent child attribute
				Thread.sleep(1000);
				
				driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Mimoo");
				driver.findElement(By.cssSelector("input[placeholder*='Pass']")).sendKeys("rahulshettyacademy");
				driver.findElement(By.id("chkboxOne")).click();
				driver.findElement(By.cssSelector("button[class*='submit']")).click();
				
				//driver.findElement(By.cssSelector("button[class*='login-btn']"));
			
	}

}
