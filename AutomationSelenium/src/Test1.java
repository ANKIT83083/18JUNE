import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Test1 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("pune");
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("mumbai");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']")).click();
		Thread.sleep(2000);
		
		//WebElement okay =driver.findElement(By.xpath("//button[text()='OKAY, GOT IT!']"));
		//Actions act=new Actions(driver);
		//act.moveToElement(okay).perform();
		
		//driver.findElement(By.xpath("//button[text()='OKAY, GOT IT!']")).click();
		//driver.findElement(By.xpath("//span[@class='bgProperties icon20 overlayCrossIcon']")).click();
		//Thread.sleep(2000);
		//Alert alt=driver.switchTo().alert();
		//alt.accept();
		
		
        WebElement ViewPrices=driver.findElement(By.xpath("//button[@class='ViewFareBtn  text-uppercase ']"));
		JavascriptExecutor aa=(JavascriptExecutor) driver;
		aa.executeScript("window.scrollBy(0,10000)");
		aa.executeScript("arguments[0].scrollIntoView(true)", ViewPrices);
		Thread.sleep(2000);
	
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Destination= new File("\\D:\\screenshot\\screenshot.jpg");
		FileHandler.copy(source, Destination);
		Thread.sleep(2000);
		aa.executeScript("window.scrollBy(0,-10000)");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@class='chSprite chLoggedOutLogo chMy']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Enter email or mobile number']")).sendKeys("1234567890");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='capText font16']")).click();
		Thread.sleep(2000);
		
		
		
		
		
	}

}
