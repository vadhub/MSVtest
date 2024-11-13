package org.example.entity.paragraph.property;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root
public class keepLines {
    @Attribute(required = false)
    public String val;
}
