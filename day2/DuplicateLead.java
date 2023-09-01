package homeassignment.week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		//Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Login page
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");	
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Home page
		driver.findElement(By.partialLinkText("CRM")).click();
		
//		6	Click Leads link
		driver.findElement(By.linkText("Leads")).click();
		
		//Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
		
//		8	Click on Email
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		
//		9	Enter Email
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("suchitra@gmail.com");
		
//		10	Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		
//		11	Capture name of First Resulting lead
		String row1 = driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).getText();
		System.out.println(row1);
		
//		12	Click First Resulting lead
		driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).click();
		
//		13	Click Duplicate Lead
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
//		14	Verify the title as 'Duplicate Lead'
		String firstName = driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
		
		if(firstName.equals("Duplicate Lead"))
		{
			System.out.println(firstName);
		}
		else
		{
			System.out.println("Not Duplicate Lead");
		}
		
//		15	Click Create Lead
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		
//		16	Confirm the duplicated lead name is same as captured name
		String duplicateName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if (firstName.equals(duplicateName))
		{
			System.out.println("Duplicated lead name is same as captured name" + duplicateName);
		}
		
//		18	Close the browser (Do not log out)
		driver.close();

		}

}
