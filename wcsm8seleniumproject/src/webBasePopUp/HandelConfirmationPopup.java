package webBasePopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelConfirmationPopup {
	
	public static void main(String[] args) throws InterruptedException {
		
       System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/Santosh/Desktop/wcsm8%20HTML/alert.html");
		
             driver.findElement(By.xpath("//button[.='Click me!']")).click();
		
		Alert al = driver.switchTo().alert();
		
		Thread.sleep(2000);
		al.accept();
        
		String text = al.getText();
		System.out.println(text);
		  
		
	}

}
