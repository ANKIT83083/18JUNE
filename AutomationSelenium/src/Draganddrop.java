import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(2000);
		WebElement source=driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		
		WebElement target=driver.findElement(By.xpath("//ol[@class='field13 ui-droppable ui-sortable']"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(source, target).perform();
		
		
	}

}
