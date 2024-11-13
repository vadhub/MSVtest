package org.example.entity.table;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

@Root
public class tr {

    @Element
    public trPr trPr;

    @ElementList(name = "tc", inline = true, required = false)
    public List<tc> tc;

    @Override
    public String toString() {
        return "tr{" +
                "trPr=" + trPr +
                ", tc=" + tc +
                '}';
    }
}
