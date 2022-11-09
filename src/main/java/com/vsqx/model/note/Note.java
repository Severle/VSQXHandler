package com.vsqx.model.note;

import com.vsqx.enums.Type;
import com.vsqx.model.pmt.style.EntryStyle;
import com.vsqx.util.ToElement;
import org.dom4j.Element;
import org.dom4j.tree.BaseElement;

public class Note implements ToElement {
    private int tick;

    private int during;

    private int n;

    private int vel;

    private String lyric;

    private Phoneme phoneme;

    private EntryStyle noteStyle;

    {
        this.noteStyle = new EntryStyle(Type.STYLE_TYPE_NOTE);
    }

    public Note(int tick, int during, int n, int vel, String lyric) {
        this.tick = tick;
        this.during = during;
        this.n = n;
        this.vel = vel;
        this.lyric = lyric;
    }

    public int getTick() {
        return tick;
    }

    public void setTick(int tick) {
        this.tick = tick;
    }

    public int getDuring() {
        return during;
    }

    public void setDuring(int during) {
        this.during = during;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getVel() {
        return vel;
    }

    public void setVel(int vel) {
        this.vel = vel;
    }

    public String getLyric() {
        return lyric;
    }

    public void setLyric(String lyric) {
        this.lyric = lyric;
    }

    public Phoneme getPhoneme() {
        return phoneme;
    }

    public void setPhoneme(Phoneme phoneme) {
        this.phoneme = phoneme;
    }

    public EntryStyle getNoteStyle() {
        return noteStyle;
    }

    public void setNoteStyle(EntryStyle noteStyle) {
        this.noteStyle = noteStyle;
    }

    @Override
    public Element toElement() {
        Element note = new BaseElement("note");
        Element e;

        e = note.addElement("t");
        e.setText(String.valueOf(this.tick));

        e = note.addElement("dur");
        e.setText(String.valueOf(this.during));

        e = note.addElement("n");
        e.setText(String.valueOf(this.n));

        e = note.addElement("v");
        e.setText(String.valueOf(this.vel));

        e = note.addElement("y");
        e.addCDATA(this.lyric);

        note.add(this.phoneme.toElement());

        note.add(this.noteStyle.toElement());

        return note;
    }
}
