package c2Scrollbar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sc2 {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://myntra.com");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

		//driver.findElement(By.xpath)
		//typecasting
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,5000)");
		//Thread.sleep(3000);

	}

}
