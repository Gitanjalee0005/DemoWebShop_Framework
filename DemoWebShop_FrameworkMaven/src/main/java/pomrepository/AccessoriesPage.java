package pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccessoriesPage {
	
	@FindBy(xpath ="//a[text() = 'TCP Instructor Led Training']")
	private WebElement ProductName;
	
	@FindBy(xpath = "//input[@value='Add to cart']")
	private WebElement AddToCartButton;
	
	public AccessoriesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getProductName() {
		return ProductName;
	}

	public WebElement getAddToCartButton() {
		return AddToCartButton;
	}

	
}
