package com.qinhan.demo;

public class Test {
    public static void main(String[] args) {
        Movie[] movies = new Movie[6];
        movies[0] = new Movie(1, "大话西游", 9.9, "周星驰");
        movies[1] = new Movie(2, "西游记", 8.9, "周星驰");
        movies[2] = new Movie(3, "龙猫", 7.9, "周星驰");
        movies[3] = new Movie(4, "夏洛特烦恼", 9.9, "沈腾");
        movies[4] = new Movie(5, "战狼", 9.9, "吴京");
        movies[5] = new Movie(6, "倩女幽魂", 9.9, "张国荣");

        MovieService ms = new MovieService(movies);

        ms.printAllMovies();
        ms.searchMovieById();

    }
}
