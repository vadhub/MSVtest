package org.example.entity.paragraph;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Text;

public class t {
    @Attribute(required = false)
    public String space;
    @Text(required = false)
    public String text;

    public t(String space, String text) {
        this.space = space;
        this.text = text;
    }

    public t() {
    }

    @Override
    public String toString() {
        return "t{" +
                "space='" + space + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
