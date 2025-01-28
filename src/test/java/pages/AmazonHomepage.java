package pages;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

@DefaultUrl("https://www.amazon.in/")
public class AmazonHomepage extends PageObject {

	public AmazonHomepage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "twotabsearchtextbox")
	WebElementFacade searchtextbox;

	@FindBy(xpath = "(//span[@data-component-type='s-product-image'])[1]")
	WebElementFacade firstProductOfResult;

	@FindBy(id = "add-to-cart-button")
	WebElementFacade addtoCartBtn;

	@FindBy(id = "nav-cart-count-container")
	WebElementFacade cartIcon;

	@FindBy(xpath = "//div[@class='sc-item-content-group']/descendant::h4")
	WebElementFacade productNameFromCart;

	@FindBy(id = "productTitle")
	WebElementFacade productTitle;

	public WebElementFacade getSearchtextbox() {
		return searchtextbox;
	}

	public WebElementFacade getFirstProductOfResult() {
		return firstProductOfResult;
	}

	public String getProductNameFromCart() {
		return productNameFromCart.getText();
	}

	public String getProductTitle() {
		return productTitle.getText();
	}

	public WebElementFacade getAddtoCartBtn() {
		return addtoCartBtn;
	}

	public WebElementFacade getCartIcon() {
		return cartIcon;
	}
}
