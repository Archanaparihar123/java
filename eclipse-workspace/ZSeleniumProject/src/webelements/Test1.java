package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//get url
		driver.get("https://demo.actitime.com/login.do");
		WebElement login = driver.findElement(By.xpath("//div[text()='Login ']"));
		//verification
		if(login.isEnabled())
		{
			System.out.println("Pass:The login is enabled");
			login.click();
		}
		else
		{
			System.out.println("Fail:the login is not enabled");
		}

	driver.close();
	}
	

}
