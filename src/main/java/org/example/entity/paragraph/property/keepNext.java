package org.example.entity.paragraph.property;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root
public class keepNext {
    @Attribute(required = false)
    public String val;
}
