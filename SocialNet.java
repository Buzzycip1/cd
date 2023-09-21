package com.campusdual.redsoclal;

import java.util.*;

public class SocialNet {
    private List<Users> userList = new ArrayList<>();
    private List<Post> postList = new ArrayList<>();
    private List<Comments> commentsList = new ArrayList<>();


    public static void main(String[] args) {
        SocialNet sn = new SocialNet();

        sn.populateSocialNet();
        sn.init();
        sn.viewUserOptions();
        sn.ListMyPost();
        sn.workContacts();
        sn.getCommentsList();

    }

    private void init() {
        int option = 0;
        do {
            System.out.println("***********************");
            System.out.println("Bienvenido a SocialNet");
            System.out.println("***********************");
            System.out.println("1. Registrarme");
            System.out.println("2. Acceder");
            System.out.println("0. Salir");
            option = Utils.integer("Selecciona la opción deseada: ");
            switch (option) {
                case 1:
                    this.register();
                    break;
                case 2:
                    this.viewUserOptions();
                    break;
                default:
                    System.out.println("Opción no válida. ");
                    break;
            }
        } while (option != 0);

    }

    private void register() {
        String username = Utils.string("Introduce el nombre del nuevo usuario: ");
        Users user = new Users(username);
        this.getUserList().add(user);
    }

    private void viewUserOptions() {
        int option = 0;
        do {
            System.out.println("****************************");
            System.out.println(" Usted está en la SocialNet ");
            System.out.println("****************************");
            System.out.println("0. Retroceder");
            System.out.println("1. Añadir post");
            System.out.println("2. Comentar post");
            System.out.println("3. Listar post de usuario");
            System.out.println("4. Listar comentarios de usuarios");
            System.out.println("5. Listar post de otros usuarios");
            System.out.println("6. Gestionar contacto (posts, comentarios, cuenta)");


            option = Utils.integer("Selecciona la opción deseada: ");
            switch (option) {

                case 0:
                    break;
                case 1:
                    this.addPost();
                    break;
                case 2:
                    this.commentPost();
                    break;
                case 3:
                    this.ListMyPost();
                    break;
                case 4:
                    this.viewCommentsOtherUser();
                    break;
                case 5:
                    this.listingPostOtherUsers();
                    break;
                case 6:
                    this.workContacts();
                    break;
            }

        } while (option != 0);

    }

    public void ListMyPost() {
        if (postList.isEmpty()) {
            System.out.println("No hay posts registrados. ");
        } else {
            System.out.println("La lista de post: ");
            for (Post posts : postList) {
                System.out.println(posts.getCommentsList());
                System.out.println(" ");
            }
        }
    }

    private void addPost() {

        System.out.print("Ingrese su comentario: ");

    }

    private void commentPost() {
        int a=-1;
        System.out.println(" Introduzca comentario: ");

    }

    private void listingPostOtherUsers() {
        System.out.println("Listar post de otros  usuarios");

    }

    private void viewCommentsOtherUser() {
        System.out.println("Listar comentarios otros usuarios");
    }

    private void workContacts() {

        int option = 0;
        do {
            System.out.println("****************************");
            System.out.println(" Gestion de contactos ");
            System.out.println("****************************");
            System.out.println("0. Retroceder");
            System.out.println("1. Eliminar contacto");
            System.out.println("2. Eliminar post");
            System.out.println("3. Eliminar comentario");

            option = Utils.integer("Selecciona la opción deseada: ");
            switch (option) {

                case 0:
                    break;
                case 1:
                    this.deleteUser();
                    break;
                case 2:
                    this.deletePost();
                    break;
                case 3:
                    this.deleteComments();
                    break;
            }

        } while (option != 0);

    }
    private void deleteUser(){

    }

    private void deletePost(){

    }
    private void deleteComments(){

    }

    private void populateSocialNet() {
        Users u1 = new Users("Fabricio");
        Users u2 = new Users("Henry");
        Users u3 = new Users("Gabriel");
        this.getUserList().add(u1);
        this.getUserList().add(u2);
        this.getUserList().add(u3);
        Post p1 = new Post("El efecto de mirar fijamente a los ojos de una cabra sobre la psique humana");
        Post p2 = new Post("La influencia de la fases de la luna en la mortandad de los cangrejos barbudos");
        Post p3 = new Post("Causas que motivan a las orcas bulímicas atacar a sirenas varadas?");
        this.getPostList().add(p1);
        this.getPostList().add(p2);
        this.getPostList().add(p3);
        Comments c1 = new Comments("Totalmente acertado tu comentario!",  null,"Lucas" );
        Comments c2 = new Comments("Me parecio  arbitraria su decición", null, "Fabricio" );
        Comments c3 = new Comments("Nunca ", null,"Gabriel");
        this.getCommentsList().add(c1);
        this.getCommentsList().add(c2);
        this.getCommentsList().add(c3);

    }

    public List<Users> getUserList() {  return userList;}

    public List<Post> getPostList() {
        return postList;
    }

    public List<Comments> getCommentsList() {
        return commentsList;
    }

}



