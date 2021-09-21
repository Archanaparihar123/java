package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) throws InterruptedException 
	{
		
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.com/");

			WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
	         ele.sendKeys("phone");
	         Thread.sleep(3000);
	         ele.clear();
	         WebElement laptop = driver.findElement(By.id("twotabsearchtextbox"));
	        
			laptop.sendKeys("laptop");
	         Thread.sleep(3000);
	         laptop.clear();
	         driver.close();
	         
	         

	}

}
