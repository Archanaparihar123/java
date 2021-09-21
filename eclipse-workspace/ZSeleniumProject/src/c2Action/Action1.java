package c2Action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.luxire.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.id("custom-made-shirts-trousers-jackets-coats-suits"));
		
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
		
	driver.findElement(By.id("jackets")).click();
	driver.findElement(By.partialLinkText("Jackets")).click();

	}

}
