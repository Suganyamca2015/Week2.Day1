package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException
	{
		//Setup ChromeDriver
		WebDriverManager.chromedriver().setup();

		//Open the Browser
		ChromeDriver driver= new ChromeDriver();

		//Load the URL
		driver.get("http://leaftaps.com/opentaps/control/login");

		//Maximize the Window
		driver.manage().window().maximize();

		//Identify WebElement
		WebElement ele = driver.findElement(By.id("username"));
		ele.sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Dhivya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Divi");
		driver.findElement(By.name("departmentName")).sendKeys("Computer Applications");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Creating lead role for testing purpose");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc@gmail.com");
		WebElement ele1= driver.findElement(By.name("generalStateProvinceGeoId"));
		Select ddl= new Select(ele1);
		ddl.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		String s= driver.getTitle();
		System.out.println("Title is :"+ s);
		Thread.sleep(3000);
		driver.close();
	}

}
