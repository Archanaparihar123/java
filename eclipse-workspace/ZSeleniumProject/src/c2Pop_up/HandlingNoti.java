package c2Pop_up;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HandlingNoti {

	public static void main(String[] args)
	{
		ChromeOptions c=new ChromeOptions();
		c.addArguments("--disable-notifications");

		FirefoxOptions f=new FirefoxOptions();
		c.addArguments("--disable-notifications");

		WebDriver driver=new FirefoxDriver(f);


	//	WebDriver drivers =new ChromeDriver(c);

		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.xpath("//a[text()='31']")).click();

	}

}
