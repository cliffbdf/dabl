/* This file was generated by SableCC (http://www.sablecc.org/). */

package scaledmarkets.dabl.node;

import scaledmarkets.dabl.analysis.*;

@SuppressWarnings("nls")
public final class ANamedOnamedArtifactSet extends POnamedArtifactSet
{
    private TId _id_;
    private POartifactSpec _oartifactSpec_;

    public ANamedOnamedArtifactSet()
    {
        // Constructor
    }

    public ANamedOnamedArtifactSet(
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") POartifactSpec _oartifactSpec_)
    {
        // Constructor
        setId(_id_);

        setOartifactSpec(_oartifactSpec_);

    }

    @Override
    public Object clone()
    {
        return new ANamedOnamedArtifactSet(
            cloneNode(this._id_),
            cloneNode(this._oartifactSpec_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANamedOnamedArtifactSet(this);
    }

    public TId getId()
    {
        return this._id_;
    }

    public void setId(TId node)
    {
        if(this._id_ != null)
        {
            this._id_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._id_ = node;
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
            + toString(this._id_)
            + toString(this._oartifactSpec_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._id_ == child)
        {
            this._id_ = null;
            return;
        }

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
        if(this._id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        if(this._oartifactSpec_ == oldChild)
        {
            setOartifactSpec((POartifactSpec) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
