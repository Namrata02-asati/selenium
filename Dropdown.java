package practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// System.out.println("Hello");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Namrata\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement staticDropdown= driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select dropdown= new Select(staticDropdown);
		dropdown.selectByIndex(3);
		
		Assert.assertTrue(true, "USD");
		
		dropdown.selectByValue("INR");
		Assert.assertTrue(true, "INR");
		
		dropdown.selectByVisibleText("AED");
		Assert.assertTrue(true, "AED");
	}
}
