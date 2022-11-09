package com.vsqx.model.pmt.cc;

import com.vsqx.enums.CC;
import com.vsqx.exception.impl.CCException;
import com.vsqx.model.pmt.AbstractParameter;

public class ParameterCC implements AbstractParameter {

    private final CC cc;

    private int value;

    private int tick;

    public ParameterCC(CC cc) {
        this.cc = cc;
    }

    public ParameterCC(CC cc, int value, int tick) {
        this.cc = cc;
        this.value = value;
        this.tick = tick;
    }

    public void setTick(int tick) {
        this.tick = tick;
    }

    public int getTick() {
        return this.tick;
    }

    @Override
    public void setValue(int value) throws CCException {
        if (value > this.cc.getMaxValue() || value < this.cc.getMinValue())
            throw new CCException("Wrong Parameter Value!");
        this.value = value;
    }

    @Override
    public int getValue() {
        return this.value;
    }

    @Override
    public String getName() {
        return this.cc.toString();
    }

    @Override
    public String getVID() {
        return this.cc.getVID();
    }

    @Override
    public int getMinValue() {
        return this.cc.getMinValue();
    }

    @Override
    public int getMaxValue() {
        return this.cc.getMaxValue();
    }

    @Override
    public int getDefaultValue() {
        return this.cc.getDefaultValue();
    }

}
