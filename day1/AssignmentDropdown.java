package homeassignment.week2.day1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class AssignmentDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Step 1: Download and set the path 
		// Step 2: Launch the chromebrowser
		ChromeDriver driver=new ChromeDriver();
		
		// Step 3: Load the URL https://www.leafground.com/select.xhtml
		driver.get("https://www.leafground.com/select.xhtml");
		
		// Step 4: Maximise the window
		driver.manage().window().maximize();
		
		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
//		// Which is your favorite UI Automation tool?
		WebElement toolDD = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select tool=new Select(toolDD);
		tool.selectByVisibleText("Selenium");
		
		//Choose your preferred country.
		driver.findElement(By.id("j_idt87:country_label")).click();
		driver.findElement(By.xpath("//div[@class='ui-selectonemenu-items-wrapper']//li[text()='India']")).click();
		
		//Confirm Cities belongs to Country is loaded
		Thread.sleep(2000);
		driver.findElement(By.id("j_idt87:city")).click();
		driver.findElement(By.xpath("//div[@class='ui-selectonemenu-items-wrapper']//li[text()='Chennai']")).click();
		
		//Choose the Course
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='ui-autocomplete-dropdown ui-button ui-widget ui-state-default ui-corner-right ui-button-icon-only']")).click();
		driver.findElement(By.xpath("//span[@id='j_idt87:auto-complete_panel']//li[text()='PostMan']")).click();
		
		//Choose language randomly
//		Thread.sleep(2000);
		driver.findElement(By.id("j_idt87:lang")).click();
		driver.findElement(By.xpath("//div[@id='j_idt87:lang_panel']//li[text()='Tamil']")).click();
		
		//Select 'Two' irrespective of the language chosen
		Thread.sleep(2000);
		driver.findElement(By.id("j_idt87:value")).click();
		driver.findElement(By.xpath("//div[@id='j_idt87:value_panel']//li[text()='மூன்று']")).click();
		
		driver.close();
	
	}

}
