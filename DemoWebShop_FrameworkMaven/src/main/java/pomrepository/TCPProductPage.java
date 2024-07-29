package pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TCPProductPage {

	@FindBy(xpath = "//h1[contains(text(),'TCP Instructor Led Training')]")
	private WebElement ProductName;
	
	@FindBy(xpath ="//input[@id='add-to-cart-button-66']")
	private WebElement AddToCart;
	
	@FindBy(xpath = "//input[@id='add-to-wishlist-button-66']")
	private WebElement AddToWishList;
	
	public TCPProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getProductName() {
		return ProductName;
	}

	public WebElement getAddToCart() {
		return AddToCart;
	}

	public WebElement getAddToWishList() {
		return AddToWishList;
	}
	
	
}
