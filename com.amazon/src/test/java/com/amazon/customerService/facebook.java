package com.amazon.customerService;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//this is how to open a chrome browser
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				
				//this is how open an application
				driver.get("https://www.facebook.com//");
		
	}

}
