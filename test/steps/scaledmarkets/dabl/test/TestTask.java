package scaledmarkets.dabl.test;

import cucumber.api.Format;
import cucumber.api.java.Before;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import scaledmarkets.dabl.main.*;
import java.io.Reader;
import java.io.StringReader;
import scaledmarkets.dabl.node.*;
import java.util.List;
import java.util.LinkedList;

public class TestTask extends TestBase {
	
	CompilerState state;
	
	@When("^I compile a simple task$")
	public void i_compile_a_simple_task() throws Exception {
		
		Reader reader = new StringReader(
"namespace simple \n" +
"task t123\n" +
"  when true\n" +
"  inputs \"x\" from \"repo1\" in my_git\n" +
"  outputs \"y\" from \"repo2\" in my_git\n" +
"  abc = \"def\" true"
			);
		
		Dabl dabl = new Dabl(false, true, reader);
		this.state = dabl.process();
		assertThat(state.globalScope != null);
		System.out.println("scopeStack size: " + state.scopeStack.size());
		assertThat(state.scopeStack.size() == 1);
	}
	
	@Then("^I can retrieve the the task by its name$")
	public void i_can_retrieve_the_the_task_by_its_name() throws Exception {
		
		List<NameScope> scopeStack = this.state.scopeStack;
		SymbolEntry entry = this.state.scopeStack.get(0).getEntry("simple");
		assertThat(entry != null);
		assertThat(entry instanceof NameScopeEntry);
		
		// Get the namespace's symbol table.
		NameScopeEntry nse = (NameScopeEntry)entry;
		
		NameScope namespaceScope = nse.getOwnedScope();
		SymbolEntry taskEntry = namespaceScope.getEntry("t123");
		assertThat(taskEntry != null);
	}
}