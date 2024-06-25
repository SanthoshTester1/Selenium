package Locators;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class LinkText {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions chrometesting = new ChromeOptions();
		chrometesting.setBinary("C:\\DriverPath\\ChromeTesting\\chrome-win64\\chrome.exe");
		
		WebDriver driver = new ChromeDriver(chrometesting);
		driver.get("https://omayo.blogspot.com");
		driver.manage().window().maximize();
		
		String linktextName = driver.findElement(By.linkText("Page One")).getText();
		System.out.println("Link Name:- "+ linktextName);
		/*
		WebElement Clicklink = driver.findElement(By.linkText("Page One"));
		Clicklink.click();
		Thread.sleep(4000);
		*/
		driver.close();	
	}
}
