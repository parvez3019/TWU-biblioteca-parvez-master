package com.twu.biblioteca;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by parvez on 20/12/16.
 */
public class Library {
    public Map<LibraryItem, Boolean> bookInventory;
    public Library() {
        bookInventory = new LinkedHashMap<LibraryItem, Boolean>();
        bookInventory.put(new Book("Stay Hungry Stay Foolish", "Rashmi Bansal", 2012), true);
        bookInventory.put(new Book("Life Without Limits: Inspiration for a Ridiculously Good Life",
                "Nick Vujicic", 2012), true);
        bookInventory.put(new Book("To Kill a Mockingbird", "Harper Lee", 2006), true);
        bookInventory.put(new Book("The Da Vinci Code", "Dan Brown", 2006), true);

    }

    public String listLibraryItem() {
        String list = "";
        list = listItems(bookInventory);
        return list;
    }

    private String listItems(Map<LibraryItem, Boolean> inventory) {
        String inventoryList = "";
        for(Map.Entry<LibraryItem, Boolean> entry : inventory.entrySet()) {
            if(entry.getValue() == true) {
                inventoryList += entry.getKey().getDetails();
            }
        }
        return inventoryList.trim();
    }

    public boolean checkoutItem(String title) {
        return (checkoutItem(bookInventory, title));
    }

    public boolean returnBook(String title) {
        LibraryItem libraryItem = getLibraryItem(title);
        if(bookInventory.containsKey(libraryItem) && bookInventory.get(libraryItem) == false) {
            bookInventory.put(libraryItem, true);
            return true;
        }
        return false;
    }

    LibraryItem getLibraryItem(String title) {
        for(Map.Entry<LibraryItem, Boolean> entry : bookInventory.entrySet()) {
            if(entry.getKey().getTitle().equals(title)) {
                return entry.getKey();
            }
        }
        return null;
    }

    private boolean checkoutItem(Map<LibraryItem, Boolean> inventory, String title) {
        for(Map.Entry<LibraryItem, Boolean> entry : inventory.entrySet()) {
            if(entry.getKey().getTitle().equals(title)) {
                inventory.put(entry.getKey(), false);
                return true;
            }
        }
        return false;
    }
}
