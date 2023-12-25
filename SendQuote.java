package com.TricentisProjectUsingExcel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SendQuote {
	WebDriver driver;

	public SendQuote(WebDriver driver) {
		this.driver = driver;
	}

	public void setEmail(String e) {
		driver.findElement(By.id("email")).sendKeys(e);
	}
	public void setUsername(String usern) {
		driver.findElement(By.id("username")).sendKeys(usern);
	}
	public void setPassword(String pass) {
		driver.findElement(By.id("password")).sendKeys(pass);
	}
	public void setConfPassword(String cpass) {
		driver.findElement(By.id("confirmpassword")).sendKeys(cpass);
	}

	public void clickSendEmail() {
		driver.findElement(By.id("sendemail")).click();
	}
	
	public void getMessage() {
		System.out.println(driver.findElement(By.xpath("/html/body/div[4]/h2")).getText());
	}
	
	public void clickOkButton() {
		driver.findElement(By.xpath("/html/body/div[4]/div[7]/div/button")).click();
	}
	
}
