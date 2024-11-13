package org.example.entity.paragraph.property;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root
public class numPr {

    @Element(required = false)
    public ilvl ilvl;

    @Element(required = false)
    public numId numId;

    @Override
    public String toString() {
        return "numPr{" +
                "ilvl=" + ilvl +
                ", numId=" + numId +
                '}';
    }
}
