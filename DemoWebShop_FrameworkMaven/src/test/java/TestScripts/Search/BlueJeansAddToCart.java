package TestScripts.Search;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericlibrary.BaseTest;
import pomrepository.SearchPage;
import pomrepository.ShoppingCartPage;



@Test
public class BlueJeansAddToCart extends BaseTest{
	
	public void Verify_User_Is_Able_to_Add_BlueJeans_to_The_Cart() throws InterruptedException{
		
		//Entering data into SearchTextField	
		home_Page.getSearchTextField().sendKeys("blue jeans");
		home_Page.getSearchButton().click();
		
		//Validate Whether Search Page is Displayed
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Search");
		Reporter.log("Search Page Displayed" , true);
		
		//Validate Search Product is Displayed or not
		SearchPage search_Page = new SearchPage(driver);
		
		//Click On AddToCart
		String expProductName = search_Page.getJeans().getText();
		search_Page.getAddToCart().click();
				
		//Click On ShoppingCart Link
		home_Page.getShoppingCartLink().click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[text() = 'Shopping cart']"))));		
		
		//Validate Shopping Cart Page
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Shopping Cart");
		Reporter.log("Shopping Cart page is displayed",true);
		
		//Entering Data on Quantity textField
		ShoppingCartPage shoppingCart_Page = new ShoppingCartPage(driver);
		String actProductName = shoppingCart_Page.getBlueJeans().getText();
		
		Assert.assertEquals(expProductName,actProductName);
		Reporter.log("Blue Jeans is displayed in Search Page", true);
		
		shoppingCart_Page.getQtyTextField().click();
		shoppingCart_Page.getQtyTextField().clear();
		shoppingCart_Page.getQtyTextField().sendKeys("5",Keys.ENTER);
		
		//Validation Increasing Quantity
	
		String priceText = shoppingCart_Page.getPrice().getText();
		String quantityText = shoppingCart_Page.getQtyTextField().getAttribute("value");
		String totalText = shoppingCart_Page.getTotal().getText();
		
		double priceNumText = Double.valueOf(priceText);
		double quantityNumText = Double.valueOf(quantityText);
		double totalNumText = Double.valueOf(totalText);
		
		double total = priceNumText*quantityNumText;
		Assert.assertEquals(totalNumText,total);
		Reporter.log("Quantities are Same");
				
		//Selecting checkBox
		shoppingCart_Page.getSingleCheckBox().click();
				
		//Clicking on Update Shopping Cart
		shoppingCart_Page.getUpdateShoppingCart().click();
	}

}
