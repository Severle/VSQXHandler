package com.vsqx.model.note;

import com.vsqx.util.ToElement;
import org.dom4j.Element;
import org.dom4j.tree.BaseElement;

public class Phoneme implements ToElement {
    private String value;

    private boolean lock;

    {
        this.lock = false;
    }

    public Phoneme(String value) {
        this.value = value;
    }

    public Phoneme(String value, boolean lock) {
        this.value = value;
        this.lock = lock;
    }

    public Phoneme(Phoneme phoneme) {
        this.value = phoneme.getValue();
        this.lock = phoneme.isLock();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isLock() {
        return lock;
    }

    public void setLock(boolean lock) {
        this.lock = lock;
    }

    @Override
    public Element toElement() {
        int lock = 0;
        if (this.lock)
            lock = 1;
        Element p = new BaseElement("p");
        p.addAttribute("lock", String.valueOf(lock));
        p.addCDATA(this.value);

        return p;
    }
}
