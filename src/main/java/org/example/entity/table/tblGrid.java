package org.example.entity.table;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

@Root
public class tblGrid {
    @ElementList(name = "gridCol", inline = true)
    public List<gridCol> gridCol;
}
