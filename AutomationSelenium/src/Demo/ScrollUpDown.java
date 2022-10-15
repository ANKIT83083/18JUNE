package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		
		Thread.sleep(3000);
		
		WebElement Tryit=driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[3]"));
		JavascriptExecutor aa=(JavascriptExecutor) driver;
		
		//aa.executeScript("arguments[0].scrollIntoView(true)", Tryit);
		
		aa.executeScript("window.scrollBy(0,1000)");    //down
		Thread.sleep(2000);
		aa.executeScript("window.scrollBy(0,-3000)");    //up
		//Thread.sleep(2000);
		//aa.executeScript("window.scrollBy(1000,0)");     // right
		//Thread.sleep(2000);
		//aa.executeScript("window.scrollBy(-2000,0)");     //left
		//Thread.sleep(2000);
		//aa.executeScript("window.scrollBy(1000,3000)");   //right+down    
		//Thread.sleep(2000);
		//aa.executeScript("window.scrollBy(-1000,3000)");      //left+down
		//Thread.sleep(2000);
		//aa.executeScript("window.scrollBy(2000,-3000)");          //right+up
		//Thread.sleep(2000);
		//aa.executeScript("window.scrollBy(-1000,-3000)");        //left+up
		//Thread.sleep(2000);
		
		
	}

}
