package pomrepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DigitalDownloadPage {

		@FindBy(xpath = "//input[@value='Add to cart']")
		private List<WebElement> addToCartButton;
		
		public DigitalDownloadPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		public List<WebElement> getAddToCartButton() {
			return addToCartButton;
		}
		


}
