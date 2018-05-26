/* This file was generated by SableCC (http://www.sablecc.org/). */

package scaledmarkets.dabl.node;

import scaledmarkets.dabl.analysis.*;

@SuppressWarnings("nls")
public final class TTrueKeyword extends Token
{
    public TTrueKeyword()
    {
        super.setText("true");
    }

    public TTrueKeyword(int line, int pos)
    {
        super.setText("true");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TTrueKeyword(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTTrueKeyword(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TTrueKeyword text.");
    }
}
