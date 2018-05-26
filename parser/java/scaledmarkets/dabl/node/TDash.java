/* This file was generated by SableCC (http://www.sablecc.org/). */

package scaledmarkets.dabl.node;

import scaledmarkets.dabl.analysis.*;

@SuppressWarnings("nls")
public final class TDash extends Token
{
    public TDash()
    {
        super.setText("-");
    }

    public TDash(int line, int pos)
    {
        super.setText("-");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TDash(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTDash(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TDash text.");
    }
}
