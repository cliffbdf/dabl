/* This file was generated by SableCC (http://www.sablecc.org/). */

package scaledmarkets.dabl.node;

import scaledmarkets.dabl.analysis.*;

@SuppressWarnings("nls")
public final class ANegativeOsign extends POsign
{

    public ANegativeOsign()
    {
        // Constructor
    }

    @Override
    public Object clone()
    {
        return new ANegativeOsign();
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANegativeOsign(this);
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
