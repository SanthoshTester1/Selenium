package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class TagName {
		public static void main(String[] args) {
			ChromeOptions chrometesting = new ChromeOptions();
			chrometesting.setBinary("C:\\DriverPath\\ChromeTesting\\chrome-win64\\chrome.exe");
			WebDriver driver = new ChromeDriver(chrometesting);
			driver.get("https://omayo.blogspot.com");
			//How Many Links in the Given Website and Print them 
			List<WebElement> Links = driver.findElements(By.tagName("a"));
			System.out.println("Links of count:-" + Links.size());
			
			for(WebElement link : Links) {
				System.out.println("Link Name:- " + link.getText());
			}
			
			
			
			
			//Count of the Headings And Print The HeadingText
			/**
			List<WebElement> headings= driver.findElements(By.tagName("h2"));
			System.out.println("Count Of the Headings:- " + headings.size());
			for(WebElement heading : headings) {
				System.out.println("HeadingText:- " + heading.getText());
			}
			**/
			driver.close();
		}
		
		
}
