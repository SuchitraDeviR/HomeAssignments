package homeassignment.week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Step 1: Download and set the path 
		// Step 2: Launch the chromebrowser
		ChromeDriver driver=new ChromeDriver();
		
		// Step 3: Load the URL https://en-gb.facebook.com/
		driver.get("https://leafground.com/checkbox.xhtml");
		
		// Step 4: Maximise the window
		driver.manage().window().maximize();
		
		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Basic Checkbox
		driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
		
		//Notification
		driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
		
		//Choose your favorite language(s)
		driver.findElement(By.xpath("//table[@id='j_idt87:basic']//label[text()='Others']")).click();
		
		//Tri State Checkbox
		driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']")).click();
		
		//Toggle Switch
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		
		//Verify if check box is disabled
		boolean enabled = driver.findElement(By.id("j_idt87:j_idt102")).isEnabled();
		if (enabled!=true) 
		{
			System.out.println("Checkbox is disabled");			
		}
		else
		System.out.println("Checkbox is enabled");	
		
		//Select Multiple
		driver.findElement(By.id("j_idt87:multiple")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='ui-selectcheckboxmenu-items-wrapper']//li[@data-item-value='Amsterdam']/div")).click();
		driver.findElement(By.xpath("//div[@class='ui-selectcheckboxmenu-items-wrapper']//li[@data-item-value='Barcelona']/div")).click();
		driver.findElement(By.xpath("//div[@class='ui-selectcheckboxmenu-items-wrapper']//li[@data-item-value='Paris']/div")).click();
		
		driver.close();
	}

}
