package com.globalsoft.bdd.acceptancetest.steps;


import com.globalsoft.bdd.pages.SearchPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.steps.ScenarioSteps;

public class SearchSteps extends ScenarioSteps{

	private SearchPage searchPage;
	
	//public SearchSteps(final Pages pages) throws ClassNotFoundException{
		//super(pages);
		//searchPage = getPages().get(SearchPage.class);
	//}
	
	@Given("landed on Google Search page")
	public void landedOnGoogleSearchPage() {
		searchPage.open();
	}
	
	@When("typing >'(.*)'")
	public void typingSearchContent(final String searchContent) {
		//searchPage.clickingButtonNoThanks();
		searchPage.typingTextBoxSearch(searchContent);
	}
	
	@When("clicking the search button")
	public void clickingTheSearchButton() {
		searchPage.clickingButtonSearch();
	}
	
}
