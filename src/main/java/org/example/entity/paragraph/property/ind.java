package org.example.entity.paragraph.property;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root
public class ind {
    @Attribute(required = false)
    public String hanging;
    @Attribute(required = false)
    public String left;
    @Attribute(required = false)
    public String right;

    @Override
    public String toString() {
        return "ind{" +
                "hanging='" + hanging + '\'' +
                ", left='" + left + '\'' +
                ", right='" + right + '\'' +
                '}';
    }
}
