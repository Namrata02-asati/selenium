import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practise06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Namrata\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	     
	     driver.findElement(By.id("checkBoxOption2")).click();
	     String abc = driver.findElement(By.id("checkBoxOption2")).getAttribute("value");
	     System.out.println(abc);
	     
	     WebElement StaticDropdown= driver.findElement(By.id("dropdown-class-example"));
	     
	     Select s1= new Select(StaticDropdown);
	     s1.selectByValue(abc);
	     
	     driver.findElement(By.id("name")).sendKeys(abc);
	     driver.findElement(By.id("alertbtn")).click();
	     
	     String v= driver.switchTo().alert().getText();
	     
	     System.out.println(v);
	     if(v.contains(abc))
	     {
	    	 System.out.println("Alert Message success");
	    	 
	     }
	     
	     else {
	    	 System.out.println("Alert Fail");
	     }
	     
	     driver.switchTo().alert().accept();
	     
	     

	}

}
