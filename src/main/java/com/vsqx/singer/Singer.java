package com.vsqx.singer;

import com.vsqx.singer.parameter.SingerPRM;
import com.vsqx.util.ToElement;
import org.dom4j.Element;
import org.dom4j.tree.BaseElement;

public class Singer implements ToElement {

    private String name;

    private String id;

    private int bankSelected;

    private int programChange;

    private final SingerPRM singerPRM;

    {
        this.bankSelected = 4;

        this.singerPRM = new SingerPRM();
    }

    public Singer(String name) {
        this.name = name;
    }

    public void setPRM(int bre, int bri, int cle, int gen) {
        this.singerPRM.setPRM(bre, bri, cle, gen);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getBankSelected() {
        return bankSelected;
    }

    public void setBankSelected(int bankSelected) {
        this.bankSelected = bankSelected;
    }

    public int getProgramChange() {
        return programChange;
    }

    public void setProgramChange(int programChange) {
        this.programChange = programChange;
    }

    public Element getSingerElement() {
        Element singer = new BaseElement("singer");
        Element e;

        e = singer.addElement("t");
        e.setText("0");

        e = singer.addElement("bs");
        e.setText(String.valueOf(this.getBankSelected()));

        e = singer.addElement("pc");
        e.setText(String.valueOf(this.getProgramChange()));

        return singer;
    }

    @Override
    public Element toElement() {
        Element vVoice = new BaseElement("vVoice");
        Element e;

        e = vVoice.addElement("bs");
        e.setText(String.valueOf(this.bankSelected));

        e = vVoice.addElement("pc");
        e.setText(String.valueOf(this.programChange));

        e = vVoice.addElement("id");
        e.addCDATA(this.id);

        e = vVoice.addElement("name");
        e.addCDATA(this.name);

        vVoice.add(this.singerPRM.toElement());

        return vVoice;
    }
}
