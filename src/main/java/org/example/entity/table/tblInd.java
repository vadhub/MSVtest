package org.example.entity.table;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root
public class tblInd {
    @Attribute(required = false)
    public String type;
    @Attribute(required = false)
    public String w;
}
