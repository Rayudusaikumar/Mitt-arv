package Mittarv;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_otp {
	
	public static void main(String[]args) throws Exception{
		
		System.setProperty("webdriver.chrome.driver","C:\\Java_Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
				
				WebDriver driver=new ChromeDriver();


			        
			           
			            driver.get("https://app.mittarv.com/");

			            // Create WebDriverWait object with an increased timeout of 20 seconds
			            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

			            // Wait for the element to be visible
			            WebElement imageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div[1]/div/div/div[2]/div/div/div[3]/input")));
			            
			            imageElement.sendKeys("saikumarrayudu31@gmail.com");
			            
			            driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div/div[2]/div/div/div[3]/button")).click();
			            
			            Thread.sleep(20000);
			            
			            
			            driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div/div[2]/div/div/div/button[2]")).click();
			            
			            Thread.sleep(5000);
			            
			            WebElement addbutton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='add_contact_btn label-03-bold' and text()='Add Contact']")));

			         
			            addbutton.click();
			            
			            Thread.sleep(2000);
			            
			            
			            
			            WebElement inputElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='John Doe']")));

			        
			            inputElement.sendKeys("who");
			            
			            
			            WebElement emailElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='jane-doe@example.com']")));

			         
			            emailElement.sendKeys("hello1@gmail.com");
			            
			            Thread.sleep(2000);
			            
			            
			            WebElement nextbutton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='B48' and contains(text(),'Next')]")));

			           
			            nextbutton.click();
			            
			            Thread.sleep(1000);
			            
			            
			            WebElement dropElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src='/assets/dropdownArrow-dfb7da39.svg']")));

			            
			            dropElement.click();
			            Thread.sleep(1000);
			            
			            WebElement countryField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='search-inp']//input")));

			            countryField.sendKeys("India");
			            
			            Thread.sleep(1000);
			            
			            WebElement codecountry = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='t105' and text()='91']")));
			            
			            codecountry.click();
			            
			            Thread.sleep(1000);
			            

			            
			            
			            WebElement phoneElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='0000000000']")));

			       
			            phoneElement.sendKeys("123456890");
			            
			            
			            Thread.sleep(2000);
			            
			           
			            
			            
			         
			            
			            WebElement Done = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(), 'Done')]")));

			           
			            Done.click();
			          
			            
			            
			            
			     

			            System.out.println("Button clicked successfully!");
			            
			            
			            Thread.sleep(2000);
			            
			            
			            
			            
			            
			            
			        /*    WebElement will = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src='/assets/createEw-68079186.svg']")));
			            
			            will.click();
			            

			            Thread.sleep(2000);
			            
			            
			            
			            WebElement textwill = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='New Text Will']")));
			            
			            textwill.click();
			            
			            
			            WebElement imageAdd = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src='/assets/contact-remove-icon-a882489c.svg' and @alt='weg']")));
			            
			            imageAdd.click();
			            
			            WebElement searchName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='t32' and @type='text']")));
			            searchName.sendKeys("sai");
			            
			            WebElement FoundName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='t105' and text()='sai']")));
			            FoundName.click();
			            
			            
			            
			            WebElement subject = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text' and @class='subject_input_field']")));
			            
			            subject.sendKeys("About the will");
			            
			            
			            WebElement editableDiv = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='ql-editor ql-blank' and @contenteditable='true']")));
			            
			            editableDiv.sendKeys("hi this is saikumar how are you?");
			            
			            
			            WebElement save = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src='/assets/bookmark-icon-e31a8003.svg' and @alt='']")));
			            
			            save.click();
			            
			            */
			            
			            
			            
			            
			            
			            
			      
			            
			            
			            
			            
			            
			            
			            
			            
			            
			            
			            
			            

			            
			           
			            
			            
			   
			            
			            

}
	
}
