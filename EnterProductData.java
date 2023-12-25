package com.TricentisProjectUsingExcel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class EnterProductData {
	WebDriver driver;

	public EnterProductData(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setStartDate(String startd) {
		driver.findElement(By.id("startdate")).sendKeys(startd);
	}
	
	public void selectInsuranceSum(Integer is) {
		new Select(driver.findElement(By.id("insurancesum"))).selectByIndex(is);
	}
	
	public void selectMeritRating(Integer mr) {
		new Select(driver.findElement(By.id("meritrating"))).selectByIndex(mr);
	}
	
	public void selectDamageInsurance(Integer di) {
		new Select(driver.findElement(By.id("damageinsurance"))).selectByIndex(di);
	}
	
	public void selectInsurProtectionAuto() {
		new Actions(driver).moveToElement(driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]/span"))).click().perform();
	}
	
	public void selectInsurProtection() {
		new Actions(driver).moveToElement(driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[4]/p/label[1]/span"))).click().perform();
	}
	
	public void selectCourtesyCar(Integer ccar) {
		new Select(driver.findElement(By.id("courtesycar"))).selectByIndex(ccar);
	}
	
	public void clickNextPriceOptions() {
		driver.findElement(By.id("nextselectpriceoption")).click();
	}
	
}
