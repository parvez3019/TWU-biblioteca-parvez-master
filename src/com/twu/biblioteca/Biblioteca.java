package com.twu.biblioteca;

import java.io.*;
import java.util.Scanner;

/**
 * Created by parvez on 20/12/16.
 */
public class Biblioteca {
    private Library library;

    public Biblioteca(Library library) {
        this.library = library;
    }

    public void start() {
        System.out.println(welcome());
        displayMenu();
    }

    private void displayMenu() {
        int option = 0;
        while(option!=5){
            System.out.println("Enter:");
            System.out.println("\t1.List Book");
            System.out.println("\t2.Checkout Book");
            System.out.println("\t3.Return Book");
            System.out.println("\t4.Exit");
            Scanner s = new Scanner(System.in);
            s.useDelimiter(System.getProperty("line.separator"));
            option = s.nextInt();
            switch(option){
                case 1:
                    listBooks(library);
                    break;
                case 2:
                    System.out.println("\nEnter Book title: ");
                    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                    String s1 = null;
                    try {
                        s1 = in.readLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    checkoutBook(library,s1);
                    break;
                case 3:
                    System.out.println("\nEnter Book title: ");
                    BufferedReader in2 = new BufferedReader(new InputStreamReader(System.in));
                    String s2 = null;
                    try {
                        s2 = in2.readLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    returnBook(library,s2);
                    break;
                case 4:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
    }

    private void listBooks(Library library) {
        System.out.println(library.listLibraryItem());
    }

    private void checkoutBook(Library library, String title) {
        if(library.checkoutItem(title)) {
            System.out.println("***Thank you! Enjoy***");
        } else {
            System.out.println("***That book is not available***");
        }
    }

    private void returnBook(Library library, String title) {
        if(library.returnBook(title)) {
            System.out.println("***Thank you for returning the book***");
        } else {
            System.out.println("***That is not a valid book to return***");
        }
    }


    public String welcome() {
        return "Welcome to Biblioteca";
    }

}
