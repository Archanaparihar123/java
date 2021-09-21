package basic;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		//maximize window
		WebDriver ch=new ChromeDriver();
		 driver.manage().window().maximize();
		//enter fb application url
		driver.get("https:www.facebook.com/");
		//enter username
		driver.findElement(By.id("email")).sendKeys("abcdef@gmail.com");
		//enter password
		driver.findElement(By.id("pass")).sendKeys("asdfg");
		//click on login
		driver.findElement(By.name("login")).click();
		
		//get title
		String title = driver.getTitle();
        System.out.println(title);
		//get url
		 String url = driver.getCurrentUrl();
         System.out.println(url);
		//close
         driver.close();
         ch.close();
	}

}
