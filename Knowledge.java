package Automation1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Knowledge {
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
		driver.findElement(By.xpath("//input[@placeholder='Filter navigator']")).sendKeys("Knowledge");
		driver.findElement(By.xpath("//div[text()='Knowledge']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//span[@class='btn-icon icon-article-document homepage-icon']")).click();
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("(//span[@class='icon icon-search'])[1]")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> value = new ArrayList<String>(windowHandles);
		driver.switchTo().window(value.get(1));
		
        
		driver.findElement(By.xpath("(//a[@class='glide_ref_item_link'])[1]")).click();
		
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> value1 = new ArrayList<String>(windowHandles1);
		driver.switchTo().window(value1.get(0));
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='kb_knowledge.short_description']")).sendKeys("Automation Testing");
        driver.findElement(By.xpath("//button[@id='sysverb_insert_bottom']")).click();
		
		driver.quit();
	}

}
