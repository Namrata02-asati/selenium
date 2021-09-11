
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Namrata\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://qa.app.cloudlex.com/#/login");

		// Login
		driver.findElement(By.id("exampleInputEmail1")).sendKeys("newtonllp1@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Cloudlex#2018");

		driver.findElement(By.cssSelector(".btn.btn-default")).click();

	}

}
