package com.TricentisProjectUsingExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

public class ComparePriceFromExcel {

	WebDriver driver;
	String fPath = "C:\\Users\\divya\\Documents\\Automation\\Output.xlsx";
	File file;
	FileOutputStream fos;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	int rows, cells, index = 0;

	public ComparePriceFromExcel(WebDriver driver) {
		this.driver = driver;
	}
	
	public void checkPrice(String expPrice, String expClaim, String expDis, String expCover, String type, String testname) throws IOException 
	{
		String actPrice, actClaim, actDis, actCover;
		file = new File(fPath);
		fis = new FileInputStream(file);
		fos = new FileOutputStream(file);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheet("Sheet1");
		
		if(testname == "automobile")
			index = 1; 
		else if (testname == "truck")
			index = 6;
		else if (testname == "motorcycle")
			index = 11;
		else if (testname == "camper")
			index = 16;

		
		switch(type)
		{
		case "Silver":
			row = sheet.getRow(index);
			System.out.println("Silver Test");
			actPrice = driver.findElement(By.id("selectsilver_price")).getText();
			actClaim = driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[2]/td[2]")).getText();
			actDis = driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[3]/td[2]")).getText();
			actCover = driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[4]/td[2]")).getText();
			
			row=sheet.createRow(3);
			if(expPrice.equals(actPrice))
				row.getCell(1).setCellValue("Price Matching Silver");
			else 
				row.getCell(1).setCellValue("Price Not Matching!!!");
			if(expClaim.equals(actClaim)) 
				row.getCell(2).setCellValue("Claim Matching!!!");
			else 
				row.getCell(2).setCellValue("Claim Not Matching!!!");
			if(expDis.equals(actDis))
				row.getCell(3).setCellValue("Discount Matching!!!");
			else
				row.getCell(3).setCellValue("Discount Not Matching!!!");
			if(expCover.equals(actCover))
				row.getCell(4).setCellValue("Cover Matching!!!");
			else 
				row.getCell(4).setCellValue("Cover Not Matching!!!");
			
			driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[1]/span")).click();
			index++;
			
			break;

		case "Gold":
			row = sheet.getRow(index);
			System.out.println("Gold Test");
			actPrice = driver.findElement(By.id("selectgold_price")).getText();
			actClaim = driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[2]/td[3]")).getText();//*[@id="priceTable"]/tbody/tr[2]/td[3]
			actDis = driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[3]/td[3]")).getText();
			actCover = driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[4]/td[3]")).getText();
			
			if(expPrice.equals(actPrice))
				row.getCell(1).setCellValue("Price Matching Gold");
			else 
				row.getCell(1).setCellValue("Price Not Matching!!!");
			if(expClaim.equals(actClaim)) 
				row.getCell(2).setCellValue("Claim Matching!!!");
			else 
				row.getCell(2).setCellValue("Claim Not Matching!!!");
			if(expDis.equals(actDis))
				row.getCell(3).setCellValue("Discount Matching!!!");
			else
				row.getCell(3).setCellValue("Discount Not Matching!!!");
			if(expCover.equals(actCover))
				row.getCell(4).setCellValue("Cover Matching!!!");
			else 
				row.getCell(4).setCellValue("Cover Not Matching!!!");
			
			driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[2]/span")).click();
			index++;
			break;
			
		case "Platinum":
			row = sheet.getRow(index);
			//System.out.println("Platinum Test");
			actPrice = driver.findElement(By.id("selectplatinum_price")).getText();
			actClaim = driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[2]/td[4]")).getText();
			actDis = driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[3]/td[4]")).getText();
			actCover = driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[4]/td[4]")).getText();
			
			if(expPrice.equals(actPrice))
				row.getCell(1).setCellValue("Price Matching Platinum");
			else 
				row.getCell(1).setCellValue("Price Not Matching!!!");
			if(expClaim.equals(actClaim)) 
				row.getCell(2).setCellValue("Claim Matching!!!");
			else 
				row.getCell(2).setCellValue("Claim Not Matching!!!");
			if(expDis.equals(actDis))
				row.getCell(3).setCellValue("Discount Matching!!!");
			else
				row.getCell(3).setCellValue("Discount Not Matching!!!");
			if(expCover.equals(actCover))
				row.getCell(4).setCellValue("Cover Matching!!!");
			else 
				row.getCell(4).setCellValue("Cover Not Matching!!!");
			
			driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[3]/span")).click();
			index++;
			break;
			
		case "Ultimate":
			row = sheet.getRow(index);
			//System.out.println("Ultimate Test");
			actPrice = driver.findElement(By.id("selectultimate_price")).getText();
			actClaim = driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[2]/td[5]")).getText();
			actDis = driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[3]/td[5]")).getText();
			actCover = driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[4]/td[5]")).getText();
			
			if(expPrice.equals(actPrice))
				row.getCell(1).setCellValue("Price Matching Ultimate");
			else 
				row.getCell(1).setCellValue("Price Not Matching!!!");
			if(expClaim.equals(actClaim)) 
				row.getCell(2).setCellValue("Claim Matching!!!");
			else 
				row.getCell(2).setCellValue("Claim Not Matching!!!");
			if(expDis.equals(actDis))
				row.getCell(3).setCellValue("Discount Matching!!!");
			else
				row.getCell(3).setCellValue("Discount Not Matching!!!");
			if(expCover.equals(actCover))
				row.getCell(4).setCellValue("Cover Matching!!!");
			else 
				row.getCell(4).setCellValue("Cover Not Matching!!!");
			
			driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[4]/span")).click();
			index++;
			break;
			
		}
		wb.close();
		fis.close();
		driver.findElement(By.id("nextsendquote")).click();	
		
	}
}
