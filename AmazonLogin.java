package Amazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Namrata\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
		driver.findElement(By.id("searchDropdownBox")).click();
		
		WebElement StaticDropdown = driver.findElement(By.id("searchDropdownBox"));
		Select dropdown= new Select(StaticDropdown);
		
		dropdown.selectByValue("search-alias=fashion-girls-intl-ship");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("dresses");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		
		driver.findElement(By.xpath("//*[text()= 'Account & Lists']")).click();
		
		//WebDriverWait w = new WebDriverWait(driver, 5);
		//w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[text()= 'Sign in']")));
		
		//driver.findElement(By.xpath("//*[text()= 'Sign in']")).click();
		
		driver.findElement(By.id("ap_email")).sendKeys("namrata.asati11@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("auth-fpp-link-bottom")).click();
		driver.findElement(By.id("continue")).click();
        //driver.findElement(By.id("cvf-input-code")).sendKeys("2231");
        
         
         

	}

}
