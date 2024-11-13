package org.example.entity.table;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root
public class gridCol {
    @Attribute(required = false)
    public String w;
}
