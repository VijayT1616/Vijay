package xpathAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FlipkartMobile {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver (co);
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text']")).click();
		
	//	driver.findElement(By.xpath("//button[@class='_2Kpz61_2dob4z']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("mobile");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[class='L0z3pu']")).click();
		String Mobname=driver.findElement(By.xpath("//div[text()='SAMSUNG Galaxy F13 (Waterfall Blue, 128 GB)']")).getText();
		System.out.println(Mobname);
		Thread.sleep(2000);
		driver.close();
	}

}
