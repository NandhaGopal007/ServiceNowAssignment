package Automation1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ServiceNow {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();	
		driver.get("https://dev140572.service-now.com/navpage.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.switchTo().frame(0);
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("P-qQ7@umSYz8");
		driver.findElement(By.id("sysverb_login")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@placeholder='Filter navigator']")).sendKeys("Service Catalog");
		driver.findElement(By.xpath("//div[text()='Service Catalog']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//h2[contains(text(),'Mobiles')]")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//strong[.='iPhone 6s']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		WebElement dropdown1 = driver.findElement(By.xpath("//select [@id='IO:8350086e4f334200086eeed18110c7cd']"));
		Select dd1 = new Select(dropdown1);	
		dd1.selectByVisibleText("Gold");
		
		WebElement dropdown2 = driver.findElement(By.xpath("//select [@id='IO:32e0886e4f334200086eeed18110c738']"));
		Select dd2 = new Select(dropdown2);
		dd2.selectByIndex(2);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.findElement(By.id("oi_order_now_button")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		WebElement verify = driver.findElement(By.xpath("//div[@class='notification notification-success']"));
		System.out.println(verify.getText());
		
		WebElement verify2 = driver.findElement(By.id("requesturl"));
	    System.out.println(verify2.getText());
	    driver.quit();
	}
	
}
