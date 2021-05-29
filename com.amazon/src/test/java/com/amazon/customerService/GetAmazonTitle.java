package com.amazon.customerService;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAmazonTitle {

	public static void main(String[] args) {
		//this is how to open a chrome browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//this is how open an application
		driver.get("https://www.amazon.com/");
		
		String amazonTitle=driver.getTitle();
		System.out.println("This is amazon title: "+ amazonTitle);
		
		//driver.quit();
		
		
	}
}
