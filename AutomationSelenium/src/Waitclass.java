import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitclass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login.php");
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  //implicit wait
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		
		WebElement ele =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text']")));
		
		
		
		
		
	}

}
