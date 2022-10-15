import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locaters {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// Browser Launch
		driver.manage().window().maximize();
		driver.navigate().to("https://facebook.com");
	
		Thread.sleep(2000);
		//WebElement loginbutton=driver.findElement(By.tagName("a"));
		//loginbutton.sendKeys("ankit");
//		driver.findElement(By.name("email")).sendKeys("ankit");
//	
//		driver.findElement(By.id("pass")).sendKeys("password");
//		
//		driver.findElement(By.name("login")).click();
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ankit");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("password");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		
	}

}
