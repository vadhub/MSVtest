package org.example.entity.table;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root
public class bottom {
    @Attribute(required = false)
    public String color;
    @Attribute(required = false)
    public String space;
    @Attribute(required = false)
    public String sz;
    @Attribute(required = false)
    public String val;
    @Attribute(required = false)
    public String type;
    @Attribute(required = false)
    public String w;

    @Override
    public String toString() {
        return "bottom{" +
                "color='" + color + '\'' +
                ", space='" + space + '\'' +
                ", sz='" + sz + '\'' +
                ", val='" + val + '\'' +
                '}';
    }
}
