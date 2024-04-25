package Demo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class SingleFileUploading {

	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sumit goyal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
 
	 driver.findElement(By.xpath("//label[@id='wdgt-file-upload']")).click();
	 
	 Thread.sleep(3000);
	 
	Runtime.getRuntime().exec("C:\\Users\\sumit goyal\\Downloads\\file.exe");
	 
		
	}
	
	
	
	
	
	
	
}
