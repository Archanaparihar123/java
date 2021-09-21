package c2Pop_up;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/account/register/basicdetails");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[@title='I am a Professional']")).click();
		driver.findElement(By.xpath("//input[@name='uploadCV']")).sendKeys("C:\\Users\\Girish Rajput\\Desktop\\archu");

	}

}
