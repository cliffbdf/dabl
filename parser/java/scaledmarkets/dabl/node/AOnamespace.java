/* This file was generated by SableCC (http://www.sablecc.org/). */

package scaledmarkets.dabl.node;

import java.util.*;
import scaledmarkets.dabl.analysis.*;

@SuppressWarnings("nls")
public final class AOnamespace extends POnamespace
{
    private final LinkedList<TId> _path_ = new LinkedList<TId>();
    private final LinkedList<POnamespaceElt> _onamespaceElt_ = new LinkedList<POnamespaceElt>();

    public AOnamespace()
    {
        // Constructor
    }

    public AOnamespace(
        @SuppressWarnings("hiding") List<?> _path_,
        @SuppressWarnings("hiding") List<?> _onamespaceElt_)
    {
        // Constructor
        setPath(_path_);

        setOnamespaceElt(_onamespaceElt_);

    }

    @Override
    public Object clone()
    {
        return new AOnamespace(
            cloneList(this._path_),
            cloneList(this._onamespaceElt_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAOnamespace(this);
    }

    public LinkedList<TId> getPath()
    {
        return this._path_;
    }

    public void setPath(List<?> list)
    {
        for(TId e : this._path_)
        {
            e.parent(null);
        }
        this._path_.clear();

        for(Object obj_e : list)
        {
            TId e = (TId) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._path_.add(e);
        }
    }

    public LinkedList<POnamespaceElt> getOnamespaceElt()
    {
        return this._onamespaceElt_;
    }

    public void setOnamespaceElt(List<?> list)
    {
        for(POnamespaceElt e : this._onamespaceElt_)
        {
            e.parent(null);
        }
        this._onamespaceElt_.clear();

        for(Object obj_e : list)
        {
            POnamespaceElt e = (POnamespaceElt) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._onamespaceElt_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._path_)
            + toString(this._onamespaceElt_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._path_.remove(child))
        {
            return;
        }

        if(this._onamespaceElt_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        for(ListIterator<TId> i = this._path_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((TId) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        for(ListIterator<POnamespaceElt> i = this._onamespaceElt_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((POnamespaceElt) newChild);
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
