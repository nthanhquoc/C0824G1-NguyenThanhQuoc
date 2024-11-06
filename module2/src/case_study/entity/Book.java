package case_study.entity;

import java.io.Serializable;

public class Book implements Serializable {
    private int id;
    private String title;
    private String author;
    private boolean status;
    public Book(){

    }
    public Book(int id,String title,String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.status = true;
    }
    public Book(int id, String title, String author, boolean status) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.status = status;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    @Override
    public String toString() {
        return "Book ID: " + id + ", Title: " + title + ", Author: " + author + ", Status: " + status;
    }
}

