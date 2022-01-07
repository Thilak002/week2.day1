package week2.day1;

import java.nio.channels.SelectionKey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys( "DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("rajthilak");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("G");
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
	    Select dropdown = new Select(source);
	    dropdown.selectByVisibleText("Employee"); 
	    driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("tk");
	    driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("raj");
	    driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("12-02-1997");
	    driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("15");
	    WebElement source1 = driver.findElement(By.id("createLeadForm_industryEnumId"));
	    Select dropdown1 = new Select(source1);
	    dropdown1.selectByValue("IND_DISTRIBUTION");
	    driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9456781245");
	    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("thilakrajj002@gmail.com");
	    driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("12/5-gandhi nagar");
	    driver.findElement(By.name("generalCity")).sendKeys("chennai");
	    driver.findElement(By.name("submitButton")).click();
	    driver.close();
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    

	}
		
	}

