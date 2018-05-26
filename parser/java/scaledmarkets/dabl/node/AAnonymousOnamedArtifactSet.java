/* This file was generated by SableCC (http://www.sablecc.org/). */

package scaledmarkets.dabl.node;

import scaledmarkets.dabl.analysis.*;

@SuppressWarnings("nls")
public final class AAnonymousOnamedArtifactSet extends POnamedArtifactSet
{
    private POartifactSpec _oartifactSpec_;

    public AAnonymousOnamedArtifactSet()
    {
        // Constructor
    }

    public AAnonymousOnamedArtifactSet(
        @SuppressWarnings("hiding") POartifactSpec _oartifactSpec_)
    {
        // Constructor
        setOartifactSpec(_oartifactSpec_);

    }

    @Override
    public Object clone()
    {
        return new AAnonymousOnamedArtifactSet(
            cloneNode(this._oartifactSpec_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAnonymousOnamedArtifactSet(this);
    }

    public POartifactSpec getOartifactSpec()
    {
        return this._oartifactSpec_;
    }

    public void setOartifactSpec(POartifactSpec node)
    {
        if(this._oartifactSpec_ != null)
        {
            this._oartifactSpec_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._oartifactSpec_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._oartifactSpec_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._oartifactSpec_ == child)
        {
            this._oartifactSpec_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._oartifactSpec_ == oldChild)
        {
            setOartifactSpec((POartifactSpec) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
