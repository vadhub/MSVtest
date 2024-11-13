package org.example.entity.table;

import org.example.entity.paragraph.property.jc;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

@Root
public class tblPr {
    @Element(required = false)
    public tblStyle tblStyle;

    @Element(required = false)
    public tblW tblW;

    @Element(required = false)
    public jc jc;

    @Element(required = false)
    public tblInd tblInd;

    @Element(required = false)
    public tblCellMar tblCellMar;

    @Element(required = false)
    public tblGrid tblGrid;

    @ElementList(name = "tr", inline = true, required = false)
    public List<tr> tr;

    @Override
    public String toString() {
        return "tblPr{" +
                "tblStyle=" + tblStyle +
                ", tblW=" + tblW +
                ", jc=" + jc +
                ", tblInd=" + tblInd +
                ", tblCellMar=" + tblCellMar +
                ", tblGrid=" + tblGrid +
                ", tr=" + tr +
                '}';
    }
}
