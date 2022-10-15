package Popup;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_alert']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_confirm']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_prompt']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_alert2']")).click();
		Thread.sleep(3000);
		driver.getWindowHandle();
		driver.getWindowHandles();
		ArrayList<String> aa=new ArrayList<String>(driver.getWindowHandles());
		String id=aa.get(0);
		driver.switchTo().window(id);
		String w=driver.getCurrentUrl();
		System.out.println(w);
		
		driver.navigate().to("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.findElement(By.xpath("//a[@href='javascript:void(0);'][3]")).click();
		
	}

}
