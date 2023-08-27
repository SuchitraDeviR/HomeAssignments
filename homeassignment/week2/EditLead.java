package homeassignment.week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

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
		//Lead page
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Create Lead page
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Microsoft");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Suchitra Devi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Raghupathy");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Suchi");
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("QA Testing");
		driver.findElement(By.name("description")).sendKeys("QA Lead creation");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("suchitra@gmail.com");
				
		//select State/Province dropdown
		WebElement stateDD = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select state=new Select(stateDD);
		state.selectByValue("NY");
		
		driver.findElement(By.name("submitButton")).click();
		
		String title=driver.getTitle();
		System.out.println(title);
	
	}

}
