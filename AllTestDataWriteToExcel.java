package com.TricentisProjectUsingExcel;

import org.testng.annotations.Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class AllTestDataWriteToExcel {
	
	String fPath = "C:\\Users\\divya\\Documents\\Automation\\TricentisData2.xlsx";
	File file;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheetAuto;
	XSSFSheet sheetTruck;
	XSSFSheet sheetMotor;
	XSSFSheet sheetCamper;
	XSSFRow row;
	int a = 0;
	int t = 0;
	int m = 0;
	int c = 0;

	
	@Test(dataProvider = "getAutomobileData", priority = 1)
	public void automobileTest(String price, String claim, String dis, String cover, String type, String testname) {
		
		row = sheetAuto.createRow(a);
		row.createCell(0).setCellValue(price);
		row.createCell(1).setCellValue(claim);
		row.createCell(2).setCellValue(dis);
		row.createCell(3).setCellValue(cover);
		row.createCell(4).setCellValue(type);
		row.createCell(5).setCellValue(testname);	
		a++;	
	}
	
	
	@Test(dataProvider = "getTruckData", priority = 2)
	public void truckTest(String price, String claim, String dis, String cover, String type, String testname){
		
		row = sheetTruck.createRow(t);
		row.createCell(0).setCellValue(price);
		row.createCell(1).setCellValue(claim);
		row.createCell(2).setCellValue(dis);
		row.createCell(3).setCellValue(cover);
		row.createCell(4).setCellValue(type);
		row.createCell(5).setCellValue(testname);	
		t++;
	}
	
	@Test(dataProvider = "getMotorcycleData", priority = 3)
	public void motorcycleTest(String price, String claim, String dis, String cover, String type, String testname) {

		row = sheetMotor.createRow(m);
		row.createCell(0).setCellValue(price);
		row.createCell(1).setCellValue(claim);
		row.createCell(2).setCellValue(dis);
		row.createCell(3).setCellValue(cover);
		row.createCell(4).setCellValue(type);
		row.createCell(5).setCellValue(testname);	
		m++;
	}
	
	@Test(dataProvider = "getCamperData", priority = 4)
	public void camperTest(String price, String claim, String dis, String cover, String type, String testname) {

		row = sheetCamper.createRow(c);
		row.createCell(0).setCellValue(price);
		row.createCell(1).setCellValue(claim);
		row.createCell(2).setCellValue(dis);
		row.createCell(3).setCellValue(cover);
		row.createCell(4).setCellValue(type);
		row.createCell(5).setCellValue(testname);	
		c++;
	}

	@DataProvider
	public Object[][]getAutomobileData()
	{
		return new Object[][] {
			new Object[] { "328.00", "No", "No", "No", "Silver","automobile" },
			new Object[] { "968.00", "Submit", "2", "Limited", "Gold", "Null"},
			new Object[] { "1,901.00", "Submit", "5", "Limited", "Platinum", "Null"},
			new Object[] { "3,621.00", "Submit", "10", "Unlimited", "Ultimate", "Null"},
			
		};
	}
	
	@DataProvider
	public Object[][]getTruckData()
	{
		return new Object[][] {
			new Object[] { "291.00", "No", "No", "No", "Silver","truck" },
			new Object[] { "859.00", "Submit", "2", "Limited", "Gold", "Null"},
			new Object[] { "1,686.00", "Submit", "5", "Limited", "Platinum", "Null"},
			new Object[] { "3,212.00", "Submit", "10", "Unlimited", "Ultimate", "Null" },
			
		};
	}
	
	@DataProvider
	public Object[][]getMotorcycleData()
	{
		return new Object[][] {
			new Object[] { "255.00", "No", "No", "No", "Silver", "motorcycle"},
			new Object[] { "751.00", "Submit", "2", "Limited", "Gold", "Null" },
			new Object[] { "1,475.00", "Submit", "5", "Limited", "Platinum", "Null"},
			new Object[] { "2,810.00", "Submit", "10", "Unlimited", "Ultimate", "Null"},
			
		};
	}
	
	@DataProvider
	public Object[][]getCamperData()
	{
		return new Object[][] {
			new Object[] { "269.00", "No", "No", "No", "Silver","camper" },
			new Object[] { "793.00", "Submit", "2", "Limited", "Gold", "Null"},
			new Object[] { "1,558.00", "Submit", "5", "Limited", "Platinum", "Null"},
			new Object[] { "2,967.00", "Submit", "10", "Unlimited", "Ultimate", "Null"},
			
		};
	}
	
	
	@BeforeTest(alwaysRun=true)
	public void beforeTest() throws FileNotFoundException {
		
		file = new File(fPath);
		fos = new FileOutputStream(file);
		wb = new XSSFWorkbook();
		sheetAuto = wb.createSheet("Automobile");
		sheetTruck = wb.createSheet("Truck");
		sheetMotor = wb.createSheet("Motorcycle");
		sheetCamper = wb.createSheet("Camper");
		
		
	}

	@AfterTest
	public void afterTest() throws IOException {
		wb.write(fos);
		wb.close();
		fos.close();
	}
	
}
