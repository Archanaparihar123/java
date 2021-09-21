package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment2css {

	public static void main(String[] args) 
	{
		// open browser
				WebDriver driver=new FirefoxDriver();
				driver.manage().window().maximize();
				//enter url
				driver.get("https://demo.vtiger.com/vtigercrm/index.php");
				//enter username
				driver.findElement(By.cssSelector("input[id='username']")).sendKeys("admin");
				//enter password
				driver.findElement(By.cssSelector("input[id='password']")).sendKeys("admin");
				//click on login
				driver.findElement(By.cssSelector("button[class='button buttonBlue']")).click();
				driver.close();


	}

}
