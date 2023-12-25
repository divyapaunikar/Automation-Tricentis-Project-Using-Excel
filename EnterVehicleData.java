package com.TricentisProjectUsingExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class EnterVehicleData {
	WebDriver driver;

	public EnterVehicleData(WebDriver driver) {
		this.driver = driver;
	}	
	public void selectMake(String make)
	{
		new Select(driver.findElement(By.id("make"))).selectByVisibleText(make);
	}
	public void setEnginePerformance(String ep)
	{
		driver.findElement(By.id("engineperformance")).sendKeys(ep);
	}
	public void setManDate(String date)
	{
		driver.findElement(By.id("dateofmanufacture")).sendKeys(date);
	}
	
	public void noOfSeats(String ns) {
		new Select(driver.findElement(By.id("numberofseats"))).selectByVisibleText(ns);
	}
	
	public void setFuel(String fuel) {
		new Select(driver.findElement(By.id("fuel"))).selectByVisibleText(fuel);
	}
	
	public void setListPrice(String lp) {
		driver.findElement(By.id("listprice")).sendKeys(lp);
	}
	
	public void setLicensePlateNumber(String licplateNo) {
		driver.findElement(By.id("licenseplatenumber")).sendKeys(licplateNo);
	}
	
	public void setAnnualMileage(String am) {
		driver.findElement(By.id("annualmileage")).sendKeys(am);
	}

	public void clickNextInsurantData() {
		driver.findElement(By.id("nextenterinsurantdata")).click();
	}

	public void setPayLoad(String pl) {
		driver.findElement(By.id("payload")).sendKeys(pl);
	}
	
	public void setTotalWeight(String tw) {
		driver.findElement(By.id("totalweight")).sendKeys(tw);
	}
	
	public void setModel(String model) {
		new Select(driver.findElement(By.id("model"))).selectByVisibleText(model);
	}
	
	public void setCyclinderCapacity(String capacity) {
		driver.findElement(By.id("cylindercapacity")).sendKeys(capacity);
	}
	public void setNoofSeatsinMotorcycle(String nsm) {
		new Select(driver.findElement(By.id("numberofseatsmotorcycle"))).selectByVisibleText(nsm);
	}
	public void selectRightHandDrive() {
		new Actions(driver).moveToElement(driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[1]/div[5]/p/label[1]/span"))).click().perform();
	}
	
	
	
}

