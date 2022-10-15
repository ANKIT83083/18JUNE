package Popup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childbrowser {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_alert']")).click();
		String mainWindowsId=driver.getWindowHandle();
		String expUrl="https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert";
		String expId="";
		Set <String> alladd=driver.getWindowHandles();
		for (String s:alladd ) {
			System.out.println(s);
			driver.switchTo().window(s);
			String actUrl=driver.getCurrentUrl();
			if(expUrl.equals(actUrl)) {
				System.out.println("Correct Window");
				expId=s;
				//break;
			}else {
				System.out.println("Wrong Window");
			}	
		}
		driver.switchTo().window(expId);	
	}

}
