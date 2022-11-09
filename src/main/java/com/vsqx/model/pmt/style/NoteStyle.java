package com.vsqx.model.pmt.style;

import com.vsqx.enums.Style;
import com.vsqx.exception.impl.StyleException;

public class NoteStyle {
    private int accentValue;

    private int bendDepValue;

    private int bendLenValue;

    private int decayValue;

    private int fallPortValue;

    private int openingValue;

    private int risePortValue;

    private int vibLenValue;

    private int vibTypeValue;

    public NoteStyle(int accentValue, int bendDepValue, int bendLenValue, int decayValue, int fallPortValue, int openingValue, int risePortValue, int vibLenValue, int vibTypeValue) {
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

    public NoteStyle(NoteStyle noteStyle) {
        try {
            this.setAccentValue(noteStyle.getAccentValue());
            this.setBendDepValue(noteStyle.getBendDepValue());
            this.setBendLenValue(noteStyle.getBendLenValue());
            this.setDecayValue(noteStyle.getDecayValue());
            this.setFallPortValue(noteStyle.getFallPortValue());
            this.setOpeningValue(noteStyle.getOpeningValue());
            this.setRisePortValue(noteStyle.getRisePortValue());
            this.setVibLenValue(noteStyle.getVibLenValue());
            this.setVibTypeValue(noteStyle.getVibTypeValue());
        } catch (StyleException e) {
            throw new RuntimeException(e);
        }
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
}
