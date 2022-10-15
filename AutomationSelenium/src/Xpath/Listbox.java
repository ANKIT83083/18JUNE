package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(2000);
		
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		Select  s=new Select (month);
		Thread.sleep(2000);
		s.selectByIndex(3);
		Thread.sleep(2000);
		s.selectByValue("11");
		Thread.sleep(2000);
		s.selectByVisibleText("Sep");
		
			
	}

}
