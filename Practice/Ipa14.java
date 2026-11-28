package Practice;

import java.util.ArrayList;
import java.util.Scanner;

class Movie{
    private String movieName;
    private String company;
    private String genre;
    private int budget;
    public String getMovieName() {
        return movieName;
    }

    public Movie(String movieName, String company, String genre, int budget) {
        this.movieName = movieName;
        this.company = company;
        this.genre = genre;
        this.budget = budget;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public int getBudget() {
        return budget;
    }
    public void setBudget(int budget) {
        this.budget = budget;
    }
}

public class Ipa14 {
    public static Movie[] getMovieByGenre(Movie mov[], String searchGenre){
        ArrayList<Movie> mv = new ArrayList<>();

        for(Movie m : mov){
            if(m.getGenre().equalsIgnoreCase(searchGenre)){
                mv.add(m);
            }
        }

        return mv.toArray(new Movie[0]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Movie mov[] = new Movie[4];

        for(int i=0;i<4;i++){
            String movieName = sc.nextLine();
            String company = sc.nextLine();
            String genre = sc.nextLine();
            int budget = sc.nextInt(); sc.nextLine();

            mov[i] = new Movie(movieName, company, genre, budget);
        }

        String searchGenre = sc.nextLine();

        Movie mv[] = getMovieByGenre(mov, searchGenre);

        for(Movie m : mv){
            if(m.getBudget() > 80000000){
                System.out.println("High Budget Movie");
            } else{
                System.out.println("Low Budget Movie");
            }
        }

        sc.close();
    }
}
