package pomrepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishListPage {
	
	
	@FindBy(xpath = "//a[text()='Fiction EX']")
	private WebElement FictionExProduct;
	
	@FindBy(xpath = "//input[@name='removefromcart']")
	private List<WebElement> checkBox;
	
	@FindBy(xpath = "//input[@name='removefromcart']")
	private WebElement SinglecheckBox;
	
	@FindBy(xpath = "//td[@class='remove-from-cart']/input")
	private List<WebElement> WishCheckBox;
	
	@FindBy(xpath = "//input[@name='updatecart']")
	private WebElement UpdateWishlist;
	
	@FindBy(xpath = "//a[text()='TCP Instructor Led Training']")
	private WebElement TCPProductName;
	
	public WishListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	public WebElement getFictionExProduct() {
		return FictionExProduct;
	}


	public List<WebElement> getCheckBox() {
		return checkBox;
	}
	
	public WebElement getSinglecheckBox() {
		return SinglecheckBox;
	}
	
	public List<WebElement> getWishCheckBox() {
		return WishCheckBox;
	}

	public WebElement getUpdateWishlist() {
		return UpdateWishlist;
	}


	public WebElement getTCPProductName() {
		return TCPProductName;
	}
}
