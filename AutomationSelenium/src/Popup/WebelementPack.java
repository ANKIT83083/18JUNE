package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementPack {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		Thread.sleep(3000);
        WebElement web=driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
        System.out.println(web.isSelected());
        
        WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
       // System.out.println(login.isEnabled());
       // System.out.println(login.isDisplayed());
        System.out.println(login.getAttribute("name"));
	}

	

}
