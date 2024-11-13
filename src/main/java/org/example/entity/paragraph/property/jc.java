package org.example.entity.paragraph.property;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root
public class jc {

    @Attribute(required = false)
    public String val;

    public jc(String val) {
        this.val = val;
    }

    public jc() {
    }
}
