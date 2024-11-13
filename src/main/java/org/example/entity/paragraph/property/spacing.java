package org.example.entity.paragraph.property;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root
public class spacing {
    @Attribute(required = false)
    public String after;
    @Attribute(required = false)
    public String before;
    @Attribute(required = false)
    public String line;
    @Attribute(required = false)
    public String lineRule;
}
