/* This file was generated by SableCC (http://www.sablecc.org/). */

package scaledmarkets.dabl.node;

import scaledmarkets.dabl.analysis.*;

@SuppressWarnings("nls")
public final class TPathKeyword extends Token
{
    public TPathKeyword()
    {
        super.setText("path");
    }

    public TPathKeyword(int line, int pos)
    {
        super.setText("path");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TPathKeyword(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTPathKeyword(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TPathKeyword text.");
    }
}
