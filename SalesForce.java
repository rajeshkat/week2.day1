package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			// Step 1: Download and set the path 
		ChromeDriverManager.chromedriver().setup();
		
			// Step 2: Launch the chromebrowser
		ChromeDriver driver = new ChromeDriver();
			// Step 3: Load the URL https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
			// Step 4: Maximise the window
		driver.manage().window().maximize();
			// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			// Step 6: Fill in all the text boxes
		driver.findElement(By.name("UserFirstName")).sendKeys("Rajesh");
		driver.findElement(By.name("UserLastName")).sendKeys("Katyal");
		driver.findElement(By.name("UserEmail")).sendKeys("rajeshkatyal17@gmail.com");
		driver.findElement(By.name("CompanyName")).sendKeys("IHS-Markit");
		driver.findElement(By.name("UserPhone")).sendKeys("7838259000");
			// Step 7: Handle all the dropdowns
		WebElement drop1 =driver.findElement(By.name("UserTitle"));
		Select drpdown1 =new Select(drop1);
		drpdown1.selectByValue("Sales_Manager_AP");
		
		WebElement drop2 =driver.findElement(By.xpath("//select[@name='CompanyEmployees']"));
		Select drpdown2 =new Select(drop2);
		drpdown2.selectByValue("250");
		
		WebElement drop3 =driver.findElement(By.xpath("//select[@name='CompanyCountry']"));
		Select drpdown3 =new Select(drop3);
		drpdown3.selectByValue("US");
		
			// Step 8: Click the check box
		driver.findElement(By.xpath("(//div[@class='field']/div)")).click();
			// Step 9: Close the browser
		//driver.close();
//			*Note: No need click Start my freeTrial

	}

}
