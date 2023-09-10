package homeassignment.week2.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class ButtonAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Step 1: Download and set the path 
		// Step 2: Launch the chromebrowser
		ChromeDriver driver=new ChromeDriver();
		
		// Step 3: Load the URL https://www.leafground.com/select.xhtml
		driver.get("https://leafground.com/button.xhtml");
		
		// Step 4: Maximise the window
		driver.manage().window().maximize();
		
		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
//		// Click and Confirm title.
		driver.findElement(By.id("j_idt88:j_idt90")).click();
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.navigate().back();
		
//		Confirm if the button is disabled.
		boolean buttonEnabled = driver.findElement(By.id("j_idt88:j_idt92")).isEnabled();
		System.out.println("Is Button Enabled : "+buttonEnabled);
		
		//Find the position of the Submit button
		WebElement position = driver.findElement(By.id("j_idt88:j_idt94"));
		System.out.println(position.getLocation());
		
		//Find the Save button color
		WebElement color = driver.findElement(By.id("j_idt88:j_idt96"));
		System.out.println(color.getCssValue("background"));
		
		//Find the height and width of this button
		WebElement size = driver.findElement(By.id("j_idt88:j_idt98"));
		System.out.println(size.getSize());
		
		//Mouse over and confirm the color changed
		WebElement colorChange = driver.findElement(By.id("j_idt88:j_idt100"));
		System.out.println("Before Mouse Hover: "+ colorChange.getCssValue("background"));
		Actions mouseOver=new Actions(driver);
		mouseOver.moveToElement(colorChange).perform();
		System.out.println("After Mouse Hover: "+ colorChange.getCssValue("background"));
		
		//Click Image Button and Click on any hidden button
		driver.findElement(By.id("j_idt88:j_idt102:imageBtn")).click();
		driver.findElement(By.id("j_idt88:j_idt102:j_idt104")).click();
		
		//How many rounded buttons are there?
		Select oSelect = new Select(driver.findElement(By.xpath("//div[@class='card']//h5[text()='How many rounded buttons are there?']/following-sibling::Select")));
	    List<WebElement> elem = oSelect.getOptions();
	    int iSize = elem.size();
	    System.out.println("Count of select button " +iSize);
		
		
		driver.close();
	
	}

}
