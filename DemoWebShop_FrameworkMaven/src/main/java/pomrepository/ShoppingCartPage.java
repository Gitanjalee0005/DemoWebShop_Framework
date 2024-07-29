package pomrepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
	
	@FindBy(xpath = "//a[@class='product-name']")
	private List<WebElement> AllProductName;
	
	@FindBy(xpath = "//input[@name='removefromcart']")
	private List<WebElement> CheckBox;

	@FindBy(xpath = "//input[@name='removefromcart']")
	private WebElement SingleCheckBox;
	
	@FindBy(xpath = "//input[@name='updatecart']")
	private WebElement UpdateShoppingCart;
	
	@FindBy(xpath= "//td[@class='product']//a[text()= 'TCP Instructor Led Training']")
	private WebElement TCPProductName; 
	
	@FindBy(xpath = "//td[@class='product']//a[text()='Blue Jeans']")
	private WebElement BlueJeans;
	
	@FindBy(xpath = "//a[text()='Blue Jeans' and @class='product-name']/../..//input[contains(@class,'qty-input')]")
	private WebElement QtyTextField;
	
	@FindBy(xpath= "//td[@class='subtotal nobr end']//span[@class='product-subtotal']")
	private WebElement Total;
	
	@FindBy(xpath = "//td[@class='unit-price nobr']//span[@class='product-unit-price']")
	private WebElement price;
	
	public ShoppingCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public List<WebElement> getAllProductName() {
		return AllProductName;
	}

	public List<WebElement> getCheckBox() {
		return CheckBox;
	}

	public WebElement getUpdateShoppingCart() {
		return UpdateShoppingCart;
	}

	public WebElement getTCPProductName() {
		return TCPProductName;
	}

	public WebElement getSingleCheckBox() {
		return SingleCheckBox;
	}

	public WebElement getBlueJeans() {
		return BlueJeans;
	}

	public WebElement getQtyTextField() {
		return QtyTextField;
	}

	public WebElement getTotal() {
		return Total;
	}

	public WebElement getPrice() {
		return price;
	}
}
