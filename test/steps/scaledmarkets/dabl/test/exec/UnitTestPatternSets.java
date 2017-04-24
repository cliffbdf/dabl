package scaledmarkets.dabl.test.exec;

import cucumber.api.Format;
import cucumber.api.java.Before;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import scaledmarkets.dabl.analysis.*;
import scaledmarkets.dabl.exec.*;
import scaledmarkets.dabl.repos.DummyProvider;
import scaledmarkets.dabl.node.*;
import scaledmarkets.dabl.test.TestBase;

import scaledmarkets.dabl.exec.PatternSets;

public class UnitTestPatternSets extends TestBase {

	
	
	// Scenario: Basic
	
	@Given("^$")
	public void () throws Exception {
		
	}
	
	@When("^$")
	public void () throws Exception {
		
		PatternSets patternSets = ....
		
		
		patternSets.operateOnFiles(....File patternRoot, ....File curDir, new PatternSets.FileOperator {
			void op(File root, String pathRelativeToRoot) throws Exception {
				....
			}
		});
	}
	
	@Then("^$")
	public void () throws Exception {
		
	}
	
	
	
	
	
}
