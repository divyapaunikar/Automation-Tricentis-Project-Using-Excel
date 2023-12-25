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

public class SelectPriceOptions {
	WebDriver driver;


	public SelectPriceOptions(WebDriver driver) {
		this.driver = driver;
	}
	
	public void checkPrice(String expPrice, String expClaim, String expDis, String expCover, String type, String testname) throws IOException 
	{
		String actPrice, actClaim, actDis, actCover;
		
		switch(type)
		{
		case "Silver":
			System.out.println("Silver Test");
			actPrice = driver.findElement(By.id("selectsilver_price")).getText();
			actClaim = driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[2]/td[2]")).getText();
			actDis = driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[3]/td[2]")).getText();
			actCover = driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[4]/td[2]")).getText();
			
			if(expPrice.equals(actPrice))
				//row.getCell(1).setCellValue("Price Matching Silver");
				System.out.println("Price Matching!!!");
			else {
				//row.getCell(1).setCellValue("Price Not Matching!!!");
				System.out.println("Price Not Matching!!!");
				//driver.quit();
			}
			if(expClaim.equals(actClaim))
				//row.getCell(2).setCellValue("Claim Matching!!!");
				System.out.println("Claim Matching!!!");
			else
				System.out.println("Claim Not Matching!!!");
				//row.getCell(2).setCellValue("Claim Not Matching!!!");
			
			if(expDis.equals(actDis))
				System.out.println("Discount Matching!!!");
				//row.getCell(3).setCellValue("Discount Matching!!!");
			else 
				System.out.println("Discount Not Matching!!!");
				//row.getCell(3).setCellValue("Discount Not Matching!!!");
			
			if(expCover.equals(actCover))
				System.out.println("Cover Matching!!!");
				//row.getCell(4).setCellValue("Cover Matching!!!");
			else 
				System.out.println("Cover Not Matching!!!");
				//row.getCell(4).setCellValue("Cover Not Matching!!!");
			
			driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[1]/span")).click();
			//rowIndex++;
			break;

		case "Gold":
			//row = sheet.getRow(rowIndex);
			System.out.println("Gold Test");
			actPrice = driver.findElement(By.id("selectgold_price")).getText();
			actClaim = driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[2]/td[3]")).getText();//*[@id="priceTable"]/tbody/tr[2]/td[3]
			actDis = driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[3]/td[3]")).getText();
			actCover = driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[4]/td[3]")).getText();
			
			if(expPrice.equals(actPrice))
				//row.getCell(1).setCellValue("Price Matching Gold");
				System.out.println("Price Matching!!!");
			else {
				//row.getCell(1).setCellValue("Price Not Matching!!!");
				System.out.println("Price Not Matching!!!");
				//driver.quit();
			}
			if(expClaim.equals(actClaim))
				System.out.println("Claim Matching!!!");
				//row.getCell(2).setCellValue("Claim Matching!!!");
			else 
				System.out.println("Claim Not Matching!!!");
				//row.getCell(2).setCellValue("Claim Not Matching!!!");
			
			if(expDis.equals(actDis))
				System.out.println("Discount Matching!!!");
				//row.getCell(3).setCellValue("Discount Matching!!!");
			else 
				System.out.println("Discount Not Matching!!!");
				//row.getCell(3).setCellValue("Discount Not Matching!!!");
			
			if(expCover.equals(actCover))
				System.out.println("Cover Matching!!!");
				//row.getCell(4).setCellValue("Cover Matching!!!");
			else 
				System.out.println("Cover Not Matching!!!");
				//row.getCell(4).setCellValue("Cover Not Matching!!!");
	
			driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[2]/span")).click();
			//rowIndex++;
			break;
			
		case "Platinum":
			//row = sheet.getRow(rowIndex);
			System.out.println("Platinum Test");
			actPrice = driver.findElement(By.id("selectplatinum_price")).getText();
			actClaim = driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[2]/td[4]")).getText();
			actDis = driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[3]/td[4]")).getText();
			actCover = driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[4]/td[4]")).getText();
			
			if(expPrice.equals(actPrice))
				//row.getCell(1).setCellValue("Price Matching Platinum");
				System.out.println("Price Matching!!!");
			else {
				//row.getCell(1).setCellValue("Price Not Matching!!!");
				System.out.println("Price Not Matching!!!");
				//driver.quit();
			}
			if(expClaim.equals(actClaim))
				System.out.println("Claim Matching!!!");
				//row.getCell(2).setCellValue("Claim Matching!!!");
			else 
				System.out.println("Claim Not Matching!!!");
				//row.getCell(2).setCellValue("Claim Not Matching!!!");
			
			if(expDis.equals(actDis))
				System.out.println("Discount Matching!!!");
				//row.getCell(3).setCellValue("Discount Matching!!!");
			else 
				System.out.println("Discount Not Matching!!!");
				//row.getCell(3).setCellValue("Discount Not Matching!!!");
			
			if(expCover.equals(actCover))
				System.out.println("Cover Matching!!!");
				//row.getCell(4).setCellValue("Cover Matching!!!");
			else 
				System.out.println("Cover Not Matching!!!");
				//row.getCell(4).setCellValue("Cover Not Matching!!!");
			
			
			driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[3]/span")).click();
			//rowIndex++;
			break;
			
		case "Ultimate":
			//row = sheet.getRow(rowIndex);
			System.out.println("Ultimate Test");
			actPrice = driver.findElement(By.id("selectultimate_price")).getText();
			actClaim = driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[2]/td[5]")).getText();
			actDis = driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[3]/td[5]")).getText();
			actCover = driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[4]/td[5]")).getText();
			
			if(expPrice.equals(actPrice))
				//row.getCell(1).setCellValue("Price Matching Ultimate");
				System.out.println("Price Matching!!!");
			else {
				//row.getCell(1).setCellValue("Price Not Matching!!!");
				System.out.println("Price Not Matching!!!");
				//driver.quit();
			}
			if(expClaim.equals(actClaim))
				System.out.println("Claim Matching!!!");
				//row.getCell(2).setCellValue("Claim Matching!!!");
			else 
				System.out.println("Claim Not Matching!!!");
				//row.getCell(2).setCellValue("Claim Not Matching!!!");
			
			if(expDis.equals(actDis))
				System.out.println("Discount Matching!!!");
				//row.getCell(3).setCellValue("Discount Matching!!!");
			else 
				System.out.println("Discount Not Matching!!!");
				//row.getCell(3).setCellValue("Discount Not Matching!!!");
			
			if(expCover.equals(actCover))
				System.out.println("Cover Matching!!!");
				//row.getCell(4).setCellValue("Cover Matching!!!");
			else 
				System.out.println("Cover Not Matching!!!");
				//row.getCell(4).setCellValue("Cover Not Matching!!!");
			
			driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[4]/span")).click();
			//rowIndex++;
			break;
			
		}
		
		driver.findElement(By.id("nextsendquote")).click();	
	}
}
