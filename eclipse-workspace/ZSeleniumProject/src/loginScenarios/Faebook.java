package loginScenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Faebook {

	public static void main(String[] args) throws InterruptedException
	{
		//open browser
		WebDriver driver=new ChromeDriver();
		//maximize window
		driver.manage().window().maximize();
		//enter url
		driver.get("https://www.Facebook.com");
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		//enter username 
		driver.findElement(By.id("email")).sendKeys("9850124109");
		//enter password
		driver.findElement(By.id("pass")).sendKeys("archu@123");
		//click on login
		driver.findElement(By.name("login")).click();
		
		//get title 
		String title=driver.getTitle();
		System.out.println(title);
		//verication
				if(title.equals("Facebook – log in or sign up")) {
					System.out.println("pass:Home page is displayed");
				}
				else
				{
					System.out.println("Fail:Home page is not dispalyed");
				}
		//get url
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		Thread.sleep(2000);
		driver.close();
	}

}
