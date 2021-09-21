package loginScenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://myntra.onelogin.com/login");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		


	}

}
