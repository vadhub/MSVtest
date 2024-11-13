package org.example.entity.paragraph;

import org.example.entity.paragraph.property.keepLines;
import org.example.entity.paragraph.property.keepNext;
import org.example.entity.paragraph.property.widowControl;
import org.example.entity.paragraph.property.ind;
import org.example.entity.paragraph.property.spacing;
import org.example.entity.paragraph.property.jc;
import org.example.entity.paragraph.property.bidi;
import org.example.entity.paragraph.property.pStyle;
import org.example.entity.paragraph.property.numPr;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root
public class pPr {

    @Element(required = false)
    public pStyle pStyle;
    @Element(required = false)
    public bidi bidi;
    @Element(required = false)
    public jc jc;
    @Element(required = false)
    public numPr numPr;
    @Element(required = false)
    public keepLines keepLines;
    @Element(required = false)
    public keepNext keepNext;
    @Element(required = false)
    public widowControl windowControl;
    @Element(required = false)
    public spacing spacing;
    @Element(required = false)
    public ind ind;

    @Override
    public String toString() {
        return "pPr{" +
                "pStyle=" + pStyle +
                ", bidi=" + bidi +
                ", jc=" + jc +
                ", numPr=" + numPr +
                ", keepLines=" + keepLines +
                ", keepNext=" + keepNext +
                ", windowControl=" + windowControl +
                ", spacing=" + spacing +
                ", ind=" + ind +
                '}';
    }
}
