package com.campusdual.redsoclal;

import java.util.Date;

public class Comments {
    private String comment;
    private Date comemmentDate;
    private String owner;

    public Comments(String comment, Date comemmentDate, String owner) {
        this.comment = comment;
        this.comemmentDate = comemmentDate;
        this.owner = owner;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getComemmentDate() {
        return comemmentDate;
    }

    public void setComemmentDate(Date comemmentDate) {
        this.comemmentDate = comemmentDate;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
