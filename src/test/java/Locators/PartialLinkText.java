package Locators;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PartialLinkText {
	public static void main(String[] args) {
		ChromeOptions chrometesting = new ChromeOptions();
		chrometesting.setBinary("C:\\DriverPath\\ChromeTesting\\chrome-win64\\chrome.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com");
		driver.manage().window().maximize();
		String Name = driver.findElement(By.partialLinkText("Page")).getText();
		System.out.println("PartialLink Text:- " + Name);
	}
}
