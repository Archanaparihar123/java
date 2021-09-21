package c2Action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action6 {

	public static void main(String[] args) throws InterruptedException 
	{
		
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demoapp.skillrary.com/category.php?category=testing");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

			WebElement src = driver.findElement(By.id("Selenium Training"));
			WebElement dest = driver.findElement(By.id("cartArea"));


			Actions a=new Actions(driver);
			Thread.sleep(3000);
			a.dragAndDrop(src,dest).perform();

	}

}
