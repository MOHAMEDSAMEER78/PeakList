package com.example.PeakList.model;

import java.util.Date;

public class Notes {
    private int noteId;
    private int userId;
    private String title;
    private String note;
    private Date createdAt;
    private Date updatedAt;

    public Notes(int noteId, int userId, String note) {
        this.noteId = noteId;
        this.userId = userId;
        this.note = note;
        createdAt = new Date();
        updatedAt = new Date();
    }

    public int getNoteId() {
        return noteId;
    }

    public void setNoteId(int noteId) {
        this.noteId = noteId;
        updatedAt = new Date();
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
        updatedAt = new Date();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        updatedAt = new Date();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
        updatedAt = new Date();
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }
}
