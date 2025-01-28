package pages;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

@DefaultUrl("https://duckduckgo.com/")
public class Homepage extends PageObject {

	public Homepage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//h2[text()='Switch to DuckDuckGo. It’s private and free!']")
	WebElementFacade heading;

	@FindBy(name = "q")
	WebElementFacade searchfield;

	public WebElementFacade getHeading() {
		return heading;
	}

	public WebElementFacade getSearchfield() {
		return searchfield;
	}

	public boolean isHeadingVisible() {
		if (heading.isVisible()) {
			return true;
		}
		return false;
	}
	
}
