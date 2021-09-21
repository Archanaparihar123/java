package loginScenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) 
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	//implicitywait
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
	//enter email/phone
	driver.findElement(By.id("ap_email")).sendKeys("9850124109");
	driver.findElement(By.id("continue")).click();
	//enter passworrd
	driver.findElement(By.id("ap_password")).sendKeys("archu@123");
	driver.findElement(By.id("signInSubmit")).click();
	//driver.findElement(By.linkText("Sign Out"))
	driver.close();
}
}