package scaledmarkets.dabl.main;

import scaledmarkets.dabl.analysis.*;
import scaledmarkets.dabl.lexer.*;
import scaledmarkets.dabl.node.*;
import scaledmarkets.dabl.parser.*;

import java.util.List;
import java.util.LinkedList;
import java.util.Map;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Enumeration;
import java.net.URLClassLoader;
import java.net.URL;
import java.net.MalformedURLException;
import java.util.jar.JarFile;
import java.util.jar.JarEntry;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Modifier;
import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;

/** Perform symbol resolution and annotation. */
public class LanguageAnalyzer extends DablBaseAdapter
{
	public LanguageAnalyzer(CompilerState state) {
		super(state);
		
		state.setGlobalScope(pushNameScope(new NameScope("Global", null, null)));
		assertThat(state.scopeStack.size() == 1);   // debug
	}
	
	/*
		Only onamespace and otask_declaration define name scopes.
	 */
	
	public void inAOnamespace(AOnamespace node) {
		LinkedList<TId> path = node.getPath();
		String name = createNameFromPath(path);
		
		NameScope enclosingScope = getCurrentNameScope();
		NameScope newScope = new NameScope(name, node, enclosingScope);
		SymbolEntry entry = new NameScopeEntry(newScope, name, enclosingScope);
		try { enclosingScope.addEntry(name, entry); } catch (Exception ex) {
			throw new RuntimeException(ex);
		}
		pushNameScope(newScope);
	}
	
	public void outAOnamespace(AOnamespace node) {
		popNameScope();
	}
	
	public void inAImportOnamespaceElt(AImportOnamespaceElt node) {
		
		LinkedList<TId> importedNamespacePath = node.getId();
		
		//....
		
		
		//state.globalScope.getSymbolTable().appendTable(....);
	}
	
	public void inAOtaskDeclaration(AOtaskDeclaration node) {
		
		String name = node.getName().getText();
		NameScope enclosingScope = getCurrentNameScope();
		NameScope newScope = new NameScope(name, node, enclosingScope);
		SymbolEntry entry = new NameScopeEntry(newScope, name, enclosingScope);
		try { enclosingScope.addEntry(name, entry); } catch (Exception ex) {
			throw new RuntimeException(ex);
		}
		pushNameScope(newScope);
	}
	
	public void outAOtaskDeclaration(AOtaskDeclaration node) {
		popNameScope();
	}
	
	String createNameFromPath(LinkedList<TId> path) {
		String name = "";
		boolean firstTime = true;
		for (TId id : path) {
			if (firstTime) firstTime = false;
			else name = name + ".";
			name = name + id.getText();
		}
		return name;
	}
}
