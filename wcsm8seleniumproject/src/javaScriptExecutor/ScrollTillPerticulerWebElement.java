package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScrollTillPerticulerWebElement {
	
	private static Object point;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://in.puma.com/in/en/mens/mens-shoes?utm_source=GGL-SEA&utm_medium=PS&utm_campaign=PS_GGL_SEA_TXT_Brand_Category&utm_aud=OTH&utm_obj=OLC&gclid=Cj0KCQjwr82iBhCuARIsAO0EAZxOIfuA6kbG4-BlBBtMhOII1IM1uhYIe_jWVRqdwvf4bmm9XHIyY_8aAj_5EALw_wcB");
		
		WebElement shoes = driver.findElement(By.xpath("//img[@class='w-full bg-puma-black-800 aspect-1-1' ]"));
		
		Point point1 = shoes.getLocation();
		int xaxis = point1.getX();
		int yaxis =point1.getY();
		
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		//System.println(yaxis);
		jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-500)+")");
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(shoes)).click();
		
		
	}

}
