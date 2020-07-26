package com.company.functionalInterface;

public class Movie {

    Genres genre;
    int price;

    public Movie(Genres genre, int price) {
        this.genre = genre;
        this.price = price;
    }

    public Genres getGenre() {
        return genre;
    }

    public void setGenre(Genres genre) {
        this.genre = genre;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Movie(" +
                "genre='" + genre + '\'' +
                ", price=" + price +
                ')';
    }
}
