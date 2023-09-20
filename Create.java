package Week5.day1.Assignment1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Create extends Baseclass {

	@Test
	public void create() {
		
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Subraja");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Subi");
	driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
	driver.findElement(By.name("submitButton")).click();
	String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
	if (text.contains("Testleaf")) {
		System.out.println("Lead created successfully");
	}
	else {
		System.out.println("Lead is not created");
	}
	


}

	
	
}
