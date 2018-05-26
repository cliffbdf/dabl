/* This file was generated by SableCC (http://www.sablecc.org/). */

package scaledmarkets.dabl.node;

import scaledmarkets.dabl.analysis.*;

@SuppressWarnings("nls")
public final class ATypographicOnamespaceElt extends POnamespaceElt
{
    private POtypographicDeclaration _otypographicDeclaration_;

    public ATypographicOnamespaceElt()
    {
        // Constructor
    }

    public ATypographicOnamespaceElt(
        @SuppressWarnings("hiding") POtypographicDeclaration _otypographicDeclaration_)
    {
        // Constructor
        setOtypographicDeclaration(_otypographicDeclaration_);

    }

    @Override
    public Object clone()
    {
        return new ATypographicOnamespaceElt(
            cloneNode(this._otypographicDeclaration_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATypographicOnamespaceElt(this);
    }

    public POtypographicDeclaration getOtypographicDeclaration()
    {
        return this._otypographicDeclaration_;
    }

    public void setOtypographicDeclaration(POtypographicDeclaration node)
    {
        if(this._otypographicDeclaration_ != null)
        {
            this._otypographicDeclaration_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._otypographicDeclaration_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._otypographicDeclaration_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._otypographicDeclaration_ == child)
        {
            this._otypographicDeclaration_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._otypographicDeclaration_ == oldChild)
        {
            setOtypographicDeclaration((POtypographicDeclaration) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
