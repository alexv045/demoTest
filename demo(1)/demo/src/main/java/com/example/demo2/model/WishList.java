package com.example.demo2.model;


public class WishList  {

    private String books;
    private String isbn;
    private String wishListName;

    public WishList(String books, String isbn, String wishListName) {
        this.books = books;
        this.isbn = isbn;
        this.wishListName = wishListName;
    }

    public String getBooks() {
        return books;
    }

    public void setBooks(String books) {
        this.books = books;
    }

    public String getWishListName() {
        return wishListName;
    }

    public void setWishListName(String wishListName) {
        this.wishListName = wishListName;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
