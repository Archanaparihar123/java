package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Loginscenario {

	public static void main(String[] args)
	{
		// open browser
		WebDriver driver=new FirefoxDriver();
		//maximize window
		driver.manage().window().maximize();
		//enter url
		driver.get("https://demo.actitime.com/login.do");
		//enter username
		driver.findElement(By.id("username")).sendKeys("admin");
		//enter password
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//click on login
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		//get title
		String title = driver.getTitle();
		System.out.println(title);
		
		//varification
		if(title.equals("actiTIME - Login")) {
			System.out.println("pass:home page is displayed");
			}
		else
		{
			System.out.println("Fail:home page not displayed");
		}
		
		//get url
		 String url = driver.getCurrentUrl();
         System.out.println(url);
		//click on logout
         
         driver.close();
         
	}

}
