package org.example.entity.table;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;
import org.example.entity.paragraph.p;

@Root
public class tc {
    @Element
    public tcPr tcPr;

    @Element
    public p p;

    @Override
    public String toString() {
        return "tc{" +
                "tcPr=" + tcPr +
                ", p=" + p +
                '}';
    }
}
