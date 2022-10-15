package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathClass {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ankit");
		
		//driver.findElement(By.xpath("//button[text()='Log In']")).click();
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	
	}

}
