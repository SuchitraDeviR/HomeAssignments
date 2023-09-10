package homeassignment.week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Step 1: Download and set the path 
		// Step 2: Launch the chromebrowser
		ChromeDriver driver=new ChromeDriver();
		
		// Step 3: Load the URL https://en-gb.facebook.com/
		driver.get("https://leafground.com/radio.xhtml");
		
		// Step 4: Maximise the window
		driver.manage().window().maximize();
		
		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Your most favorite browser
		driver.findElement(By.xpath("//table[@id='j_idt87:console1']//td//label[text()='Edge']")).click();
		
		//UnSelectable
		driver.findElement(By.xpath("//div[@id='j_idt87:city2']//label[text()='Hyderabad']")).click();
		
		//Find the default select radio button
		if(driver.findElement(By.id("j_idt87:console2:0")).isSelected()==true)
		{
			System.out.println("Default selected is : Chrome");
		}
		else if(driver.findElement(By.id("j_idt87:console2:1")).isSelected()==true)
		{
			System.out.println("Default selected is : Firefox");
		}
		else if(driver.findElement(By.id("j_idt87:console2:2")).isSelected()==true)
		{
			System.out.println("Default selected is : Safari");
		}
		else
		{
			System.out.println("Default selected is : Edge");
		}
		
		
		//Select the age group (only if not selected)
		if(driver.findElement(By.xpath("//input[@value='1-20 Years']")).isSelected()==true)
		{
			System.out.println("Default selected is : 1-20 Years");
			
		}
		else if(driver.findElement(By.xpath("//input[@value='21-40 Years']")).isSelected()==true)
		{
			System.out.println("Default selected is : 21-40 Years");
			
		}
		
		else
		{
			driver.findElement(By.xpath("//input[@value='41-60 Years']")).click();
		}
		
	driver.close();
	}

}
