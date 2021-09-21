package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args)
	{
		// open chrome
		WebDriver driver=new ChromeDriver();
		driver.get("https:www.naukri.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		driver.close();
		

	}

}
