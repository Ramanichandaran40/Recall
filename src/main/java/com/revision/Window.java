package com.revision;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window {
	public static void main(String[]args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramanichandaran M\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =  new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	String title = driver.getTitle();
	driver.findElement(By.xpath("//button[text() ='✕']")).click();
	WebElement src = driver.findElement(By.name("q"));
	src.sendKeys("Redmi Note 10 Pro");
	driver.findElement(By.xpath("//button[@type ='submit']")).click();
	Thread.sleep(2000);
	List <WebElement> w = driver.findElements(By.xpath("//div[@class ='_4rR01T']"));
	for(WebElement x:w) {
		String g = x.getText();
		System.out.println(g);
		driver.findElement(By.xpath("(//div[@class ='_4rR01T'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class ='_4rR01T'])[2]")).click();
		driver.findElement(By.xpath("(//div[@class ='_4rR01T'])[3]")).click();
		Set<String> cWin = driver.getWindowHandles();
		Thread.sleep(2000);
		List<String> win = new ArrayList(cWin);
		for(String p:win) {
		String t = win.get(0);
		driver.switchTo().window(t);
WebElement move = driver.findElement(By.xpath("//span[text() ='Men']"));
Actions a = new Actions(driver);
a.moveToElement(move).perform();
Thread.sleep(2000);
driver.findElement(By.xpath("//a[@title = 'Clothing']")).click();
			
		}
		
		
	}
	}
	}
