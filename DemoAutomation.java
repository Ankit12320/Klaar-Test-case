

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


	




	public class DemoAutomation {
	
		
	
		public static void main (String[] args) throws InterruptedException  {
			
		        
		        WebDriver driver = new ChromeDriver();
		        driver.get("https://dev.klaarhq.com/auth/sign_in");
		        WebElement login=driver.findElement(By.xpath("//p[text()='Log in with klaar']"));
			   login.click();
			   WebElement emails=driver.findElement(By.id("email-field"));
				 emails.clear();
			     emails.sendKeys("deepa.nayak@gamma.klaar.team");
			     WebElement passwords=driver.findElement(By.id("password-field"));
				 passwords.clear();
			     passwords.sendKeys("Klaar2021");
			     WebElement LOgin =driver.findElement(By.id("login-btn"));
				 LOgin.click();

//	 ----------------------------------------------------------------------------		    

	
		
		}

		
	 
		
	
	}
