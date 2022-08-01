package week3day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leaftaplogins {
public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	
	ChromeDriver driver=new ChromeDriver();
		
	driver.get("http://leaftaps.com/opentaps/control/main");
	
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	
	driver.findElement(By.className("decorativeSubmit")).click();
	
	String text = driver.findElement(By.tagName("h2")).getText();
	
	System.out.println(text);
	
	
	driver.findElement(By.linkText("CRM/SFA")).click();
	
	driver.findElement(By.linkText("Leads")).click();
	
	driver.findElement(By.linkText("Create Lead")).click();
	
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	
	driver.findElement(By.id("createLeadForm_parentPartyId")).sendKeys("Sivanantham");
	
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kamalakannan");
	
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sivanantham");
	
	
	
	
	
	
}
}