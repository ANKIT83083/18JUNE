package Demo;

import java.io.File;
import java.io.IOException;
import java.rmi.AccessException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot1 {
	public static void abc() throws IOException{
	Date d = new Date();
		String str = d.toString().replace(" ", "-").replace(":", "-");
		System.out.println(str);
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
        File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//take screenshot
		File Dest = new File("\\D:\\screenshot\\"+str+".jpg");//save screenshot in given path
		FileHandler.copy(source, Dest);//to handle IOException(Source and Dest)

	}
	
		
public static void main(String[] args) throws IOException {
	Screenshot1.abc();	
}
}


