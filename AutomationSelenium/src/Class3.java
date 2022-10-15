import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		String url=driver.getCurrentUrl();
		System.out.println(url);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Dimension D1=new Dimension(100,200);
		driver.manage().window().setSize(D1);
		Point p= new Point(400,300);
		driver.close();
		
		
		
		

	}

}
