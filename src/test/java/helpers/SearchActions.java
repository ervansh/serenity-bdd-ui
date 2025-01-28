package helpers;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractions;

public class SearchActions extends UIInteractions {

	@Step("Input keyword and press enter")
	public void searchKeywordPressEnter(WebElementFacade webelement, String keyword) {
		webelement.typeAndEnter(keyword);
	}

	@Step("Do not enter keyword and press enter")
	public void pressEnterWithoutEnteringKeyword(WebElementFacade webelement) {
		webelement.typeAndEnter("");
	}
}
