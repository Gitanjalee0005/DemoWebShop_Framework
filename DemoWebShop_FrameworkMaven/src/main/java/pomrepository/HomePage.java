package pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath = "//a[@class='ico-register']")
	private WebElement registerLink;
	
	@FindBy(xpath = "//a[text() = 'Log in']")
	private WebElement logInLink;
	
	@FindBy(xpath = "//a[text() ='Log out']")
	private WebElement LogoutLink;
	
	@FindBy(xpath = "//span[text() = 'Shopping cart']")
	private WebElement shoppingCartLink;
	
	@FindBy(xpath = "//span[text() = 'Wishlist']")
	private WebElement wishListLink;
	
	@FindBy(xpath = "//input[@id='small-searchterms']")
	private WebElement searchTextField;
	
	@FindBy(xpath = "//input[@value='Search']")
	private WebElement searchButton;
	
	@FindBy(xpath = "//ul[@class='top-menu']//a[contains(text(), 'Books')]")
	private WebElement BOOKSLink;
	
	@FindBy(xpath = "//ul[@class='top-menu']//a[contains(text(), 'Computers')]")
	private WebElement COMPUTERSLink;
	
	@FindBy(xpath = "//ul[@class='top-menu']//a[contains(text(), 'Electronics')]")
	private WebElement ELECTRONICSLink;
	
	@FindBy(xpath = "//ul[@class='top-menu']//a[contains(text(), 'Apparel & Shoes')]")
	private WebElement ApparelShoesLink;
	
	@FindBy(xpath = "//ul[@class='top-menu']//a[contains(text(), 'Digital downloads')]")
	private WebElement digitalDownloadLink;
	
	@FindBy(xpath = "//ul[@class='top-menu']//a[contains(text(), 'Jewelry')]")
	private WebElement jewelryLink;
	
	@FindBy(xpath = "//ul[@class='top-menu']//a[contains(text(), 'Gift Cards')]")
	private WebElement giftCardsLink;
    
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getLogInLink() {
		return logInLink;
	}
	
	public WebElement getLogoutLink() {
		return LogoutLink;
	}


	public WebElement getShoppingCartLink() {
		return shoppingCartLink;
	}

	public WebElement getWishListLink() {
		return wishListLink;
	}

	public WebElement getSearchTextField() {
		return searchTextField;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getBOOKSLink() {
		return BOOKSLink;
	}

	public WebElement getCOMPUTERSLink() {
		return COMPUTERSLink;
	}

	public WebElement getELECTRONICSLink() {
		return ELECTRONICSLink;
	}

	public WebElement getApparelShoesLink() {
		return ApparelShoesLink;
	}

	public WebElement getDigitalDownloadLink() {
		return digitalDownloadLink;
	}

	public WebElement getJewelryLink() {
		return jewelryLink;
	}

	public WebElement getGiftCardsLink() {
		return giftCardsLink;
	}
}
