package org.example.entity.paragraph.property;

import org.simpleframework.xml.Attribute;

public class pStyle {

    @Attribute(required = false)
    public String val;

    public pStyle(String val) {
        this.val = val;
    }

    public pStyle() {
    }

    @Override
    public String toString() {
        return "pStyle{" +
                "val='" + val + '\'' +
                '}';
    }
}
