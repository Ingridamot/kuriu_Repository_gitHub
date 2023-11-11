package com.motuziene.uzduotis2;

import java.util.List;

public class MoviesApp {

    public static void main(String[] args) {

        final List<Movies> movies = List.of(
                new Movies("The Godfather"),
                new Movies("Inception"),
                new Movies("Avatar")
        );

        movies.forEach(m -> System.out.println(m.getMovies()));
    }
}
