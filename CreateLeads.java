package week2.day1;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeads {
	
	public static void main(String[] args) {

//Launch URL "http://leaftaps.com/opentaps/control/login"
	
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver= new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	
	//maximize the window 
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
// Enter UserName and Password 
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	
//	 3. Click on Login Button 
	driver.findElement(By.className("decorativeSubmit")).click();
	
//	 4. Click on CRM/SFA Link
	driver.findElement(By.linkText("CRM/SFA")).click();
	
//	 5. Click on Leads Button
	driver.findElement(By.linkText("Leads")).click();
	
	 
//	 6. Click on create Lead Button
	driver.findElement(By.linkText("Create Lead")).click();
	  
//	 7. Enter all the text fields in CreateLead page
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Test123");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Test345");
	driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("08/15/2021");

//         **Note
//              1. Donot work on Parent Account Field
//              2.Enter the Birthdate using SendKeys

//	 8. Enter all the text fields in contact information
	WebElement countrycode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
	countrycode.clear();
	countrycode.sendKeys("5");
	driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("123");
	driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("1233456790");
	driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.test.com");
	driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("989784849");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("rajeshkatyal17@gmail.com");
	driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("test5434");
	
	
	
	
 
//	 9. Enter all the text fields in primary address
	driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Rajesh Katyal");
	driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("C/O:Subhash Katyal");
	driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("521/6 Govind Puri");
	driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("KalkaJi, New Delhi");
	driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("New Delhi");
	driver.findElement(By.xpath("//input[@id='createLeadForm_generalPostalCode']")).sendKeys("110019");
	
	WebElement drop1 =driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	Select drpdown = new Select(drop1);
	drpdown.selectByValue("AZ");
	
//	 10. Get the Firstname and print it
	String first_name=driver.findElement(By.id("createLeadForm_firstName")).getAttribute("value");
	System.out.println(first_name);
	  
//	 11. Click on create Lead Button 
	driver.findElement(By.name("submitButton")).click();
	 
//	 12. Get and Verify the Title of the resulting Page(View Lead)
	String ttl=driver.getTitle();
	String ttl1= "View Lead | opentaps CRM";
	if(ttl.equals(ttl1))
	{
		System.out.println("Verified");
	}
	else 
		System.out.println("Not verified");

	}

}

