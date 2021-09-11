package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Exercise1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Namrata\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		boolean x = driver.findElement(By.id("checkBoxOption1")).isSelected();

		if (x == false) {
			driver.findElement(By.id("checkBoxOption1")).click();
			driver.findElement(By.id("checkBoxOption1")).isSelected();
			Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
			Assert.assertTrue(true);
		}
		Thread.sleep(2000);

		driver.findElement(By.id("checkBoxOption1")).click();
		driver.findElement(By.id("checkBoxOption1")).isSelected();
		Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
		Assert.assertFalse(false);

		System.out.println((driver.findElements(By.cssSelector("input[type='checkbox']")).size()));
		Thread.sleep(2000);

	}

}
