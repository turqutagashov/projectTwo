package com.company;

public class Movie extends Product{
    private String director;

    public Movie(String title, double price, String director) {
        super(title, price);
        this.director = director;
    }

    public String getDirector(){
        return director;
    }

    public void information(){
        System.out.printf("DIRECTOR: %s\n", getDirector());
        super.information();
    }
}
