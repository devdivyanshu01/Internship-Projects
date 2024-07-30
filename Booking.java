                                                                                                                                                                                                            import java.time.LocalDateTime;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Showtime {
    private Movie movie;
    private LocalDateTime time;
    private int availableSeats;
    private List<Booking> bookings;

    public Showtime(Movie movie, LocalDateTime time, int availableSeats) {
        this.movie = movie;
        this.time = time;
        this.availableSeats = availableSeats;
        this.bookings = new ArrayList<>();
    }

    public Movie getMovie() {
        return movie;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void bookSeats(int numberOfSeats) {
        if (availableSeats >= numberOfSeats) {
            availableSeats -= numberOfSeats;
            bookings.add(new Booking(this, numberOfSeats));
            System.out.println("Booking successful!");
        } else {
            System.out.println("Not enough available seats!");
        }
    }
}

public class Booking { 
                                                                                                                                                                                         public class Booking {
    private Showtime showtime;
    private int numberOfSeats;

    public Booking(Showtime showtime, int numberOfSeats) {
        this.showtime = showtime;
        this.numberOfSeats = numberOfSeats;
    }

    public Showtime getShowtime() {
        return showtime;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }
}


public class Movie {
    private String title;
    private String genre;
    private int duration; // duration in minutes

    public Movie(String title, String genre, int duration) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getDuration() {
        return duration;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        List<Showtime> showtimes = new ArrayList<>();

        Movie movie1 = new Movie("Inception", "Sci-Fi", 148);
        Movie movie2 = new Movie("The Lion King", "Animation", 88);

        movies.add(movie1);
        movies.add(movie2);

        showtimes.add(new Showtime(movie1, LocalDateTime.of(2024, 7, 14, 18, 0), 100));
        showtimes.add(new Showtime(movie2, LocalDateTime.of(2024, 7, 14, 20, 0), 150));

        // Example booking
        showtimes.get(0).bookSeats(5);

        // Display available showtimes
        for (Showtime showtime : showtimes) {
            System.out.println("Movie: " + showtime.getMovie().getTitle());
            System.out.println("Time: " + showtime.getTime());
            System.out.println("Available Seats: " + showtime.getAvailableSeats());
            System.out.println();
        }
    }
}