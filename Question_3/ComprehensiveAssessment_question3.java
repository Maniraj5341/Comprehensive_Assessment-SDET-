package firefoxAssessment_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ComprehensiveAssessment_question3 {

	 public static void main(String[] args) {
		 
		 System.setProperty("webdriver.gecko.driver", "./Drivers\\geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
		 driver.get("https://www.makemytrip.com/");
		 WebElement logo = driver.findElement(By.xpath("//img[@alt='Make My Trip']"));
		 if (logo.isDisplayed()) {
	            System.out.println("Logo is present");
	        } else {
	            System.out.println("Logo is not present");
	        }
		 driver.quit();
	 }

}
