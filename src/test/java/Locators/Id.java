package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Id {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException{
		ChromeOptions chrometesting = new ChromeOptions();
		chrometesting.setBinary("C:\\DriverPath\\ChromeTesting\\chrome-win64\\chrome.exe");
		
		driver = new ChromeDriver(chrometesting);
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		WebElement Description = driver.findElement(By.id("ta1"));
		Description.sendKeys("This Seletion Using Id Locator");
		highlight(Description);
		Thread.sleep(4000);
		driver.close();	
	}
	
	 public static void highlight(WebElement element) {
		 JavascriptExecutor js =(JavascriptExecutor)driver; 
		 js.executeScript("window.scrollBy(0,500)"); 
		 js.executeScript("arguments[0].setAttribute('style', 'border:5px solid red; background : yellow')", element); 
	
	}
	
	}

