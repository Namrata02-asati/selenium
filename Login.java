package EndToEndTesting;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Namrata\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		driver.findElement(By.cssSelector("input[value =\'radio1\']")).click();
		driver.findElement(By.cssSelector("input[value =\'radio2\']")).click();
		driver.findElement(By.cssSelector("input[value =\'radio3\']")).click();
		//Auto suggestive drop down country search
		//driver.findElement(By.id("autocomplete")).sendKeys("india");
		driver.findElement(By.id("autocomplete")).sendKeys("United States (USA)");
		//select drop down
	    WebElement StaticDropdown = driver.findElement(By.id("dropdown-class-example"));
		Select dropdown= new Select(StaticDropdown);
		dropdown.selectByValue("option1");
		dropdown.selectByValue("option2");
		dropdown.selectByValue("option3");
		
		//checkbox
		driver.findElement(By.id("checkBoxOption1")).click();
		driver.findElement(By.id("checkBoxOption2")).click();
		driver.findElement(By.id("checkBoxOption3")).click();
		
		//open new window
		driver.findElement(By.id("openwindow")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parent= it.next();
		String child= it.next();
		driver.switchTo().window(child);
		Thread.sleep(200);
		driver.close();
		
		
		

	}

}
