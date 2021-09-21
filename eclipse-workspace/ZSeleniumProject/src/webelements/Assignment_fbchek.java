package webelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_fbchek {

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("(//a[@role=\"button\"])[2]")).click();
			
			Thread.sleep(3000);
			WebElement radio = driver.findElement(By.xpath("//label[text()=\"Female\"]"));
			 if(radio.isSelected()) {
				 System.out.println("Radio Button is selected");
			 }else {
				 System.out.println("Radio Button is not selected");
			 }
			 driver.close();

	}

}
