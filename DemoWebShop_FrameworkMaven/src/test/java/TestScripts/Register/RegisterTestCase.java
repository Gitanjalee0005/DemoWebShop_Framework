package TestScripts.Register;

import java.io.IOException;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import genericlibrary.BaseTest;

public class RegisterTestCase extends BaseTest{
	
	@Test(groups = "Functional" , dataProvider = "RegisterData")
	public void verify_User_Is_Able_To_Register(String firstName, String LastName, String email, String password, String confirmPassword) throws EncryptedDocumentException, IOException {
		
		String modEmail = new Random().nextInt(3000)+email;
		
		//Click On LogOut Link
		home_Page.getLogoutLink().click();
		
		//Validation 	
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop");
		Reporter.log("LogOut Successful" , true);
		
		//Click on Register Link
		home_Page.getRegisterLink().click();
		
		//Validate whether Register Page is displayed or not		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Register");
		Reporter.log("Registration Page is Displayed" , true);	
		
		//Refresh the Page
		driver.navigate().refresh();
		
		//Click On RegisterLink
		pomrepository.RegisterPage register_page = new pomrepository.RegisterPage(driver);
		register_page.getFemaleRadioButton().click();
		register_page.getFirstNameTextField().sendKeys(firstName);
		register_page.getLastNameTextField().sendKeys(LastName);
		register_page.getEmailTextField().sendKeys(modEmail);
		register_page.getPasswordTExtField().sendKeys(password);
		register_page.getConfirmPasswordTextField().sendKeys(confirmPassword);
		register_page.getRegisterButton().click();
		
		String verificationMsg = register_page.getVerificationMsg().getText();
		Reporter.log(verificationMsg , true);
		
		//Validate register sucessFul or not		
		Assert.assertEquals(register_page.getVerificationMsg().getText(), "Your registration completed");
		Reporter.log("Registration Successfull" , true);	
		
	}
	
	@DataProvider(name = "RegisterData")
	public Object[][] datasupply() throws EncryptedDocumentException, IOException{
		
		return data_Utility.getMultipleDataFromExcel("RegisterData");
	}
	
}
