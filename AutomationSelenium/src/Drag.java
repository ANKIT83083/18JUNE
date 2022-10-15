import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement Src = driver.findElement(By.name("(//a[@class='button button-orange'])[2]"));
		WebElement target = driver.findElement(By.xpath("//ol[@id='amt7']"));
		Actions act= new Actions(driver);
		Thread.sleep(2000);
		act.clickAndHold(target).perform();
		
	}


	}


