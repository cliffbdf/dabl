/* This file was generated by SableCC (http://www.sablecc.org/). */

package scaledmarkets.dabl.node;

import scaledmarkets.dabl.analysis.*;

@SuppressWarnings("nls")
public final class TSucceeded extends Token
{
    public TSucceeded()
    {
        super.setText("succeeded");
    }

    public TSucceeded(int line, int pos)
    {
        super.setText("succeeded");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TSucceeded(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTSucceeded(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TSucceeded text.");
    }
}
