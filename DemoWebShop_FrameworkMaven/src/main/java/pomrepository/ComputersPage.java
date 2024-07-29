package pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputersPage {

	@FindBy(xpath="//h2[@class='title']//a[contains(text(),'Desktops')]")
	private WebElement Desktops;
	
	@FindBy(xpath = "//h2[@class='title']//a[contains(text(),'Notebooks')]")
	private WebElement Notebooks;
	
	@FindBy(xpath = "//h2[@class='title']//a[contains(text(),'Accessories')]")
	private WebElement Accessories;
	
	public ComputersPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getDesktops() {
		return Desktops;
	}

	public WebElement getNotebooks() {
		return Notebooks;
	}

	public WebElement getAccessories() {
		return Accessories;
	}
	
	
}
