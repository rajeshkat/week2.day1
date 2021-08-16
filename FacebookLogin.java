package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		// Step 1: Download and set the path 
		WebDriverManager.chromedriver().setup();
		
		// Step 2: Launch the chromebrowser
		ChromeDriver driver = new ChromeDriver();
		
		// Step 3: Load the URL https://en-gb.facebook.com/
		driver.get("https://en-gb.facebook.com/");
		
		// Step 4: Maximise the window
		driver.manage().window().maximize();
		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Step 6: Click on Create New Account button
		driver.findElement(By.linkText("Create New Account")).click();
		
		// Step 7: Enter the first name
		driver.findElement(By.name("firstname")).sendKeys("Rajesh");
		
		// Step 8: Enter the last name
		driver.findElement(By.name("lastname")).sendKeys("Katyal");
		// Step 9: Enter the mobile number
		driver.findElementByXPath("//input[@name='reg_email__']").sendKeys("8178202428");
		
		// Step 10: Enterthe password
		driver.findElement(By.name("reg_passwd__")).sendKeys("Nirvi@2019");
		
		// Step 11: Handle all the three drop downs
		
	 WebElement dropday=driver.findElement(By.name("birthday_day"));
	 Select drpdown= new Select(dropday);
	 drpdown.selectByIndex(17);
	 
	 WebElement dropmonth=driver.findElement(By.name("birthday_month"));
	 Select drpdown1= new Select(dropmonth);
	 drpdown1.selectByVisibleText("Nov");
	 
	 WebElement dropyear=driver.findElement(By.name("birthday_year"));
	 Select drpdown2= new Select(dropyear);
	 drpdown2.selectByValue("1986");
	 
		
		// Step 12: Select the radio button "Female" 
	 driver.findElementByXPath("(//input[@name='sex']/preceding-sibling::label)[2]").click();
//		            ( A normal click will do for this step) 

	}

}
