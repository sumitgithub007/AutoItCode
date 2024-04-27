package restApi;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testnew {


	public static void main(String[] args) throws IOException, InterruptedException {
		
	//	use System.getProperty("user.dir"); donot hardcode
	   String singleFile ="C:\\Users\\Sumit Goyal\\Downloads\\autoit\\Capture.png" ;

		WebDriver driver = new ChromeDriver();

		driver.get("https://demos.devexpress.com/ASPxFileManagerAndUploadDemos/UploadControl/MultiFileSelection.aspx");

		
		driver.manage().window().maximize();//maximizing window
		 
		driver.findElement(By.xpath("//td[@id='ContentHolder_UploadControl_Browse0']")).click();

		String path = "C:\\Users\\Sumit Goyal\\Downloads\\autoit";

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

 
		Runtime.getRuntime().exec("C:\\Users\\sumit goyal\\Downloads\\pathfile.exe" + " " + path);

		 Thread.sleep(7000);//Important to put
	 	Runtime.getRuntime().exec("C:\\Users\\sumit goyal\\Downloads\\pathfile.exe" + " " + allimages);
	}
 
	
	
}
