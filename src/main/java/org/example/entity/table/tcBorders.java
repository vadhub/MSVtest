package org.example.entity.table;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root
public class tcBorders {

    @Element
    public top top;
    @Element
    public left left;
    @Element
    public bottom bottom;
    @Element
    public right right;

    @Override
    public String toString() {
        return "tcBorders{" +
                "top=" + top +
                ", left=" + left +
                ", bottom=" + bottom +
                ", right=" + right +
                '}';
    }
}
