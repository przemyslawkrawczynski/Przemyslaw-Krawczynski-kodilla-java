package com.kodilla.testing.library;

import java.util.*;

public class BookLibrary {
    LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {

        List<Book> bookList = new ArrayList<Book>();
        if (titleFragment.length() < 3) return bookList;
        List<Book> resultList = libraryDatabase.listBooksWithCondition(titleFragment);
        if (resultList.size() > 20) return bookList;
        bookList = resultList;
        return bookList;
    }

    public List<Book> listBookInHandsOf(LibraryUser libraryUser) {
        List<Book> listOfBookBorrowed = new ArrayList<Book>();
      //  listOfBookBorrowed.add(new Book("Jan", "Testowanie", 2010));

       return listOfBookBorrowed;

    }
}
