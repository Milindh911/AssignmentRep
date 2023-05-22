package SelfLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D4M7 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/MI20463606/Downloads/chromedriver_mac_arm64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://in.bookmyshow.com/");
		driver.manage().window().fullscreen();
		
//		driver.manage().w
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.xpath("//img[@alt='MUMBAI']"));
		search.click();
		
	}
	
	
}
