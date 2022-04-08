package Week3Day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AjioListCollectionsSelenium {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
	
		
		ChromeDriver driver=new ChromeDriver();
				
		driver.get("https://www.ajio.com/");
	    driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    driver.findElement(By.xpath("//label[@for='Men']")).click();
	   Thread.sleep(5000);
	    driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
	    Thread.sleep(5000);
	    System.out.println(driver.findElement(By.xpath("//div[@class='filter']/div")).getText());
	    driver.findElement(By.xpath("//Span[text()=\"brands\"]")).click();
	    
	    
	    List<WebElement> brands= driver.findElements(By.className("brand"));
	   
	    for(WebElement w: brands) {
	    	
	    	System.out.println(w.getText());
	    	
	    }
	    List<WebElement> bags= driver.findElements(By.className("name"));
	    for(WebElement w: bags) {
	    	
	    	System.out.println(w.getText());
	    	
	    }
}
}
