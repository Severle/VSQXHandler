package com.vsqx.model.pmt.style;

import com.vsqx.enums.Style;
import com.vsqx.enums.Type;
import com.vsqx.exception.impl.StyleException;
import com.vsqx.util.ToElement;
import org.dom4j.Element;
import org.dom4j.tree.BaseElement;

public class EntryStyle implements ToElement {

    private Type type;

    private int accentValue;

    private int bendDepValue;

    private int bendLenValue;

    private int decayValue;

    private int fallPortValue;

    private int openingValue;

    private int risePortValue;

    private int vibLenValue;

    private int vibTypeValue;

    public EntryStyle(int accentValue, int bendDepValue, int bendLenValue, int decayValue, int fallPortValue, int openingValue, int risePortValue, int vibLenValue, int vibTypeValue) {
        try {
            this.setAccentValue(accentValue);
            this.setBendDepValue(bendDepValue);
            this.setBendLenValue(bendLenValue);
            this.setDecayValue(decayValue);
            this.setFallPortValue(fallPortValue);
            this.setOpeningValue(openingValue);
            this.setRisePortValue(risePortValue);
            this.setVibLenValue(vibLenValue);
            this.setVibTypeValue(vibTypeValue);
        } catch (StyleException e) {
            throw new RuntimeException(e);
        }
    }

    public EntryStyle(EntryStyle entryStyle) {
        try {
            this.setAccentValue(entryStyle.getAccentValue());
            this.setBendDepValue(entryStyle.getBendDepValue());
            this.setBendLenValue(entryStyle.getBendLenValue());
            this.setDecayValue(entryStyle.getDecayValue());
            this.setFallPortValue(entryStyle.getFallPortValue());
            this.setOpeningValue(entryStyle.getOpeningValue());
            this.setRisePortValue(entryStyle.getRisePortValue());
            this.setVibLenValue(entryStyle.getVibLenValue());
            this.setVibTypeValue(entryStyle.getVibTypeValue());
        } catch (StyleException e) {
            throw new RuntimeException(e);
        }
    }

    public EntryStyle(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getAccentValue() {
        return accentValue;
    }

    public void setAccentValue(int accentValue) throws StyleException {
        if (accentValue < Style.ACCENT.getMinValue() || accentValue > Style.ACCENT.getMaxValue())
            throw new StyleException("The Value is Out of Range");
        this.accentValue = accentValue;
    }

    public int getBendDepValue() {
        return bendDepValue;
    }

    public void setBendDepValue(int bendDepValue) throws StyleException {
        if (bendDepValue < Style.BENDDEP.getMinValue() || bendDepValue > Style.BENDDEP.getMaxValue())
            throw new StyleException("The Value is Out of Range");
        this.bendDepValue = bendDepValue;
    }

    public int getBendLenValue() {
        return bendLenValue;
    }

    public void setBendLenValue(int bendLenValue) throws StyleException {
        if (bendLenValue < Style.BENDLEN.getMinValue() || bendLenValue > Style.BENDLEN.getMaxValue())
            throw new StyleException("The Value is Out of Range");
        this.bendLenValue = bendLenValue;
    }

    public int getDecayValue() {
        return decayValue;
    }

    public void setDecayValue(int decayValue) throws StyleException {
        if (decayValue < Style.DECAY.getMinValue() || decayValue > Style.DECAY.getMaxValue())
            throw new StyleException("The Value is Out of Range");
        this.decayValue = decayValue;
    }

    public int getFallPortValue() {
        return fallPortValue;
    }

    public void setFallPortValue(int fallPortValue) throws StyleException {
        if (fallPortValue < Style.FALLPORT.getMinValue() || fallPortValue > Style.FALLPORT.getMaxValue())
            throw new StyleException("The Value is Out of Range");
        this.fallPortValue = fallPortValue;
    }

    public int getOpeningValue() {
        return openingValue;
    }

    public void setOpeningValue(int openingValue) throws StyleException {
        if (openingValue < Style.OPENING.getMinValue() || openingValue > Style.OPENING.getMaxValue())
            throw new StyleException("The Value is Out of Range");
        this.openingValue = openingValue;
    }

    public int getRisePortValue() {
        return risePortValue;
    }

    public void setRisePortValue(int risePortValue) throws StyleException {
        if (risePortValue < Style.RISEPORT.getMinValue() || risePortValue > Style.RISEPORT.getMaxValue())
            throw new StyleException("The Value is Out of Range");
        this.risePortValue = risePortValue;
    }

    public int getVibLenValue() {
        return vibLenValue;
    }

    public void setVibLenValue(int vibLenValue) throws StyleException {
        if (vibLenValue < Style.VIBLEN.getMinValue() || vibLenValue > Style.VIBLEN.getMaxValue())
            throw new StyleException("The Value is Out of Range");
        this.vibLenValue = vibLenValue;
    }

    public int getVibTypeValue() {
        return vibTypeValue;
    }

    public void setVibTypeValue(int vibTypeValue) throws StyleException {
        if (vibTypeValue < Style.VIBTYPE.getMinValue() || vibTypeValue > Style.VIBTYPE.getMaxValue())
            throw new StyleException("The Value is Out of Range");
        this.vibTypeValue = vibTypeValue;
    }

    @Override
    public Element toElement() {
        Element nStyle = new BaseElement(this.type.getType());
        Element e;

        e = nStyle.addElement("v");
        e.addAttribute("id", "accent");
        e.setText(String.valueOf(this.getAccentValue()));

        e = nStyle.addElement("v");
        e.addAttribute("id", "bendDep");
        e.setText(String.valueOf(this.getBendDepValue()));

        e = nStyle.addElement("v");
        e.addAttribute("id", "bendLen");
        e.setText(String.valueOf(this.getBendLenValue()));

        e = nStyle.addElement("v");
        e.addAttribute("id", "decay");
        e.setText(String.valueOf(this.getDecayValue()));

        e = nStyle.addElement("v");
        e.addAttribute("id", "fallPort");
        e.setText(String.valueOf(this.getFallPortValue()));

        e = nStyle.addElement("v");
        e.addAttribute("id", "opening");
        e.setText(String.valueOf(this.getOpeningValue()));

        e = nStyle.addElement("v");
        e.addAttribute("id", "risePort");
        e.setText(String.valueOf(this.getRisePortValue()));

        e = nStyle.addElement("v");
        e.addAttribute("id", "vibLen");
        e.setText(String.valueOf(this.getVibLenValue()));

        e = nStyle.addElement("v");
        e.addAttribute("id", "vibType");
        e.setText(String.valueOf(this.getVibTypeValue()));

        return nStyle;
    }
}
