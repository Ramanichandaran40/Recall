package com.revision;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[]args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramanichandaran M\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		WebElement options = driver.findElement(By.id("Skills"));
		Select s = new Select(options);
		List<WebElement> opt = s.getOptions();
		for(WebElement x:opt) {
			System.out.println(x.getText());
		}
		s.selectByVisibleText("Matlab");
		WebElement country = driver.findElement(By.xpath("//span[@role ='combobox']"));
		country.click();
		List <WebElement> list = driver.findElements(By.tagName("li"));
		for(WebElement x:list) {
			String li = x.getText();
			System.out.println(li);
			if(li.contains("India")) {
				x.click();
			}
		}

	}
}
