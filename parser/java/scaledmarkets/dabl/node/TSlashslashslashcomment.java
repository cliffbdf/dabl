/* This file was generated by SableCC (http://www.sablecc.org/). */

package scaledmarkets.dabl.node;

import scaledmarkets.dabl.analysis.*;

@SuppressWarnings("nls")
public final class TSlashslashslashcomment extends Token
{
    public TSlashslashslashcomment(String text)
    {
        setText(text);
    }

    public TSlashslashslashcomment(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TSlashslashslashcomment(getText(), getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTSlashslashslashcomment(this);
    }
}
