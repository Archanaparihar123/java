package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");

		 WebElement ele = driver.findElement(By.id("username"));
         org.openqa.selenium.Dimension s = ele.getSize();
          System.out.println("Height of the username text field "+s.getHeight());
	      System.out.println("Widht of the username text field "+s.getWidth());
	      driver.close();
	}

}
