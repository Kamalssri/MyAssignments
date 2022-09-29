package testleaf;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nakuri {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	
	ChromeDriver driver=new ChromeDriver();
		
	driver.get("https://www.naukri.com/");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.className("Enter your active Email ID / Username")).sendKeys('kamalnpc122@gmail.com);')
	
	driver.findElement(By.className("Enter your password")).sendKeys('kamal@123');
	
	driver.findElement(By.className("submit")).click();
	
	
}
}
