package javabasic_02.day07_0731;

public class MovieTest {

    public static void main(String[] args) {

        Movie movie1 = new Movie();

        movie1.movieName = "Avatar";
        movie1.releaseDate = "2022.12.14";
        movie1.mainChar = "제이크 설리";
        movie1.genre = "액션";
        movie1.runningTime = 192;
        movie1.rating = 12;

        System.out.println(movie1.movieName);
        System.out.println(movie1.releaseDate);
        System.out.println(movie1.mainChar);
        System.out.println(movie1.genre);
        System.out.println(movie1.runningTime);
        System.out.println(movie1.rating + "세");



    }
}
