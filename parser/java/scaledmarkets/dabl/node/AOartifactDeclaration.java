/* This file was generated by SableCC (http://www.sablecc.org/). */

package scaledmarkets.dabl.node;

import java.util.*;
import scaledmarkets.dabl.analysis.*;

@SuppressWarnings("nls")
public final class AOartifactDeclaration extends POartifactDeclaration
{
    private TId _id_;
    private TWholeNumber _major_;
    private TWholeNumber _minor_;
    private final LinkedList<POcompatibilitySpec> _ocompatibilitySpec_ = new LinkedList<POcompatibilitySpec>();

    public AOartifactDeclaration()
    {
        // Constructor
    }

    public AOartifactDeclaration(
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") TWholeNumber _major_,
        @SuppressWarnings("hiding") TWholeNumber _minor_,
        @SuppressWarnings("hiding") List<?> _ocompatibilitySpec_)
    {
        // Constructor
        setId(_id_);

        setMajor(_major_);

        setMinor(_minor_);

        setOcompatibilitySpec(_ocompatibilitySpec_);

    }

    @Override
    public Object clone()
    {
        return new AOartifactDeclaration(
            cloneNode(this._id_),
            cloneNode(this._major_),
            cloneNode(this._minor_),
            cloneList(this._ocompatibilitySpec_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAOartifactDeclaration(this);
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

    public TWholeNumber getMajor()
    {
        return this._major_;
    }

    public void setMajor(TWholeNumber node)
    {
        if(this._major_ != null)
        {
            this._major_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._major_ = node;
    }

    public TWholeNumber getMinor()
    {
        return this._minor_;
    }

    public void setMinor(TWholeNumber node)
    {
        if(this._minor_ != null)
        {
            this._minor_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._minor_ = node;
    }

    public LinkedList<POcompatibilitySpec> getOcompatibilitySpec()
    {
        return this._ocompatibilitySpec_;
    }

    public void setOcompatibilitySpec(List<?> list)
    {
        for(POcompatibilitySpec e : this._ocompatibilitySpec_)
        {
            e.parent(null);
        }
        this._ocompatibilitySpec_.clear();

        for(Object obj_e : list)
        {
            POcompatibilitySpec e = (POcompatibilitySpec) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._ocompatibilitySpec_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._id_)
            + toString(this._major_)
            + toString(this._minor_)
            + toString(this._ocompatibilitySpec_);
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

        if(this._major_ == child)
        {
            this._major_ = null;
            return;
        }

        if(this._minor_ == child)
        {
            this._minor_ = null;
            return;
        }

        if(this._ocompatibilitySpec_.remove(child))
        {
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

        if(this._major_ == oldChild)
        {
            setMajor((TWholeNumber) newChild);
            return;
        }

        if(this._minor_ == oldChild)
        {
            setMinor((TWholeNumber) newChild);
            return;
        }

        for(ListIterator<POcompatibilitySpec> i = this._ocompatibilitySpec_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((POcompatibilitySpec) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}
