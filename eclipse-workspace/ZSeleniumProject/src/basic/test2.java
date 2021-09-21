package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 {

	public static void main(String[] args) {
		// to launch chrome driver
		ChromeDriver ch=new ChromeDriver();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		//title the application
		String title=driver.getTitle();
		System.out.println(title);
		
		//get the url from application
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		driver.close();
		ch.close();
		

	}

}
