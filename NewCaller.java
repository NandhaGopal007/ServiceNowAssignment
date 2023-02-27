package Automation1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewCaller {
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
		driver.findElement(By.xpath("//input[@placeholder='Filter navigator']")).sendKeys("Caller");
		driver.findElement(By.xpath("//div[text()='Callers']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[@class='selected_action action_context btn btn-primary']")).click();
		driver.findElement(By.xpath("//input[@id='sys_user.first_name']")).sendKeys("Nanda");
		driver.findElement(By.xpath("//input[@id='sys_user.last_name']")).sendKeys("Gopal");
		driver.findElement(By.xpath("//input[@id='sys_user.title']")).sendKeys("IT");
		driver.findElement(By.xpath("//input[@id='sys_user.email']")).sendKeys("gopalnanda983@gmail.com");
		driver.findElement(By.xpath("//input[@id='sys_user.mobile_phone']")).sendKeys("+91 7358593118");
		driver.findElement(By.xpath("//button[@id='sysverb_insert_bottom']")).click();
		
		WebElement ele = driver.findElement(By.className("outputmsg_text"));
        String title = ele.getText();
        System.out.println(title);
		driver.quit();
		
		
		
		
	}

}
