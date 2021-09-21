package loginScenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipcart {

	public static void main(String[] args)
	{
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		//enter user name
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9850124109");
		//enter password
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("archu@123");
		//enter login
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		//
		String title = driver.getTitle();
		System.out.println(title);
	//varification
		if(title.equals("Online Shopping Site for Mobiles, Electronics, "
				+ "Furniture, Grocery, Lifestyle, Books & More. Best Offers!"))
		{
			System.out.println("pass:home page is displayed");
			}
		else
		{
			System.out.println("Fail:home page not displayed");
		}
		String url=driver.getCurrentUrl();
		System.out.println(url);

		driver.close();
	}

}
