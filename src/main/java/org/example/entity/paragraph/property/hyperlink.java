package org.example.entity.paragraph.property;

import org.example.entity.paragraph.r;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root
public class hyperlink {
    @Attribute(required = false)
    public String id;
    @Element(required = false)
    public org.example.entity.paragraph.r r;

    @Override
    public String toString() {
        return "hyperlink{" +
                "id='" + id + '\'' +
                ", r=" + r +
                '}';
    }
}
