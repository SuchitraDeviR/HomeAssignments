package homeassignment.week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

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
		driver.findElement(By.linkText("Leads")).click();
		
//		* 7	Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
		
//		* 8	Enter first name
		driver.findElement(By.id("ext-gen248")).sendKeys("Suchitra");
		
//		* 9	Click Find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		
//		* 10 Click on first resulting lead
		driver.findElement(By.xpath("//div[@id='ext-gen234']//div[@class='x-grid3-scroller']//td//a[@class='linktext']")).click();
		
//		* 11 Verify title of the page
		System.out.println(driver.getTitle());
		
//		* 12 Click Edit
		driver.findElement(By.linkText("Edit")).click();
		
//		* 13 Change the company name
		String companyName = driver.findElement(By.id("updateLeadForm_companyName")).getText();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Likewize");
		
//		* 14 Click Update
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
//		* 15 Confirm the changed name appears
		String newCompanyName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if(companyName.equals(newCompanyName))
		{
			System.out.println(companyName);
		}
		else
		{
			System.out.println(newCompanyName);
		}
//		* 16 Close the browser (Do not log out)
		driver.close();
	
	}

}
