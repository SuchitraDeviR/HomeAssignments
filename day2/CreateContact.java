package homeassignment.week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		//Thread.sleep(2000);
		
		
		//Login page
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");	
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Home page
		driver.findElement(By.partialLinkText("CRM")).click();
		
//		5. Click on contacts Button
		driver.findElement(By.linkText("Contacts")).click();
		
//		 * 6. Click on Create Contact
		driver.findElement(By.linkText("Create Contact")).click();
		
//		 * 7. Enter FirstName Field Using id Locator
		driver.findElement(By.id("firstNameField")).sendKeys("Suchitra Devi");

//		 * 8. Enter LastName Field Using id Locator
		driver.findElement(By.id("lastNameField")).sendKeys("Raghupathy");
		
//		 * 9. Enter FirstName(Local) Field Using id Locator
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Suchi");
		
//		 * 10. Enter LastName(Local) Field Using id Locator
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Raghu");
		
//		 * 11. Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("QA Testing");
		
//		 * 12. Enter Description Field Using any Locator of your choice 
		driver.findElement(By.id("createContactForm_description")).sendKeys("QA Lead creation");
		
//		 * 13. Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("suchitra@gmail.com");
		
//		 * 14. Select State/Province as NewYork Using Visible Text
		WebElement stateDD = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select state=new Select(stateDD);
		state.selectByVisibleText("Arkansas");
		
//		 * 15. Click on Create Contact
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(2000);
		
//		 * 16. Click on edit button 
		driver.findElement(By.linkText("Edit")).click();
		
//		 * 17. Clear the Description Field using .clear
		driver.findElement(By.name("description")).clear();
		
//		 * 18. Fill ImportantNote Field with Any text
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("QA Lead creation - Edited");
		

//		 * 19. Click on update button using Xpath locator
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		Thread.sleep(2000);
		

//		 * 20. Get the Title of Resulting Page.
		String title=driver.getTitle();
		System.out.println(title);
				
		driver.close();
		
		}

}
