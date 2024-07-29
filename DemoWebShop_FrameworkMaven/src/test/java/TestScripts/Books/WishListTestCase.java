package TestScripts.Books;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericlibrary.BaseTest;
import pomrepository.BooksPage;
import pomrepository.FictionEXProductPage;
import pomrepository.WishListPage;

public class WishListTestCase extends BaseTest{

	@Test(groups = "Smoke")
	public void verify_User_Is_Able_To_Add_Product_To_Wishlist() {
		
		home_Page.getBOOKSLink().click();
		
		//Validate Whether Books Page Is displayed or not
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Books");
		Reporter.log("Books Page Is Displayed" , true);
		
		BooksPage books_Page = new BooksPage(driver);
		String expProductName = books_Page.getFictionExProductName().getText();
		books_Page.getFictionExProductName().click();
		
		//Validate Whether Fiction EX Page Is displayed or not
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Fiction EX");
		Reporter.log("Fiction EX Page Is Displayed" , true);

		FictionEXProductPage product_page = new FictionEXProductPage(driver);
		product_page.getAddToWishlist().click();
		
		//Click on WishList link
		home_Page.getWishListLink().click();
		
		//Validate Whether WishList Page Is displayed or not
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Wishlist");
		Reporter.log("WishList Page Page Is Displayed" , true);
		
		driver.navigate().refresh();
		
		WishListPage wishList_Page = new WishListPage(driver);
		String actPoductName = wishList_Page.getFictionExProduct().getText();
		
		//Validation
		Assert.assertEquals(actPoductName, expProductName);
		Reporter.log("verify_User_Is_Able_To_Add_Product_To_Wishlist TestCase Pass" , true);
		
		//Click On CheckBox
		List<WebElement> allCheckBox = wishList_Page.getCheckBox();
		
		for(WebElement chechBox : allCheckBox ) {
			chechBox.click();
		}
		
		//Click On UpdateWishList Button
		wishList_Page.getUpdateWishlist().click();
	}
	
}
