package methodsofdriver1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class QuitMethod {

	// is use to close parent & child Browser!!!

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");

		driver.findElement(By.xpath("//a[.='Open a popup window']")).click();

		Thread.sleep(5000);

		driver.quit();
	}

}