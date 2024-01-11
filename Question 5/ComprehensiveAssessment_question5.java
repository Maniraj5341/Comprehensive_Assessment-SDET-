package Assessment5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ComprehensiveAssessment_question5 {

	

		WebDriver driver;
		String path = "./Drivers\\chromedriver.exe";
		String url = "https://www.makemytrip.com/";
		
		@BeforeMethod
		public void openBrowser() {
			
			driver = new ChromeDriver();
			System.getProperty("webdriver.chrome.driver", path);
			driver.get(url);
		}
		
		@AfterMethod
		public void closeBrowser() {
			driver.quit();
		}

		@Test
		public void verifyLogo() {
			WebElement logo = driver.findElement(By.xpath("//img[@alt='Make My Trip']"));
			 if (logo.isDisplayed()) {
		            System.out.println("Logo is present");
		        } else {
		            System.out.println("Logo is not present");
		        }
		}
		
		@Test
		public void bookFlight() throws InterruptedException {
			Thread.sleep(5000);
			driver.switchTo().frame(driver.findElement(By.name("notification-frame-~197139432")));
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='webklipper-publisher-widget-container-notification-close-div']/i"))
					.click();
			Thread.sleep(1000);
			driver.switchTo().parentFrame();

			driver.findElement(By.xpath("//span[text()='Flights']")).click();

			// OneWay is selected by default
			Thread.sleep(1000);

			WebElement from = driver.findElement(By.xpath("//label[@for='fromCity']"));
			from.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Hyderabad");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='react-autowhatever-1-section-0-item-0']")).click();
			Thread.sleep(2000);

			WebElement to = driver.findElement(By.xpath("//label[@for='toCity']"));
			to.click();
			driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Mumbai");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='react-autowhatever-1-section-0-item-0']")).click();
		}
		
		

		
	}

