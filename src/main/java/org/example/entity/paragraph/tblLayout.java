package org.example.entity.paragraph;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root
public class tblLayout {
    @Attribute(required = false)
    public String type;
}
