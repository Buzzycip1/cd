package com.campusdual.redsoclal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    private List<Comments> commentsList = new ArrayList<>();
    private Date date;
    private String title;

    public Post(String title) {
        this.date = new Date();
        this.title = title;
    }

    public List<Comments> getCommentsList() {
        return commentsList;
    }

    public void setCommentsList(List<Comments> commentsList) {
        this.commentsList = commentsList;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}


/*Añadir usuarios, posts y comentarios
Dejar de seguir un usuario
Comenzar a seguir un usuario
Eliminar un usuario, un post o un comentario
Listar todos los posts de un usuario
Listar los comentarios de un usuario
Mostrar el número de comentarios que tiene un post*/