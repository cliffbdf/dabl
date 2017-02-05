package scaledmarkets.dabl.main;

import scaledmarkets.dabl.node.*;
import scaledmarkets.dabl.analysis.*;
import java.util.Hashtable;
import java.util.List;
import java.util.LinkedList;
import java.net.URLClassLoader;

public class CompilerState
{
	/**
	 * Root of the AST.
	 */
	public Start ast;
	
	/**
	 * Scope in which the namespace is defined.
	 */
	public NameScope globalScope;
	
	/**
	 * A stack of NameScopes that is maintained during the Analysis phase.
	 * If Analysis completes without error, there will only be one NameScope
	 * in the stack: the global scope.
	 */
	public List<NameScope> scopeStack = new LinkedList<NameScope>();
	
	/**
	 * AST Node attributes that are set on entry to the Node type's analysis
	 * method.
	 */
	public Hashtable<Node,Object> in = new Hashtable<Node, Object>();
	
	/**
	 * AST Node attributes that are set on exit from the Node type's analysis
	 * method.
	 */
	public Hashtable<Node,Object> out = new Hashtable<Node, Object>();

	public CompilerState()
	{
	}
	
	void setGlobalScope(NameScope scope) { this.globalScope = scope; }

    public Object getIn(Node node) { return in.get(node); }
    
    public Object getOut(Node node) { return out.get(node); }
}
