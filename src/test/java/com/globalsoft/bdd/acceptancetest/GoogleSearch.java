package com.globalsoft.bdd.acceptancetest;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;



@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/google/search/googleSearch.feature")
public class GoogleSearch  {

}
