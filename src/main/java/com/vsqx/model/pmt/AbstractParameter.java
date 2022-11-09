package com.vsqx.model.pmt;

import com.vsqx.exception.impl.CCException;

public interface AbstractParameter {

    void setValue(int value) throws CCException;

    int getValue();

    String getName();

    String getVID();

    int getMinValue();

    int getMaxValue();

    int getDefaultValue();
}
