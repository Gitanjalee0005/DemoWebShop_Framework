package TestScripts.AccessoriesAddtoCart;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericlibrary.BaseTest;
import pomrepository.AccessoriesPage;
import pomrepository.ComputersPage;
import pomrepository.ShoppingCartPage;
import pomrepository.TCPProductPage;
import pomrepository.WishListPage;

public class AccessoriesAddToCart extends BaseTest {
	
	@Test
	public void Verify_User_Is_Able_To_Add_Accessories_Products_To_The_AddToCart_AddToWishList() throws InterruptedException {
		
		//Click on Computers link
		home_Page.getCOMPUTERSLink().click();
		
		//Validate Computers Page is Displayed or not
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Computers");
		Reporter.log("Computers Page is displayed" , true);
		
		//Click on Accessories Link
		ComputersPage computer_Page = new ComputersPage(driver);
		computer_Page.getAccessories().click();
		
		//Validate Computers Page is Displayed or not
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Accessories");
		Reporter.log("Accessories Page is displayed" , true);
		
		//Adding the Products to the cart
		AccessoriesPage accesories_Page = new AccessoriesPage(driver);
		String expProduct = accesories_Page.getProductName().getText();
		accesories_Page.getProductName().click();
						
		//Validate Whether the TCP Page is displayed or not		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. TCP");
		Reporter.log("TCP page is Displayed", true);
		
		//Click on Add To Cart Button
		TCPProductPage tcp_ProductPage = new TCPProductPage(driver);
		tcp_ProductPage.getAddToCart().click();
		Thread.sleep(2000);
		tcp_ProductPage.getAddToWishList().click();
				
		//Click on ShoppingCart link
		home_Page.getShoppingCartLink().click();
						
		//Validate ShoppingCart Page is Displayed or not
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Shopping Cart");
		Reporter.log("Shopping Cart Page is displayed" , true);
						
		//Validate to Added products
		ShoppingCartPage shoppingCart_Page = new ShoppingCartPage(driver);
		String actProductName = shoppingCart_Page.getTCPProductName().getText();
							
		//Validate the product is in shopping cart or not	
		Assert.assertEquals(expProduct, actProductName);
		Reporter.log("Product Is Displayed in Shopping Cart Page" , true);
		
		//Removing the products from Shopping Cart
		shoppingCart_Page.getSingleCheckBox().click();
				
		//Clicking on UpdatingShopping Cart and Remove the product to the Shopping Cart
		shoppingCart_Page.getUpdateShoppingCart().click();		
				
		//Click on WishList button
		home_Page.getWishListLink().click();
				
		//Validate WishList Page is Displayed or not	
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Wishlist");
		Reporter.log("Wishlist page is Displayed" , true);
				
		//Click On TCP product
		WishListPage wishList_Page = new WishListPage(driver);
		String actTcpProductName = wishList_Page.getTCPProductName().getText();
				
		//Validate the product is in shopping cart or not
		Assert.assertEquals(expProduct, actTcpProductName);
		Reporter.log("Product Is Displayed in WishList", true);
				
		//Removing the products from WishList
		wishList_Page.getSinglecheckBox().click();
				
		//Click On Update WishList and Remove the product to the WishList
		wishList_Page.getUpdateWishlist().click();
		
	}

}
