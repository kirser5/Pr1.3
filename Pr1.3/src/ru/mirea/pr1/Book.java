package ru.mirea.pr1;

public class Book {
private String Author;
private int NumOfPages;
private String Genre;
private String Name;
public Book(String na,String a, int n, String g){
    Author=a;
    NumOfPages=n;
    Genre=g;
    Name=na;
}

    public void setAuthor(String author) {
        Author = author;
    }

    public void setNumOfPages(int numOfPages) {
        NumOfPages = numOfPages;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public int getNumOfPages() {
        return NumOfPages;
    }

    public String getAuthor() {
        return Author;
    }

    public String getGenre() {
        return Genre;
    }
    public String toString(){
        return "Name: "+this.Name+ " |Author: "+this.Author+" |Genre: "+this.Genre+" |Number of pages: "+this.NumOfPages;
    }
}
