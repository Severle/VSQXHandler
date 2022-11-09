package com.vsqx.model.vsPart;

import com.vsqx.model.note.Note;
import com.vsqx.model.other.PartPlug;
import com.vsqx.model.pmt.style.EntryStyle;
import org.dom4j.Element;

import java.util.ArrayList;
import java.util.List;

public class Part {

    private int tick;

    private int playTime;

    private String name;

    private String comment;

    private final PartPlug partPlug;

    private EntryStyle partStyle;

    private Element singer;

    private List<Note> notes;




    {
        this.partPlug = new PartPlug();
        this.notes = new ArrayList<>();
    }

    public Part() {
    }




    //Basic

    public int getTick() {
        return tick;
    }

    public void setTick(int tick) {
        this.tick = tick;
    }

    public int getPlayTime() {
        return playTime;
    }

    public void setPlayTime(int playTime) {
        this.playTime = playTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public EntryStyle getPartStyle() {
        return partStyle;
    }

    public void setPartStyle(EntryStyle partStyle) {
        this.partStyle = partStyle;
    }




    //Singer

    public Element getSinger() {
        return singer;
    }

    public void setSinger(Element singer) {
        this.singer = singer;
    }





    //CC













    //Note

    public void addNote(Note note) {
        this.notes.add(note);
    }

    public Note getNoteByTick(int tick) {
        for (Note n : this.notes) {
            if (n.getTick() == tick)
                return n;
        }

        return null;
    }

    public Note getNoteByIndex(int index) {
        return this.notes.get(index);
    }

}
