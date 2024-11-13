package org.example.entity.table;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root
public class tblCellMar {

    @Element
    public top top;
    @Element
    public left left;
    @Element
    public bottom bottom;
    @Element
    public right right;
}
