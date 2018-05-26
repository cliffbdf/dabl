/* This file was generated by SableCC (http://www.sablecc.org/). */

package scaledmarkets.dabl.node;

import scaledmarkets.dabl.analysis.*;

@SuppressWarnings("nls")
public final class ATranslationOnamespaceElt extends POnamespaceElt
{
    private POtranslationDeclaration _otranslationDeclaration_;

    public ATranslationOnamespaceElt()
    {
        // Constructor
    }

    public ATranslationOnamespaceElt(
        @SuppressWarnings("hiding") POtranslationDeclaration _otranslationDeclaration_)
    {
        // Constructor
        setOtranslationDeclaration(_otranslationDeclaration_);

    }

    @Override
    public Object clone()
    {
        return new ATranslationOnamespaceElt(
            cloneNode(this._otranslationDeclaration_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATranslationOnamespaceElt(this);
    }

    public POtranslationDeclaration getOtranslationDeclaration()
    {
        return this._otranslationDeclaration_;
    }

    public void setOtranslationDeclaration(POtranslationDeclaration node)
    {
        if(this._otranslationDeclaration_ != null)
        {
            this._otranslationDeclaration_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._otranslationDeclaration_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._otranslationDeclaration_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._otranslationDeclaration_ == child)
        {
            this._otranslationDeclaration_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._otranslationDeclaration_ == oldChild)
        {
            setOtranslationDeclaration((POtranslationDeclaration) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
