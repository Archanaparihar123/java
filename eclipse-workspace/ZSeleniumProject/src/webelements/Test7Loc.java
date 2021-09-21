package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7Loc {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");

		WebElement ele = driver.findElement(By.id("username"));
		org.openqa.selenium.Point loc = ele.getLocation();
		System.out.println("The x-coordinates "+loc.x);
		System.out.println("The y-coordinates "+loc.y);
		driver.close();

	}

}
