package com.TricentisProjectUsingExcel;

import org.testng.annotations.Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllTests {
	
	WebDriver driver;
	String fPath = "C:\\Users\\divya\\Documents\\Automation\\TricentisData2.xlsx";
	File file;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	int rows, cells, i, j;
	
	EnterVehicleData vd;
	SelectPriceOptions po;
	EnterInsurantData id;
	EnterProductData pd;
	SendQuote sq;
	
	public String[][] getDataFromExcel() {
		int rows = sheet.getPhysicalNumberOfRows();
		int cells = sheet.getRow(0).getPhysicalNumberOfCells();
		String data[][] = new String[rows][cells];
		
		for(int i = 0; i < rows; i++)
		{
			row = sheet.getRow(i);
			for(int j = 0; j < cells; j++)
			{
				cell = row.getCell(j);
				data[i][j] = cell.getStringCellValue();
			}
		}
		
		return data;
	}
	
	@Test(dataProvider = "getAutomobileData", priority = 1)
	public void automobileTest(String price, String claim, String dis, String cover, String type, String testname) throws IOException {
		
		driver.findElement(By.partialLinkText("Auto")).click();
		vd.selectMake("Audi");
		vd.setEnginePerformance("1000");
		
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, -10);
		SimpleDateFormat s = new SimpleDateFormat("MM/dd/yyyy");
		String prvDate = s.format(new Date(cal.getTimeInMillis()));

		vd.setManDate(prvDate);
		vd.noOfSeats("2");
		vd.setFuel("Petrol");
		vd.setListPrice("1000");
		vd.setLicensePlateNumber("MH09GF1246");
		vd.setAnnualMileage("1999");
		vd.clickNextInsurantData();
		//Enter Insurant Data
		id.setFirstName("John");
		id.setLastName("James");
		id.setBirthDate("03/17/1999");
		id.selectGender();
		id.selectCountry(60);
		id.setZipcode("755124");
		id.setCity("kamathipura");
		id.selectOccupation(1);
		id.selectHobbies(true,true,false,false,false);
		id.clickNextProductData();
		//Enter Product data
		Calendar calen = Calendar.getInstance();
		calen.add(Calendar.MONTH, +2);
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		String futureDate = sdf.format(new Date(calen.getTimeInMillis()));
		
		pd.setStartDate(futureDate);
		pd.selectInsuranceSum(6);
		pd.selectMeritRating(18);
		pd.selectDamageInsurance(2);
		pd.selectInsurProtectionAuto();
		pd.selectCourtesyCar(2);
		pd.clickNextPriceOptions();
		
		//Select Price details
		po.checkPrice(price, claim, dis, cover, type, testname);

		//SendQuote
		sq.setEmail("divya@gmail.com");
		sq.setUsername("divyap.23");
		sq.setPassword("Divyap23@");
		sq.setConfPassword("Divyap23@");
		sq.clickSendEmail();
		sq.getMessage();
		sq.clickOkButton();
		
	}
	
	
	@Test(dataProvider = "getTruckData", priority = 2)
	public void truckTest(String price, String claim, String dis, String cover, String type, String testname) throws IOException {
		driver.findElement(By.partialLinkText("Truc")).click();
		vd.selectMake("Audi");
		vd.setEnginePerformance("1000");
		
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, -10);
		SimpleDateFormat s = new SimpleDateFormat("MM/dd/yyyy");
		String prvDate = s.format(new Date(cal.getTimeInMillis()));

		vd.setManDate(prvDate);
		vd.noOfSeats("2");
		vd.setFuel("Petrol");
		vd.setPayLoad("990");
		vd.setTotalWeight("2900");
		vd.setListPrice("1000");
		vd.setLicensePlateNumber("MH09GF1246");
		vd.setAnnualMileage("1999");
		vd.clickNextInsurantData();
		//Enter Insurant Data
		id.setFirstName("John");
		id.setLastName("James");
		id.setBirthDate("03/17/1999");
		id.selectGender();
		id.selectCountry(60);
		id.setZipcode("755124");
		id.setCity("kamathipura");
		id.selectOccupation(1);
		id.selectHobbies(true,true,false,false,false);
		id.clickNextProductData();
		//Enter Product data
		Calendar calen = Calendar.getInstance();
		calen.add(Calendar.MONTH, +2);
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		String futureDate = sdf.format(new Date(calen.getTimeInMillis()));
		
		pd.setStartDate(futureDate);
		pd.selectInsuranceSum(6);
		pd.selectDamageInsurance(2);
		pd.selectInsurProtection();
		pd.clickNextPriceOptions();
		
		//Select Price details
		po.checkPrice(price, claim, dis, cover, type, testname);
		//SendQuote
		sq.setEmail("divya@gmail.com");
		sq.setUsername("divyap.23");
		sq.setPassword("Divyap23@");
		sq.setConfPassword("Divyap23@");
		sq.clickSendEmail();
		sq.getMessage();
		sq.clickOkButton();
		
	}
	
	@Test(dataProvider = "getMotorcycleData", priority = 3)
	public void motorcycleTest(String price, String claim, String dis, String cover, String type, String testname) throws IOException {
		driver.findElement(By.partialLinkText("Motor")).click();
		vd.selectMake("Audi");
		vd.setModel("Motorcycle");
		vd.setCyclinderCapacity("1900");
		vd.setEnginePerformance("1200");
		
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, -10);
		SimpleDateFormat s = new SimpleDateFormat("MM/dd/yyyy");
		String prvDate = s.format(new Date(cal.getTimeInMillis()));

		vd.setManDate(prvDate);
		vd.setNoofSeatsinMotorcycle("2");
		vd.setListPrice("1000");
		vd.setAnnualMileage("1999");
		vd.clickNextInsurantData();
		//Enter Insurant Data
		id.setFirstName("John");
		id.setLastName("James");
		id.setBirthDate("03/17/1999");
		id.selectGender();
		id.selectCountry(60);
		id.setZipcode("755124");
		id.setCity("kamathipura");
		id.selectOccupation(1);
		id.selectHobbies(true,true,false,false,false);
		id.clickNextProductData();
		//Enter Product data
		Calendar calen = Calendar.getInstance();
		calen.add(Calendar.MONTH, +2);
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		String futureDate = sdf.format(new Date(calen.getTimeInMillis()));
		
		pd.setStartDate(futureDate);
		pd.selectInsuranceSum(6);
		pd.selectDamageInsurance(2);
		pd.selectInsurProtection();
		pd.clickNextPriceOptions();
		
		//Select Price details
		po.checkPrice(price, claim, dis, cover, type, testname);

		//SendQuote
		sq.setEmail("divya@gmail.com");
		sq.setUsername("divyap.23");
		sq.setPassword("Divyap23@");
		sq.setConfPassword("Divyap23@");
		sq.clickSendEmail();
		sq.getMessage();
		sq.clickOkButton();
		
	}
	
	@Test(dataProvider = "getCamperData", priority = 4)
	public void camperTest(String price, String claim, String dis, String cover, String type, String testname) throws IOException {
		driver.findElement(By.partialLinkText("Camp")).click();
		vd.selectMake("Audi");
		vd.setEnginePerformance("1000");
		
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, -10);
		SimpleDateFormat s = new SimpleDateFormat("MM/dd/yyyy");
		String prvDate = s.format(new Date(cal.getTimeInMillis()));

		vd.setManDate(prvDate);
		vd.noOfSeats("2");
		vd.selectRightHandDrive();
		vd.setFuel("Petrol");
		vd.setPayLoad("990");
		vd.setTotalWeight("2900");
		vd.setListPrice("1000");
		vd.setAnnualMileage("1999");
		vd.clickNextInsurantData();
		//Enter Insurant Data
		id.setFirstName("John");
		id.setLastName("James");
		id.setBirthDate("03/17/1999");
		id.selectGender();
		id.selectCountry(60);
		id.setZipcode("755124");
		id.setCity("kamathipura");
		id.selectOccupation(1);
		id.selectHobbies(true,true,false,false,false);
		id.clickNextProductData();
		//Enter Product data
		Calendar calen = Calendar.getInstance();
		calen.add(Calendar.MONTH, +2);
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		String futureDate = sdf.format(new Date(calen.getTimeInMillis()));
		
		pd.setStartDate(futureDate);
		pd.selectInsuranceSum(6);
		pd.selectDamageInsurance(2);
		pd.selectInsurProtection();
		pd.clickNextPriceOptions();
		
		//Select Price details
		po.checkPrice(price, claim, dis, cover, type, testname);

		//SendQuote
		sq.setEmail("divya@gmail.com");
		sq.setUsername("divyap.23");
		sq.setPassword("Divyap23@");
		sq.setConfPassword("Divyap23@");
		sq.clickSendEmail();
		sq.getMessage();
		sq.clickOkButton();
		
	}
	
	@DataProvider
	public Object[][] getAutomobileData() 
	{
		sheet = wb.getSheet("Automobile");
		String[][] data = getDataFromExcel();
		return data;
	}
	
	@DataProvider
	public Object[][]getTruckData()
	{
		
		sheet = wb.getSheet("Truck");
		String[][] data = getDataFromExcel();
		return data;
	}
	
	@DataProvider
	public Object[][]getMotorcycleData() throws IOException
	{
		
		sheet = wb.getSheet("Motorcycle");
		String[][] data = getDataFromExcel();
		return data;
	}
	
	@DataProvider
	public Object[][]getCamperData() throws IOException
	{
		sheet = wb.getSheet("Camper");
		String[][] data = getDataFromExcel();
		return data;
	}

	@BeforeTest(alwaysRun=true)
	public void beforeTest() throws IOException {
		
		file = new File(fPath);
		fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://sampleapp.tricentis.com/101/index.php");
		
		vd = new EnterVehicleData(driver);
		po = new SelectPriceOptions(driver);
		id = new EnterInsurantData(driver);
		pd = new EnterProductData(driver);
		sq = new SendQuote(driver);
	}

	@AfterTest
	public void afterTest() throws IOException {
		wb.close();
		fis.close();
		driver.close();
	}
	
}
