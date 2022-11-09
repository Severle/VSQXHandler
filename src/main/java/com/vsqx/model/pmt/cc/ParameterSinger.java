package com.vsqx.model.pmt.cc;

import com.vsqx.enums.PRM;

public class ParameterSinger {

    private final PRM prm;

    private int value;

    public ParameterSinger(PRM prm) {
        this.prm = prm;
    }

    public ParameterSinger(PRM prm, int value) {
        this.prm = prm;
        this.value = value;
    }

    public PRM getPrm() {
        return prm;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
