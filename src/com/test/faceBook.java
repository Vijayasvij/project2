package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class faceBook {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\selenium1daytask5\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    driver.get("https://www.facebook.com/");
    driver.findElement(By.id("email")).sendKeys("vijay");
    driver.findElement(By.id("password")).sendKeys("Vijay@1234");
    driver.findElement(By.id("Login")).click();
    
	}

}
