package homeassignment.week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

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
		
//		8	Click on Phone
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		
//		9	Enter phone number
		driver.findElement(By.name("phoneNumber")).sendKeys("9876543210");
		
//		10	Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		
//		11	Capture lead ID of First Resulting lead
		String row1 = driver.findElement(By.xpath("//div[@id='ext-gen234']//div[@class='x-grid3-scroller']//td//a[@class='linktext']")).getText();
		System.out.println(row1);
		
//		12	Click First Resulting lead
		driver.findElement(By.xpath("//div[@id='ext-gen234']//div[@class='x-grid3-scroller']//td//a[@class='linktext']")).click();
		
//		13	Click Delete
		driver.findElement(By.linkText("Delete")).click();
		
//		14	Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(2000);
		
//		15	Enter captured lead ID
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(row1);
		Thread.sleep(2000);
		
//		16	Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		
//		17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		String noRow = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		if(noRow.equals("No records to display"))
		{
			System.out.println("No records to display in the Lead List");
		}
		else
		{
			System.out.println("There are records to display in the Lead List");
		}
		
//		18	Close the browser (Do not log out)
		driver.close();

		}

}
