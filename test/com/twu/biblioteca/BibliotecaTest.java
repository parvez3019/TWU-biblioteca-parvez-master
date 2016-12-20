package com.twu.biblioteca;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by parvez on 21/12/16.
 */
public class BibliotecaTest {
    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    Biblioteca biblioteca;
    Library library;
    @Test
    public void testWelcome() {
        assertEquals("Welcome to Biblioteca\n", biblioteca.welcome());
    }

}
