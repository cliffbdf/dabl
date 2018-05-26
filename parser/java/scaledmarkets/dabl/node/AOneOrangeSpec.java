/* This file was generated by SableCC (http://www.sablecc.org/). */

package scaledmarkets.dabl.node;

import scaledmarkets.dabl.analysis.*;

@SuppressWarnings("nls")
public final class AOneOrangeSpec extends POrangeSpec
{
    private TWholeNumber _wholeNumber_;

    public AOneOrangeSpec()
    {
        // Constructor
    }

    public AOneOrangeSpec(
        @SuppressWarnings("hiding") TWholeNumber _wholeNumber_)
    {
        // Constructor
        setWholeNumber(_wholeNumber_);

    }

    @Override
    public Object clone()
    {
        return new AOneOrangeSpec(
            cloneNode(this._wholeNumber_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAOneOrangeSpec(this);
    }

    public TWholeNumber getWholeNumber()
    {
        return this._wholeNumber_;
    }

    public void setWholeNumber(TWholeNumber node)
    {
        if(this._wholeNumber_ != null)
        {
            this._wholeNumber_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._wholeNumber_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._wholeNumber_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._wholeNumber_ == child)
        {
            this._wholeNumber_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._wholeNumber_ == oldChild)
        {
            setWholeNumber((TWholeNumber) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
