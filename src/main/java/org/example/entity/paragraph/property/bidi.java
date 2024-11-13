package org.example.entity.paragraph.property;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root
public class bidi {

    @Attribute(required = false)
    public String val;

    public bidi(String val) {
        this.val = val;
    }

    public bidi() {
    }
}
