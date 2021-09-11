import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollerPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Namrata\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,400)");

		Thread.sleep(200l);

		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");

		int table = driver.findElements(By.xpath("//div[@class='tableFixHead'] //td[4]")).size();
		int sum = 0;

		for (int i = 0; i < table; i++) {

			String tabledata = driver.findElements(By.xpath("//div[@class='tableFixHead'] //td[4]")).get(i).getText();

			System.out.println(tabledata);

			int intvalue = Integer.parseInt(tabledata);
			sum = sum + intvalue;

		}
		System.out.println(sum);
		driver.findElement(By.className("totalAmount")).getText();
		driver.findElement(By.className("totalAmount")).getText().split(":")[1].trim();
		int value = Integer.parseInt(driver.findElement(By.className("totalAmount")).getText().split(":")[1].trim());

		if (sum == value) {
			System.out.println("Count Matches");
		} else {
			System.out.println("count fails");
		}
	}
}


