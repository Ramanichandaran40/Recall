package com.revision;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SS {
	public static void main(String[]args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramanichandaran M\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =  new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	String title = driver.getTitle();
	driver.findElement(By.xpath("//button[text() ='✕']")).click();
	TakesScreenshot t = (TakesScreenshot) driver;
	File source = t.getScreenshotAs(OutputType.FILE);
	File destination = new File("C:\\Users\\Ramanichandaran M\\Links\\Test\\Recall\\Screen Shot" + title + ".png");
	FileUtils.copyFile(source, destination);
	}

}
