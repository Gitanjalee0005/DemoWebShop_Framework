
package TestScripts.AddToCartTestCase;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericlibrary.BaseTest;
import pomrepository.DigitalDownloadPage;
import pomrepository.ShoppingCartPage;

@Listeners(genericlibrary.ListenersImplementation.class)
public class AddToCartTestCase extends BaseTest{
	
	@Test(groups = "integration")
	public void Verify_User_Is_Able_To_Add_Products_To_The_AddToCart() throws InterruptedException {
		
		//Click On Digital Downloads
		home_Page.getDigitalDownloadLink().click();
		
		//Verify the digital-downloads Page		
		Assert.assertEquals(driver.getCurrentUrl(), "https://demowebshop.tricentis.com/digital-downloads");
		Reporter.log("This is digital-downloads Page" , true);
				
		//Adding All the Products to the cart
		DigitalDownloadPage digitalDownload_Page = new DigitalDownloadPage(driver);
		List<WebElement> addToCartButton = digitalDownload_Page.getAddToCartButton();
			for(WebElement cartButton : addToCartButton) {
				cartButton.click();
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				wait.until(ExpectedConditions.elementToBeClickable(cartButton));
					
				Thread.sleep(1000);		}
				
		//Navigating to Shopping Cart Page
		home_Page.getShoppingCartLink().click();
				
		//Validate Shopping Cart Page				
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Shopping Cart");
		Reporter.log("Shopping Cart page is displayed" , true);
		
		//Validate to Added products
		ArrayList<String> allProductName = new ArrayList<String>();
		ShoppingCartPage shoppingCart_Page = new ShoppingCartPage(driver);
		List<WebElement> allProductNameSCP = shoppingCart_Page.getAllProductName();
			for(WebElement name:allProductNameSCP) {
				allProductName.add(name.getText());
			}
				
			Assert.assertEquals(allProductName.size(),3);
			Reporter.log("Products are Added", true);
			
		//Removing the products from Shopping Cart
		List<WebElement> allCheckBox = shoppingCart_Page.getCheckBox();
			for(WebElement checkBox : allCheckBox) {
				checkBox.click();
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				wait.until(ExpectedConditions.elementToBeClickable(checkBox));
				}
		//Clicking on UpdatingShopping Cart and Remove the product to the Shopping Cart
		shoppingCart_Page.getUpdateShoppingCart().click();
	}
	
	

}
