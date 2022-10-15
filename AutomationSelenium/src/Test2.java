import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Test2 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000); 
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ankit");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("password");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[@href='https://www.facebook.com/recover/initiate/?ars=facebook_login']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@aria-label='Email address or mobile number']")).sendKeys("9876543");
//		driver.findElement(By.xpath("//button[text()='Search']")).click();
//		
		File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Dest = new File("\\D:\\screenshot\\screenshot.jpg");
		FileHandler.copy(source, Dest);//to handle IOException(Source and Dest)
		Thread.sleep(2000);
		Navigation nv=driver.navigate();
		nv.back();
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("ankit");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("gaherwar");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("ankit@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("12345678");
		
		WebElement date=driver.findElement(By.xpath("//select[@id='day']"));
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
		Select  s=new Select (date);
	    Select  s1=new Select (month);
	    Select  s2=new Select (year);
		
		s.selectByValue("31");
		Thread.sleep(2000);
		s1.selectByValue("12");
		Thread.sleep(2000);
		s2.selectByValue("1996");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
