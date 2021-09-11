

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EndToENd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\Namrata\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.get("https://rahulshettyacademy.com/AutomationPractice/");
     System.out.println(driver.findElements(By.tagName("a")).size());
     
     WebElement fotter = driver.findElement(By.id("gf-BIG"));//limiting webdriver scope
     System.out.println(fotter.findElements(By.tagName("a")).size());
     
     WebElement Firstcolumn= fotter.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
     System.out.println(Firstcolumn.findElements(By.tagName("a")).size());
     
     for(int i=1;i<Firstcolumn.findElements(By.tagName("a")).size();i++)
     {
    	 String clickonlink=Keys.chord(Keys.CONTROL, Keys.ENTER);
    	 
    	 Firstcolumn.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);
    	 Thread.sleep(2000);
    	 
    	
    	
    	
     }
     Set<String> abc= driver.getWindowHandles();
 	 Iterator<String> it = abc.iterator();
 	 
 	 while(it.hasNext())
 	 {
 		 driver.switchTo().window(it.next());
 		 System.out.println(driver.getTitle());
 	 }
     
     
     
	}

}
