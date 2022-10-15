package Demo;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
		Date d=new Date();
		String Filename=d.toString().replace(":", "_").replace(" ","_") + ".png";
		System.out.println(Filename);
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Destination= new File("\\D:\\screenshot\\screenshot.jpg");
		FileHandler.copy(source, Destination);
			
	}

}
