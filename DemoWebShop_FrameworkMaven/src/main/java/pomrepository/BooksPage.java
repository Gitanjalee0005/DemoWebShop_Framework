package pomrepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BooksPage {
	
	@FindBy(xpath = "//div[@class='product-sorting']/select[@id='products-orderby']/option")
	private List<WebElement> Sortby;
	
	@FindBy(xpath = "//select[@id='products-pagesize']/option")
	private List<WebElement> Display;
	
	@FindBy(xpath = "//h2[@class='product-title']/a")
	private List<WebElement> Books;
	
	@FindBy(xpath = "//a[text()='Fiction EX']")
	private WebElement FictionExProductName;
	
	public BooksPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public List<WebElement> getSortby() {
		return Sortby;
	}

	public List<WebElement> getDisplay() {
		return Display;
	}

	public List<WebElement> getBooks() {
		return Books;
	}

	public WebElement getFictionExProductName() {
		return FictionExProductName;
	}
	
}
