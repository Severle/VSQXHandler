package com.vsqx.model.other;

import com.vsqx.util.ToElement;
import org.dom4j.Element;
import org.dom4j.tree.BaseElement;

public class vender implements ToElement {

    @Override
    public Element toElement() {
        Element vender = new BaseElement("vender");

        vender.addCDATA("Yamaha corporation");

        return vender;
    }
}
