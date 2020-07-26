package com.company.functionalInterface;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MovieList {


    public void streamMovies(){

        List<Movie> m1 = movieList1();
        List<Movie> m2 = movieList2();

        Map<Genres, Double> fff = Stream.concat(m1.stream(),m2.stream())
                .collect(Collectors.groupingBy(Movie::getGenre, Collectors.averagingInt(Movie::getPrice)));

        Map<Genres, Long> fff1 = Stream.concat(m1.stream(),m2.stream())
                .collect(Collectors.groupingBy(Movie::getGenre, Collectors.counting()));

        System.out.println(fff);
        System.out.println(fff1);
    }




    public static List<Movie> movieList1(){

        List<Movie> movie1 = new ArrayList<>();
        movie1.add(new Movie(Genres.COMEDY,300));
        movie1.add(new Movie(Genres.CRIMINAL,400));
        movie1.add(new Movie(Genres.SCIFY,100));
        movie1.add(new Movie(Genres.COMEDY,150));
        movie1.add(new Movie(Genres.CRIMINAL,250));
        movie1.add(new Movie(Genres.SCIFY,350));

        return movie1;
    }

    public static List<Movie> movieList2(){

        List<Movie> movie2 = new ArrayList<>();
        movie2.add(new Movie(Genres.COMEDY,20));
        movie2.add(new Movie(Genres.CRIMINAL,30));
        movie2.add(new Movie(Genres.SCIFY,50));
        movie2.add(new Movie(Genres.COMEDY,25));
        movie2.add(new Movie(Genres.CRIMINAL,35));
        movie2.add(new Movie(Genres.SCIFY,55));

        return movie2;
    }

}
