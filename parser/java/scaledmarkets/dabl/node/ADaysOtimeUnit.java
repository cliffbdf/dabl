/* This file was generated by SableCC (http://www.sablecc.org/). */

package scaledmarkets.dabl.node;

import scaledmarkets.dabl.analysis.*;

@SuppressWarnings("nls")
public final class ADaysOtimeUnit extends POtimeUnit
{

    public ADaysOtimeUnit()
    {
        // Constructor
    }

    @Override
    public Object clone()
    {
        return new ADaysOtimeUnit();
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADaysOtimeUnit(this);
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
