package com.vsqx.singer.parameter;

import com.vsqx.enums.PRM;
import com.vsqx.model.pmt.cc.ParameterSinger;
import com.vsqx.util.ToElement;
import org.dom4j.Element;
import org.dom4j.tree.BaseElement;

public class SingerPRM implements ToElement {

    private final ParameterSinger bre;

    private final ParameterSinger bri;

    private final ParameterSinger cle;

    private final ParameterSinger gen;

    private final ParameterSinger ope;

    {
        this.bre = new ParameterSinger(PRM.BRE);
        this.bri = new ParameterSinger(PRM.BRI);
        this.cle = new ParameterSinger(PRM.CLE);
        this.gen = new ParameterSinger(PRM.GEN);
        this.ope = new ParameterSinger(PRM.OPE);

        this.ope.setValue(0);
    }

    public SingerPRM() {
    }

    public SingerPRM(int bre, int bri, int cle, int gen) {
        this.bre.setValue(bre);
        this.bri.setValue(bri);
        this.cle.setValue(cle);
        this.gen.setValue(gen);
    }

    public SingerPRM(int bre, int bri, int cle, int gen, int ope) {
        this.bre.setValue(bre);
        this.bri.setValue(bri);
        this.cle.setValue(cle);
        this.gen.setValue(gen);
        this.ope.setValue(ope);
    }

    public int getBre() {
        return bre.getValue();
    }

    public void setBre(int bre) {
        this.bre.setValue(bre);
    }

    public int getBri() {
        return bri.getValue();
    }

    public void setBri(int bri) {
        this.bri.setValue(bri);
    }

    public int getCle() {
        return cle.getValue();
    }

    public void setCle(int cle) {
        this.cle.setValue(cle);
    }

    public int getGen() {
        return gen.getValue();
    }

    public void setGen(int gen) {
        this.gen.setValue(gen);
    }

    public int getOpe() {
        return ope.getValue();
    }

    public void setOpe(int ope) {
        this.ope.setValue(ope);
    }

    public void setPRM(int bre, int bri, int cle, int gen) {
        this.bre.setValue(bre);
        this.bri.setValue(bri);
        this.cle.setValue(cle);
        this.gen.setValue(gen);
    }

    public void setPRM(int bre, int bri, int cle, int gen, int ope) {
        this.bre.setValue(bre);
        this.bri.setValue(bri);
        this.cle.setValue(cle);
        this.gen.setValue(gen);
        this.ope.setValue(ope);
    }

    @Override
    public Element toElement() {
        Element vPrm = new BaseElement("vPrm");
        Element e;

        e = vPrm.addElement("bre");
        e.setText(String.valueOf(this.bre.getValue()));

        e = vPrm.addElement("bri");
        e.setText(String.valueOf(this.bri.getValue()));

        e = vPrm.addElement("cle");
        e.setText(String.valueOf(this.cle.getValue()));

        e = vPrm.addElement("gen");
        e.setText(String.valueOf(this.gen.getValue()));

        e = vPrm.addElement("ope");
        e.setText(String.valueOf(this.ope.getValue()));

        return vPrm;
    }
}
