import java.lang.StackWalker.Option;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		driver.manage().window().minimize();
		Thread.sleep(4000);
		
	
		Options op=driver.manage();
		Window w=op.window();
		w.maximize();
		
		Dimension D1=new Dimension(100,200);
		driver.manage().window().setSize(D1);
		Thread.sleep(4000);
		
		Point p= new Point(400,300);
		driver.manage().window().setPosition(p);
		
		
		
		
	}

}
