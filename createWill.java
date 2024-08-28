package Mittarv;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateWill {
	
	
public static void main(String[]args) throws Exception{
		
		System.setProperty("webdriver.chrome.driver","C:\\Java_Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
				
				WebDriver driver=new ChromeDriver();


			        
			           
			            driver.get("https://app.mittarv.com/");

			            // Create WebDriverWait object with an increased timeout of 20 seconds
			            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

			            // Wait for the element to be visible
			            WebElement imageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div[1]/div/div/div[2]/div/div/div[3]/input")));
			            
			            imageElement.sendKeys("saikumarnaveen31@gmail.com");
			            
			            driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div/div[2]/div/div/div[3]/button")).click();
			            
			            Thread.sleep(20000);
			            
			            
			            driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div/div[2]/div/div/div/button[2]")).click();
			            
			            Thread.sleep(5000);
			            
			            WebElement addbutton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='add_contact_btn label-03-bold' and text()='Add Contact']")));

			         
			            addbutton.click();
			            
			            Thread.sleep(1000);
			            
			            
 WebElement will = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src='/assets/createEw-68079186.svg']")));
			            
			            will.click();
			            

			            Thread.sleep(2000);
			            
			            
			            
			            WebElement textwill = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='New Text Will']")));
			            
			            textwill.click();
			            
			            Thread.sleep(1000);
			            
			            
			            WebElement imageAdd = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src='/assets/contact-remove-icon-a882489c.svg' and @alt='weg']")));
			            
			            imageAdd.click();
			            
			            Thread.sleep(1000);
			            
			            WebElement searchName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='t32' and @type='text']")));
			            searchName.sendKeys("sai");
			            
			            Thread.sleep(1000);
			            
			            WebElement FoundName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='t105' and text()='sai']")));
			            FoundName.click();
			            
			            Thread.sleep(1000);
			            
			            
			            
			            
			            
			            WebElement subject = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text' and @class='subject_input_field']")));
			            
			            subject.sendKeys("About the will");
			            Thread.sleep(1000);
			            
			            
			            
			            
			            WebElement editableDiv = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='ql-editor ql-blank' and @contenteditable='true']")));
			            
			            editableDiv.sendKeys("the faculty of conscious and deliberate choice of action; volition voluntaryvolitive. the act or an instance of asserting a choice. the declaration of a person's wishes regarding the disposal of his or her property after death testamentary. a revocable instrument by which such wishes are expressed.");
			            
			            Thread.sleep(1000);
			            WebElement save = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src='/assets/bookmark-icon-e31a8003.svg' and @alt='']")));
			            
			            save.click();
			            
			            Thread.sleep(1000);
			            
			            
			            WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Done') and contains(@class,'b45temp') and contains(@class,'b45light')]")));

			            // Click the button
			            button.click();
			            
			            Thread.sleep(1000);
			            
			            WebElement Logout = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='profile_utility_route_desc Lg-body-01-medium' and text()='Logout']")));

			            // Perform actions with the <p> element (e.g., click if it is clickable)
			            Logout.click(); 

}

}
