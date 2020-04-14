package com.company;

public class Book extends Product{

    private String author;
    private String genre;


    public Book(String author, String genre, String title, double price){
        super(title, price);
        this.author = author;
        this.genre = genre;
    }

    public String getAuthor(){
        return author;
    }

    public String getGenre(){
        return genre;
    }

    public void information(){
        System.out.printf("BOOK NAME: %s\n", getTitle());
        System.out.printf("AUTHOR: %s\n", getAuthor());
        System.out.printf("GENRE: %s\n", getGenre());
        System.out.printf("PRICE: %s\n", getPrice());
    }

}
