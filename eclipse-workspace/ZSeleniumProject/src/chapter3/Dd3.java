package chapter3;

import java.io.FileInputStream;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Dd3  
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//create object of fileinputstream and specify path of the file
	FileInputStream f=new FileInputStream("/ZSeleniumProject/Se.xles.xlsx");
	Workbook wb=WorkbookFactory.create(f);
	String url = wb.getSheet("Se.xles").getRow(1).getCell(0).getStringCellValue();


	driver.get(url);

	String us = wb.getSheet("Se.xles").getRow(1).getCell(1).getStringCellValue();
	driver.findElement(By.id("email")).sendKeys(us);

	String pwd = wb.getSheet("Se.xles").getRow(1).getCell(2).getStringCellValue();
	driver.findElement(By.id("pass")).sendKeys(pwd);

}

}
