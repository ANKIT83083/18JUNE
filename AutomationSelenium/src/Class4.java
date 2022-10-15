import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		
		driver.manage().window().maximize();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		System.out.println(driver.getTitle());
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(2000);
		Navigation nv=driver.navigate();
		nv.back();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		Dimension D1=new Dimension(200,400);
		driver.manage().window().setSize(D1);
		Thread.sleep(2000);
		Point p= new Point(100,500);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com");
		System.out.println(driver.getTitle());
		nv.refresh();
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
		
	}

}
