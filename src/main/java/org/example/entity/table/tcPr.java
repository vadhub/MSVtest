package org.example.entity.table;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root
public class tcPr {

    @Element
    public tcW tcW;

    @Element
    public tcBorders tcBorders;

    @Element
    public shd shd;

    @Override
    public String toString() {
        return "tcPr{" +
                "tcW=" + tcW +
                ", tcBorders=" + tcBorders +
                ", shd=" + shd +
                '}';
    }
}
