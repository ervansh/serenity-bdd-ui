package helpers;

import java.util.Set;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;
import pages.AmazonHomepage;
import pages.Homepage;

public class NavigateActions extends UIInteractions {

	Homepage homepage;
	AmazonHomepage amazonhomepage;

	@Step("Navigate to the home page")
	public void toTheDuckDuckgo() {
		homepage.open();
	}

	@Step("Navigate to the child window page")
	public void navigateToFirstChildWindow() {
		Set<String> wins = getDriver().getWindowHandles();
		wins.forEach(e -> getDriver().switchTo().window(e));
	}
	
	@Step("Navigate to Cart.")
	public void navigateToCart() {
		amazonhomepage.clickOn(amazonhomepage.getCartIcon());
	}
}