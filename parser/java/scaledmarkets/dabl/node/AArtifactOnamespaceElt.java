/* This file was generated by SableCC (http://www.sablecc.org/). */

package scaledmarkets.dabl.node;

import scaledmarkets.dabl.analysis.*;

@SuppressWarnings("nls")
public final class AArtifactOnamespaceElt extends POnamespaceElt
{
    private POartifactDeclaration _oartifactDeclaration_;

    public AArtifactOnamespaceElt()
    {
        // Constructor
    }

    public AArtifactOnamespaceElt(
        @SuppressWarnings("hiding") POartifactDeclaration _oartifactDeclaration_)
    {
        // Constructor
        setOartifactDeclaration(_oartifactDeclaration_);

    }

    @Override
    public Object clone()
    {
        return new AArtifactOnamespaceElt(
            cloneNode(this._oartifactDeclaration_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAArtifactOnamespaceElt(this);
    }

    public POartifactDeclaration getOartifactDeclaration()
    {
        return this._oartifactDeclaration_;
    }

    public void setOartifactDeclaration(POartifactDeclaration node)
    {
        if(this._oartifactDeclaration_ != null)
        {
            this._oartifactDeclaration_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._oartifactDeclaration_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._oartifactDeclaration_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._oartifactDeclaration_ == child)
        {
            this._oartifactDeclaration_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._oartifactDeclaration_ == oldChild)
        {
            setOartifactDeclaration((POartifactDeclaration) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
