package org.example.entity;


import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

@Root
public class document {
    @ElementList(inline = true)
    public List<body> body;

    @Override
    public String toString() {
        return "document{" +
                "body=" + body +
                '}';
    }
}
