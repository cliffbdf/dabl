/* This file was generated by SableCC (http://www.sablecc.org/). */

package scaledmarkets.dabl.node;

import scaledmarkets.dabl.analysis.*;

@SuppressWarnings("nls")
public final class ANeObinaryOp extends PObinaryOp
{

    public ANeObinaryOp()
    {
        // Constructor
    }

    @Override
    public Object clone()
    {
        return new ANeObinaryOp();
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANeObinaryOp(this);
    }

    @Override
    public String toString()
    {
        return "";
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        throw new RuntimeException("Not a child.");
    }
}
