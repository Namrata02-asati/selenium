package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Exercise2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Namrata\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(2000);
		
		WebElement staticDropdown= driver.findElement(By.id("Adults"));
		
		Select dropdown=new Select(staticDropdown);
		dropdown.selectByValue("7");
		
		WebElement staticDropdown01= driver.findElement(By.id("Childrens"));
		Select dropdown1=new Select(staticDropdown01);
		dropdown1.selectByValue("2");
		
		WebElement staticDropdown02= driver.findElement(By.id("Infants"));
		Select dropdown2=new Select(staticDropdown02);
		dropdown2.selectByValue("5");
		
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//body/section[@id='Home']/div[1]/div[1]/div[1]/form[1]/div[4]/section[2]/div[1]/dl[1]/dd[1]/div[1]/a[1]/i[1]")).click();
	    
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		
		driver.findElement(By.id("SearchBtn")).click();
		
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
	
	
	}

}
