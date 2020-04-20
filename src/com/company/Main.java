package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Product> library = new ArrayList<>();

        Product bookOne = new Book("Arthur Konan Doyle", "Criminal", "Sherlock Holmes", 4.5);
        Product bookTwo = new Book("Victor Hugo", "Fiction", "The Miserables", 9.99);
        Product bookThree = new Book("Robert Kiyosaki", "Business", "Rich Dad Poor Dad", 7.59);

        library.add(bookOne);
        library.add(bookTwo);
        library.add(bookThree);

        ArrayList<Product> movieList = new ArrayList<>();

        Product movieOne = new Movie("Interstellar", 13.99, "Christopher Nolan");
        Product movieTwo = new Movie("Leon", 9.99, "Luc Besson");
        Product movieThree = new Movie("Shawshank Redemption", 12.59, "Frank Darabont");

        movieList.add(movieOne);
        movieList.add(movieTwo);
        movieList.add(movieThree);

	    greeting();
	    try{
            options();

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("------Books------");

                    for (int i = 0; i < library.size(); i++) {
                        System.out.printf("%s. %s\n", i + 1, library.get(i).getTitle());
                    }

                    option = scanner.nextInt();

                    switch (option) {
                        case 1:
                            bookOne.information();

                            purchaseOrDownload();

                            option = scanner.nextInt();

                            switch (option) {
                                case 1:
                                    bookOne.purchase();
                                    break;
                                case 2:
                                    bookOne.download();
                                    break;
                            }

                            break;
                        case 2:
                            bookTwo.information();

                            purchaseOrDownload();

                            option = scanner.nextInt();

                            switch (option) {
                                case 1:
                                    bookOne.purchase();
                                    break;
                                case 2:
                                    bookOne.download();
                                    break;
                            }

                            break;
                        case 3:
                            bookThree.information();

                            purchaseOrDownload();

                            option = scanner.nextInt();

                            switch (option) {
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
                    System.out.println("------Movies------");

                    for (int i = 0; i < movieList.size(); i++) {
                        System.out.printf("%s. %s\n", i + 1, movieList.get(i).getTitle());
                    }

                    option = scanner.nextInt();

                    switch (option) {
                        case 1:
                            movieOne.information();

                            purchaseOrDownload();

                            option = scanner.nextInt();

                            switch (option) {
                                case 1:
                                    movieOne.purchase();
                                    break;
                                case 2:
                                    movieOne.download();
                                    break;
                            }

                            break;
                        case 2:
                            movieTwo.information();

                            purchaseOrDownload();

                            option = scanner.nextInt();

                            switch (option) {
                                case 1:
                                    movieTwo.purchase();
                                    break;
                                case 2:
                                    movieTwo.download();
                                    break;
                            }

                            break;
                        case 3:
                            movieThree.information();

                            purchaseOrDownload();

                            option = scanner.nextInt();

                            switch (option) {
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

        } catch (Exception e){
            System.out.println("SOMETHING WENT WRONG!!!");
        }

    }

    static void greeting(){
        System.out.println("----Welcome!!!----");
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