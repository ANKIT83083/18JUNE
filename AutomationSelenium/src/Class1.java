import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Browser Launch
		//driver.get("https://www.selenium.dev/downloads"); // Url Insert
		driver.navigate().to("https://www.selenium.dev/downloads");
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		System.out.println(driver.getTitle());
		
		Navigation nv=driver.navigate();
		nv.back();
		nv.forward();
		Thread.sleep(1000);
		nv.refresh();
		Thread.sleep(1000);
		driver.quit();
		//driver.close();
		}

}
