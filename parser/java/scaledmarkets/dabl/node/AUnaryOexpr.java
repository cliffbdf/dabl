/* This file was generated by SableCC (http://www.sablecc.org/). */

package scaledmarkets.dabl.node;

import scaledmarkets.dabl.analysis.*;

@SuppressWarnings("nls")
public final class AUnaryOexpr extends POexpr
{
    private POunaryOp _ounaryOp_;
    private POexpr _oexpr_;

    public AUnaryOexpr()
    {
        // Constructor
    }

    public AUnaryOexpr(
        @SuppressWarnings("hiding") POunaryOp _ounaryOp_,
        @SuppressWarnings("hiding") POexpr _oexpr_)
    {
        // Constructor
        setOunaryOp(_ounaryOp_);

        setOexpr(_oexpr_);

    }

    @Override
    public Object clone()
    {
        return new AUnaryOexpr(
            cloneNode(this._ounaryOp_),
            cloneNode(this._oexpr_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAUnaryOexpr(this);
    }

    public POunaryOp getOunaryOp()
    {
        return this._ounaryOp_;
    }

    public void setOunaryOp(POunaryOp node)
    {
        if(this._ounaryOp_ != null)
        {
            this._ounaryOp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._ounaryOp_ = node;
    }

    public POexpr getOexpr()
    {
        return this._oexpr_;
    }

    public void setOexpr(POexpr node)
    {
        if(this._oexpr_ != null)
        {
            this._oexpr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._oexpr_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._ounaryOp_)
            + toString(this._oexpr_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._ounaryOp_ == child)
        {
            this._ounaryOp_ = null;
            return;
        }

        if(this._oexpr_ == child)
        {
            this._oexpr_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._ounaryOp_ == oldChild)
        {
            setOunaryOp((POunaryOp) newChild);
            return;
        }

        if(this._oexpr_ == oldChild)
        {
            setOexpr((POexpr) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
