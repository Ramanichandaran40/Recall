package com.revision;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JScript {
	public static void main(String[]args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramanichandaran M\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement usrname = driver.findElement(By.id("email"));
		WebElement pwd = driver.findElement(By.id("pass"));
		WebElement down = driver.findElement(By.xpath("//a[text()= 'தமிழ்']"));
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].setAttribute('value','9003735054')", usrname);
		j.executeScript("arguments[0].setAttribute('value','Qwertyuiop@100')", pwd);
		j.executeScript("arguments[0].scrollIntoView(true)", down);
		
		
	}

}
