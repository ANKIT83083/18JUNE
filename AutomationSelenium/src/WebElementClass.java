import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementClass {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(2000);
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='customers']//tr"));
		System.out.println(rows.size());
		List<WebElement> headercells=driver.findElements(By.xpath("//table[@id='customers']//tr/th"));
		List<WebElement> remeaningcells=driver.findElements(By.xpath("//table[@id='customers']//tr/td"));
        System.out.println(headercells.size()+remeaningcells.size());
        
      //  for(WebElement cells:headercells ) {
     //   	System.out.println(cells.getText());
    // }
        //or
       // for (int i=0;i<headercells.size();i++) {
       // 	System.out.println(headercells.get(i).getText());
       // }
        
      // for(WebElement cells:remeaningcells ) {
       // 	System.out.println(cells.getText());
      // }
        //or
       // for (int j=0;j<remeaningcells.size();j++) {
       // 	System.out.println(remeaningcells.get(j).getText());
       // }
        
        for (int i=1; i<=rows.size();i++) {
        	List<WebElement>Rows_Cells;
        	
        	if(i==1) {
        		Rows_Cells=driver.findElements(By.xpath("//table[@id='customers']//tr["+i+"]/th"));
        	}
        	else {
        		Rows_Cells=driver.findElements(By.xpath("//table[@id='customers']//tr["+i+"]/td"));
        	}
        	for(int j=0;j<Rows_Cells.size(); j++){
        		System.out.print(Rows_Cells.get(j).getText()+" # ");
        	}
        	System.out.println();
        }
	  
	}

}
