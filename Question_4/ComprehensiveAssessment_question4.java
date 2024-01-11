package chromeAssessment_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ComprehensiveAssessment_question4 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"./Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.makemytrip.com/");
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

		driver.quit();
	}
}
