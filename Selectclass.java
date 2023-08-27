package Week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		
		System.out.println(title);
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Link Text
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.partialLinkText("Leads")).click();
		
		
		driver.findElement(By.partialLinkText("Create Lead")).click();
		
		//Create Lead form
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("SLM");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Test");
		
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("leaf");
		
		
		//Select Class
		
		
	WebElement dropdown=driver.findElement(By.id("createLeadForm_dataSourceId"));
	
	Select sel = new Select(dropdown);
		
	sel.selectByValue("LEAD_DIRECTMAIL");//select by value
		
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Flocalname");
	
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
	
	//Description
	
	
		
	driver.findElement(By.id("createLeadForm_description")).sendKeys("Count words and more with the best free");	
	
	//Entering Mail id as Input
	
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("magesh215@gmail.com");
	
	
	// Selecting the state 
	
	WebElement state=driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
	
	Select prov= new Select(state);
	
	prov.selectByVisibleText("Australia");
	
	
	
	//Create Lead
	driver.findElement(By.className("smallSubmit")).click();
	
	
	
	//Editing the Created Lead
	
	driver.findElement(By.linkText("Edit")).click();
	
	driver.findElement(By.id("updateLeadForm_description")).clear();
	
	driver.findElement(By.id("updateLeadForm_description")).sendKeys("Update lead");
	
	driver.findElement(By.name("submitButton")).click();
	
	Thread.sleep(5000);

	driver.close();
	
	
	
	
	
	
	
	}

}
