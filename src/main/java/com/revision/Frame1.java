package com.revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {
	public static void main(String[]args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramanichandaran M\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text() ='Iframe with in an Iframe']")).click();
		WebElement f1 = driver.findElement(By.xpath("//iframe[@src ='MultipleFrames.html']"));
		driver.switchTo().frame(f1);
		WebElement f2 = driver.findElement(By.xpath("//iframe[@src = 'SingleFrame.html']"));
		driver.switchTo().frame(f2);
		WebElement w = driver.findElement(By.xpath("//input[@type ='text']"));
		w.sendKeys("Ramanichandaran");
	}
}
