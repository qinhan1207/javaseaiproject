package com.qinhan.demo;

import java.util.Scanner;

public class MovieService {

    private Movie[] movies;

    public MovieService() {
    }

    public MovieService(Movie[] movies){
        this.movies = movies;
    }


    public void printAllMovies() {
        for (int i = 0; i < movies.length; i++) {
            System.out.println(movies[i]);
        }
    }

    public void searchMovieById() {
        System.out.println("请输入要查询的电影ID");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        for (Movie movie:movies){
            if (movie.getId()==id){
                System.out.println(movie);
            }
        }
        System.out.println("没有找到该电影");
    }
}
