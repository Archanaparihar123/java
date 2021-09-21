package c2Scrollbar;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot2 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//Step:1 Typecasting from webdriver to takescreenshot interface
				TakesScreenshot ts=(TakesScreenshot) driver;
				Thread.sleep(2000);
			//Step:2 access the method and store in RAM location
				File src = ts.getScreenshotAs(OutputType.FILE);
				Thread.sleep(2000);
			//Step:3 Specify the Required LOcation
				File dest=new File("C:\\Users\\Girish Rajput\\eclipse-workspace\\ZSeleniumProject\\photo\\amazon.png");		
			//Step:4 Copy the file src to dest location
				FileUtils.copyFile(src, dest);

			driver.close();



	}

}
