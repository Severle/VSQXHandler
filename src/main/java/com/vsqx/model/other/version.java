package com.vsqx.model.other;

import com.vsqx.util.ToElement;
import org.dom4j.Element;
import org.dom4j.tree.BaseElement;

public class version implements ToElement {
    @Override
    public Element toElement() {
        Element version = new BaseElement("version");

        version.addCDATA("4.0.0.3");

        return version;
    }
}
