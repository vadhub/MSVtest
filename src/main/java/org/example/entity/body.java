package org.example.entity;

import org.example.entity.paragraph.p;
import org.example.entity.table.tbl;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

@Root
public class body {

    @ElementList(name = "p", inline = true, required = false)
    public List<p> p;

    @ElementList(name = "tbl", inline = true, required = false)
    public List<tbl> tbl;

    public body(List<org.example.entity.paragraph.p> p) {
        this.p = p;
    }

    public body() {
    }

    @Override
    public String toString() {
        return "body{" +
                "p=" + p +
                '}';
    }
}
