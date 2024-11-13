package org.example.entity.table;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root
public class trPr {

    @Element(required = false)
    public trHeight trHeight;

    @Override
    public String toString() {
        return "tcPr{" +
                "tcHeight=" + trHeight +
                '}';
    }
}
