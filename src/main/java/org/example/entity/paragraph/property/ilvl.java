package org.example.entity.paragraph.property;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root
public class ilvl {
    @Attribute(required = false)
    public String val;

    @Override
    public String toString() {
        return "ilvl{" +
                "val='" + val + '\'' +
                '}';
    }
}
