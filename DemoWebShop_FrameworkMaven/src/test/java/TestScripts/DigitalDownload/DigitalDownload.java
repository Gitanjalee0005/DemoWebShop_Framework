package TestScripts.DigitalDownload;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericlibrary.BaseTest;

public class DigitalDownload extends BaseTest {
	
	@Test(groups = "Smoke")
	public void verify_User_Is_Able_To_Click_Digital_Downloads() {
		
		//Click on Digital Download
		home_Page.getDigitalDownloadLink().click();
	
		//Verify the digital-downloads Page		
		Assert.assertEquals(driver.getCurrentUrl(), "https://demowebshop.tricentis.com/digital-downloads");
		Reporter.log("This is digital-downloads Page" , true);
	}

	
}
