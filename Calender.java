import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Namrata\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     
	     driver.get("https://www.path2usa.com/travel-companions");
	     
	     driver.findElement(By.id("travel_date")).click();
	     
	    while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("May")) {
	    	driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
	    }
	     
	     
	     List<WebElement> dates= driver.findElements(By.cssSelector(".day"));
	     
	     int date= driver.findElements(By.cssSelector(".day")).size();
	     for(int i=0; i<date; i++) {
	    	 
	       String selectdate= driver.findElements(By.cssSelector(".day")).get(i).getText();
	       if(selectdate.equalsIgnoreCase("26")) {
	    	   
	    	   driver.findElements(By.className("day")).get(i).click();
	    	   break;
	        }
	       }
	    	 
	     }
	    

	}

