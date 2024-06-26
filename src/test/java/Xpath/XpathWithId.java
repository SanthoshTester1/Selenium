package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class XpathWithId {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions chrometesting = new ChromeOptions();
		chrometesting.setBinary("C:\\DriverPath\\ChromeTesting\\chrome-win64\\chrome.exe");
		driver = new ChromeDriver(chrometesting);
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		driver.manage().window().maximize();
		WebElement LastName = driver.findElement(By.xpath("//input[@name='name' and @type = 'text'][2]"));
		LastName.sendKeys("Using Xpath With Both Conditions Satisify");
		highlight(LastName);
		Thread.sleep(4000);
		driver.close();
	}
	
	public static void highlight(WebElement ele){
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
		js.executeScript("arguments[0].setAttribute('style', 'border:4px solid green ; background :lightyellow')", ele);
		System.out.println("hiq");
	}
	
	
}
