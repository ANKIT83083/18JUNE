import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		WebElement changelanguage=driver.findElement(By.xpath("//a[@aria-label='Choose a language for shopping.']"));
		
		Actions act=new Actions(driver);
		//act.moveToElement(changelanguage).perform();
		//act.contextClick().perform();
		
		//act.moveToElement(changelanguage).perform();
		//act.click().perform();
		//act.click(changelanguage).perform();
		
		//act.doubleClick().perform();
		//act.doubleClick(changelanguage).perform();
		
		act.moveToElement(changelanguage).click().build().perform();
		
		
		
		
		
	}

}
