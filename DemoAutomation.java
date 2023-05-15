

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


	




	public class DemoAutomation {
	
		
	
		public static void main (String[] args) throws InterruptedException  {
			
		        
		        WebDriver driver = new ChromeDriver();
		        driver.get("https://dev.klaarhq.com/auth/sign_in");
//		        WebElement login=driver.findElement(By.xpath("//p[text()='Log in with klaar']"));
//			   login.click();
//			   WebElement emails=driver.findElement(By.id("email-field"));
//				 emails.clear();
//			     emails.sendKeys("deepa.nayak@gamma.klaar.team");
//			     WebElement passwords=driver.findElement(By.id("password-field"));
//				 passwords.clear();
//			     passwords.sendKeys("Klaar2021");
//			     WebElement LOgin =driver.findElement(By.id("login-btn"));
//				 LOgin.click();

//	 ----------------------------------------------------------------------------		    

				 
		        WebDriver driver = new ChromeDriver();
		        driver.get("https://dev.klaarhq.com/auth/sign_in");
  	        WebElement login=driver.findElement(By.xpath("//p[text()='Log in with goggle']"));
//			   login.click();
//			   WebElement emails=driver.findElement(By.id("email-field"));
//				 emails.clear();
//			     emails.sendKeys("deepa.nayak@gamma.klaar.team");
//			     WebElement passwords=driver.findElement(By.id("password-field"));
//				 passwords.clear();
//			     passwords.sendKeys("Klaar2021");
//			     WebElement LOgin =driver.findElement(By.id("login-btn"));
//				 LOgin.click();	    		

  	     

  	    

  	   

  	    
  	    driver.get('https://dev.klaarhq.com/auth/sign_in')

  	     Find and click the Google login button
  	    google_login_button = driver.find_element_by_xpath("//button[@data-provider='google_oauth2']")
  	    google_login_button.click()

  	   
  	    driver.implicitly_wait(10)

  	    
  	    email_input = driver.find_element_by_xpath("//input[@type='email']")
  	    email_input.send_keys('your_google_email@example.com')
  	    email_input.send_keys(Keys.ENTER)
  	    driver.implicitly_wait(10)

  	    Enter your Google password
  	    password_input = driver.find_element_by_xpath("//input[@type='password']")
  	    password_input.send_keys('your_google_password')
  	    password_input.send_keys(Keys.ENTER)

  	   )

  	   




		}

		
	 
		
	
	}
