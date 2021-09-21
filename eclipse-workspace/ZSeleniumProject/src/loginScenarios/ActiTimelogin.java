package loginScenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimelogin {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//enter url
		driver.get("https://demo.actitime.com/login.do");
		//implicitywait 
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		//enter username
		driver.findElement(By.id("username")).sendKeys("admin");
		//enter password
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//click on login
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		//get title
		String title=driver.getTitle();
		System.out.println(title);
		//verication
		if(title.equals("actiTIME - Login")) {
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
		//click on logout
		driver.findElement(By.id("logoutLink")).click();
	driver.close();

	}

}
