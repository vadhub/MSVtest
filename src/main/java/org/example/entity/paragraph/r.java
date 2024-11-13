package org.example.entity.paragraph;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root
public class r {

    @Element(required = false)
    public t t;

    public r(t t) {
        this.t = t;
    }

    public r() {
    }

    @Override
    public String toString() {
        return "r{" +
                "t=" + t +
                '}';
    }
}
