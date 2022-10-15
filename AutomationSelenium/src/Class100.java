import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class100 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();// Browser Launch
	driver.manage().window().maximize();
	driver.navigate().to("https://facebook.com");

	Thread.sleep(2000);
}
}
