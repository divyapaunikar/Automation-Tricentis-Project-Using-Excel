package com.TricentisProjectUsingExcel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class EnterInsurantData {
	WebDriver driver;

	public EnterInsurantData(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setFirstName(String fn) {
		driver.findElement(By.id("firstname")).sendKeys(fn);
	}
	
	public void setLastName(String ln) {
		driver.findElement(By.id("lastname")).sendKeys(ln);
	}
	
	public void setBirthDate(String birth) {
		driver.findElement(By.id("birthdate")).sendKeys(birth);
	}
	
	public void selectGender() {
		driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[2]/span")).click();
	}
	
	public void selectCountry(Integer country) {
		new Select(driver.findElement(By.id("country"))).selectByIndex(country);
	}
	
	public void setZipcode(String zipc) {
		driver.findElement(By.id("zipcode")).sendKeys(zipc);
	}
	
	public void setCity(String city) {
		driver.findElement(By.id("city")).sendKeys(city);
	}
	
	public void selectOccupation(Integer ocp) {
		new Select(driver.findElement(By.id("occupation"))).selectByIndex(ocp);
	}
	
	public void selectHobbies(Boolean one, Boolean two, Boolean three, Boolean four, Boolean five) {
		if(one)
			driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]/span")).click();
		if(two)
			driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[2]/span")).click();
		if(three)
			driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[3]/span")).click();
		if(four)
			driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[4]/span")).click();
		if(five)
			driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[5]/span")).click();
		
	}
	
	public void clickNextProductData() {
		driver.findElement(By.id("nextenterproductdata")).click();
	}
	
	
}
