package org.example.entity.table;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root
public class trHeight {

    @Attribute(required = false)
    public String hRule;

    @Attribute(required = false)
    public String val;

    @Override
    public String toString() {
        return "tcW{" +
                "hRule='" + hRule + '\'' +
                ", val='" + val + '\'' +
                '}';
    }
}
