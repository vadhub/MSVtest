package org.example.entity.paragraph;

import org.example.entity.Content;
import org.example.entity.paragraph.property.hyperlink;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

@Root
public class p implements Content {

    @Element(required = false)
    public pPr pPr;
    @Element(required = false)
    public hyperlink hyperlink;

    @ElementList(name = "r", inline = true, required = false)
    public List<r> r;

    public p(org.example.entity.paragraph.pPr pPr, org.example.entity.paragraph.property.hyperlink hyperlink, List<org.example.entity.paragraph.r> r) {
        this.pPr = pPr;
        this.hyperlink = hyperlink;
        this.r = r;
    }

    public p() {
    }

    @Override
    public String toString() {
        return "p{" +
                "pPr=" + pPr +
                ", hyperlink=" + hyperlink +
                ", r=" + r +
                '}';
    }
}
