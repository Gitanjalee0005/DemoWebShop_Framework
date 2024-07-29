package pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	
	@FindBy(xpath = "//a[text()='Blue Jeans']")
	private WebElement Jeans;
	
	@FindBy(xpath = "//input[@value='Add to cart']")
	private WebElement AddToCart;
	
	public SearchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getJeans() {
		return Jeans;
	}

	public WebElement getAddToCart() {
		return AddToCart;
	}
}
