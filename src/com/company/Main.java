package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<String> library = new ArrayList<>();

        Book bookOne = new Book("Arthur Konan Doyle", "Criminal", "Sherlock Holmes", 4.5);
        Book bookTwo = new Book("Victor Hugo", "Fiction", "The Miserables", 9.99);
        Book bookThree = new Book("Robert Kiyosaki", "Business", "Rich Dad Poor Dad", 7.59);

        library.add(bookOne.getTitle());
        library.add(bookTwo.getTitle());
        library.add(bookThree.getTitle());

        ArrayList<String> movieList = new ArrayList<>();

        Movie movieOne = new Movie("Interstellar", 13.99, "Christopher Nolan");
        Movie movieTwo = new Movie("Leon", 9.99, "Luc Besson");
        Movie movieThree = new Movie("Shawshank Redemption", 12.59, "Frank Darabont");

        movieList.add(movieOne.getTitle());
        movieList.add(movieTwo.getTitle());
        movieList.add(movieThree.getTitle());

	    greeting();
	    options();

        int option = scanner.nextInt();

        switch (option){
            case 1:
                System.out.println("-----Books-----");

                for(int i = 0; i < library.size(); i++){
                    System.out.printf("%s. %s\n", i+1, library.get(i));
                }

                option = scanner.nextInt();

                switch (option){
                    case 1:
                        System.out.printf("BOOK TITLE: %s\n", bookOne.getTitle());
                        System.out.printf("AUTHOR: %s\n", bookOne.getAuthor());
                        System.out.printf("GENRE: %s\n", bookOne.getGenre());
                        System.out.printf("PRICE: %s$\n", bookOne.getPrice());

                        purchaseOrDownload();

                        option = scanner.nextInt();

                        switch (option){
                            case 1:
                                bookOne.purchase();
                                break;
                            case 2:
                                bookOne.download();
                                break;
                        }

                        break;
                    case 2:
                        System.out.printf("BOOK TITLE: %s\n", bookTwo.getTitle());
                        System.out.printf("AUTHOR: %s\n", bookTwo.getAuthor());
                        System.out.printf("GENRE: %s\n", bookTwo.getGenre());
                        System.out.printf("PRICE: %s$\n", bookTwo.getPrice());

                        purchaseOrDownload();

                        option = scanner.nextInt();

                        switch (option){
                            case 1:
                                bookOne.purchase();
                                break;
                            case 2:
                                bookOne.download();
                                break;
                        }

                        break;
                    case 3:
                        System.out.printf("BOOK TITLE: %s\n", bookThree.getTitle());
                        System.out.printf("AUTHOR: %s\n", bookThree.getAuthor());
                        System.out.printf("GENRE: %s\n", bookThree.getGenre());
                        System.out.printf("PRICE: %s$\n", bookThree.getPrice());

                        purchaseOrDownload();

                        option = scanner.nextInt();

                        switch (option){
                            case 1:
                                bookOne.purchase();
                                break;
                            case 2:
                                bookOne.download();
                                break;
                        }

                        break;
                }

                break;
            case 2:
                System.out.println("-----Movies-----");

                for(int i = 0; i < movieList.size(); i++){
                    System.out.printf("%s. %s\n", i+1, movieList.get(i));
                }

                option = scanner.nextInt();

                switch (option){
                    case 1:
                        System.out.printf("MOVIE NAME: %s\n", movieOne.getTitle());
                        System.out.printf("DIRECTOR: %s\n", movieOne.getDirector());
                        System.out.printf("PRICE: %s$\n", movieOne.getPrice());

                        purchaseOrDownload();

                        option = scanner.nextInt();

                        switch (option){
                            case 1:
                                movieOne.purchase();
                                break;
                            case 2:
                                movieOne.download();
                                break;
                        }

                        break;
                    case 2:
                        System.out.printf("MOVIE NAME: %s\n", movieTwo.getTitle());
                        System.out.printf("DIRECTOR: %s\n", movieTwo.getDirector());
                        System.out.printf("PRICE: %s$\n", movieTwo.getPrice());

                        purchaseOrDownload();

                        option = scanner.nextInt();

                        switch (option){
                            case 1:
                                movieTwo.purchase();
                                break;
                            case 2:
                                movieTwo.download();
                                break;
                        }

                        break;
                    case 3:
                        System.out.printf("MOVIE NAME: %s\n", movieThree.getTitle());
                        System.out.printf("DIRECTOR: %s\n", movieThree.getDirector());
                        System.out.printf("PRICE: %s$\n", movieThree.getPrice());

                        purchaseOrDownload();

                        option = scanner.nextInt();

                        switch (option){
                            case 1:
                                movieThree.purchase();
                                break;
                            case 2:
                                movieThree.download();
                                break;
                        }

                        break;
                }

                break;

        }

    }

    static void greeting(){
        System.out.println("Welcome!!!");
    }

    static void options(){

        System.out.println("Categories:");
        System.out.println("\t1. Books");
        System.out.println("\t2. Movies");

    }

    static void purchaseOrDownload(){
        System.out.println("1. Purchase");
        System.out.println("2. Download");
    }

}