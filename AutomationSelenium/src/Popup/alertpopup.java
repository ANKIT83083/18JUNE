package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class alertpopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
        driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='confirmation']")).click();
		//driver.findElement(By.xpath("//input[@name='prompt']")).click();
		Thread.sleep(3000);
		
		Alert alt=driver.switchTo().alert();
		//alt.getText();
		//alt.accept();
		//alt.dismiss();
		//alt.sendKeys("ankit");
		alt.accept();
		
	}

}
