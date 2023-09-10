package homeassignment.week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentInput{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Step 1: Download and set the path 
		// Step 2: Launch the chromebrowser
		ChromeDriver driver=new ChromeDriver();
		
		// Step 3: Load the URL https://en-gb.facebook.com/
		driver.get("https://www.leafground.com/input.xhtml");
		
		// Step 4: Maximise the window
		driver.manage().window().maximize();
		
		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
//		1. Type your name
		driver.findElement(By.id("j_idt88:name")).sendKeys("Suchitra Devi");
		
//		2. Append Country to this City
		driver.findElement(By.xpath("//input[@value='Chennai']")).sendKeys("India");
		
//		3. Verify if text box is disabled
		String disAble = driver.findElement(By.xpath("//input[contains(@class,'disabled')]")).getText();
		System.out.println(disAble);
		
//		4. Clear the typed text
		driver.findElement(By.xpath("//form[@id='j_idt88']//input[@value='Chennai']")).clear();
		
//		5. Retrieve the typed text
		driver.findElement(By.xpath("//form[@id='j_idt88']//input[@value='My learning is superb so far.']")).sendKeys("Retrieve the typed text");
		
//		6. Type email and Tab. Confirm control moved to next element
		driver.findElement(By.xpath("//form[@id='j_idt88']//input[@placeholder='Your email and tab']")).sendKeys("Type email and Tab. Confirm control moved to next element");
		
//		7. Type about yourself
		driver.findElement(By.xpath("//form[@id='j_idt88']//textarea[@placeholder='About yourself']")).sendKeys("Type about yourself");
		
//		8. Text Editor
		driver.findElement(By.xpath("//div[@class='grid formgrid']//div[@class='ql-editor ql-blank']")).sendKeys("Text Editor");
		
//		9. Just Press Enter and confirm error message*
		driver.findElement(By.xpath("//input[@placeholder='Babu Manickam']/following::input[@name='j_idt106:thisform:age']")).sendKeys("Press Enter and confirm error message*");
		
//		10. Click and Confirm Label Position Changes
		driver.findElement(By.xpath("//input[@placeholder='Babu Manickam']/following::input[@name='j_idt106:float-input']")).sendKeys("Click and Confirm Label");
		
//		11. Type your name and choose the third option
		driver.findElement(By.xpath("//button[@class='ui-autocomplete-dropdown ui-button ui-widget ui-state-default ui-corner-right ui-button-icon-only']")).click();
		driver.findElement(By.xpath("//body[@class='main-body ui-input-filled']//li[text()='3']")).click();
		
		
//		12. Click and Confirm Keyboard appears
		driver.findElement(By.xpath("//div[@class='card']//input[@name='j_idt106:j_idt122']")).click();
		
		
//		13. Custom Toolbar
		driver.findElement(By.xpath("//div[@id='j_idt106:j_idt124']//div[@class='ql-editor ql-blank']//p")).sendKeys("Custom toolbar");
		
		
	}

}
