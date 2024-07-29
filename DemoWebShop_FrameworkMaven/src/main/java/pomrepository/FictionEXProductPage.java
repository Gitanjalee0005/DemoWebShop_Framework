package pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FictionEXProductPage {
	
	@FindBy(xpath = "//div[@class='product-name']/h1")
	private WebElement Name;
	
	@FindBy(id= "add-to-wishlist-button-78")
	private WebElement AddToWishlist;

	public FictionEXProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getName() {
		return Name;
	}

	public WebElement getAddToWishlist() {
		return AddToWishlist;
	}
	
	
	
}
