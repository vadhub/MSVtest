package org.example.entity.table;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;
import org.example.entity.Content;
import java.util.List;


@Root
public class tbl implements Content {
    @Element(required = false)
    public tblPr tblPr;

    @Element(required = false)
    public tblCellMar tblCellMar;

    @Element(required = false)
    public tblGrid tblGrid;

    @ElementList(name = "tr", inline = true)
    public List<tr> tr;
}
