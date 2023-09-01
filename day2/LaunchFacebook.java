package homeassignment.week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchFacebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Step 1: Download and set the path 
		// Step 2: Launch the chromebrowser
		ChromeDriver driver=new ChromeDriver();
		
		// Step 3: Load the URL https://en-gb.facebook.com/
		driver.get("https://en-gb.facebook.com/");
		
		// Step 4: Maximise the window
		driver.manage().window().maximize();
		
		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Step 6: Click on Create New Account button
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		// Step 7: Enter the first name		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Suchitra Devi");
		
		// Step 8: Enter the last name
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Raghupathy");
				
		// Step 9: Enter the mobile number
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9876543211");
		
		// Step 10: Enter the password
		driver.findElement(By.id("password_step_input")).sendKeys("P@ssw0rd");
		
		// Step 11: Handle all the three drop downs
		WebElement dayDD = driver.findElement(By.id("day"));
		Select day=new Select(dayDD);
		day.selectByValue("21");
		
		WebElement monthDD = driver.findElement(By.id("month"));
		Select month=new Select(monthDD);
		month.selectByVisibleText("Mar");
		
		WebElement yearDD = driver.findElement(By.id("year"));
		Select year=new Select(yearDD);
		year.selectByVisibleText("2001");
		
		// Step 12: Select the radio button "Female" 
		driver.findElement(By.xpath("//label/following-sibling::input[1]")).click();
		            
		
	}

}
