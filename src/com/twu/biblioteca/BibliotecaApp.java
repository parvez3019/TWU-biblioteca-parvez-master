package com.twu.biblioteca;

import java.io.IOException;

public class BibliotecaApp {

    public static void main(String[] args){
        Biblioteca biblioteca = new Biblioteca(new Library());
        biblioteca.start();
    }
}
