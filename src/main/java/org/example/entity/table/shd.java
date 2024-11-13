package org.example.entity.table;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root
public class shd {
    @Attribute(required = false)
    public String fill;

    @Attribute(required = false)
    public String val;

    @Override
    public String toString() {
        return "shd{" +
                "fill='" + fill + '\'' +
                ", val='" + val + '\'' +
                '}';
    }
}
