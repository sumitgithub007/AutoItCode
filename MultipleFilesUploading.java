package Demo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MultipleFilesUploading {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sumit goyal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://demos.devexpress.com/ASPxFileManagerAndUploadDemos/UploadControl/MultiFileSelection.aspx");

		
		driver.manage().window().maximize();//maximizing window
		Thread.sleep(4000);

		driver.findElement(By.xpath("//td[@id='ContentHolder_UploadControl_Browse0']")).click();

		String path = "C:\\Users\\sumit goyal\\Downloads\\autoIT";

		File directory = new File(path);

		String allimages = "";

		String doublequotesfile = "";
		
		File[] list = directory.listFiles();
      //"file1.jpg" "file2" "file3" "file4" "file5" "file6" "filepng7" 
		
		for (File file : list) {

			if (file.isFile()) {
			String files = file.getName();

			String splitting = files.split("\\.")[0];
			
			 
			
			doublequotesfile = "\"" + splitting + "\"";

		 		
			System.out.println(doublequotesfile);
			allimages = allimages + doublequotesfile + " ";
			
			
			}

		}
		System.out.println(allimages);

		Thread.sleep(3000);

		Runtime.getRuntime().exec("C:\\Users\\sumit goyal\\Downloads\\new.exe" + " " + path);

		Thread.sleep(3000);

		
		Runtime.getRuntime().exec("C:\\Users\\select_clickAll.exe" + " " + allimages);
	}

}
