package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test5 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get(" https://demoapp.skillrary.com/");
		driver.findElement(By.linkText("login")).click();
		driver.findElement(By.id("email")).sendKeys("user");
	    driver.findElement(By.id("password")).sendKeys("user");
	   // driver.findElement(By.partialLinkText(null))
	    driver.findElement(By.name("login")).click();
	    driver.close();
	
	}

}
