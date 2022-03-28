package com.revision;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	public static void main(String[]args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramanichandaran M\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		WebElement f = driver.findElement(By.tagName("frame"));
		driver.switchTo().frame(f);
		WebElement usrnemae = driver.findElement(By.name("fldLoginUserId"));
		usrnemae.sendKeys("Ramanichandaran");

}
}
