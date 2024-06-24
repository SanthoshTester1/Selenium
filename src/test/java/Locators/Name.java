package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Name {
	static WebDriver driver;
	
	public static void main(String[]  args) throws InterruptedException   {
		ChromeOptions chrometesting = new ChromeOptions();
		chrometesting.setBinary("C:\\DriverPath\\ChromeTesting\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver(chrometesting);
		driver.get("https://omayo.blogspot.com");
		driver.manage().window().maximize();
	    WebElement Nameattribute = driver.findElement(By.name("textboxn"));
		Nameattribute.sendKeys("This is Using name Locator");
		Thread.sleep(4000);
		highlights(Nameattribute);
		driver.close();
	}
	public static void highlights(WebElement element) {
		JavascriptExecutor  js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
		js.executeScript("arguments[0].setAttribute('style', 'border:5px solid red; background : light blue')", element);
	}
}
