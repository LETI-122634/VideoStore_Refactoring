package ficha3.v9;

public class Rental {
    private Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }

    // Delegação para Movie
    public double getAmount() {
        return _movie.getAmount(_daysRented);
    }

    public int getFrequentRentalPoints() {
        return _movie.getFrequentRentalPoints(_daysRented);
    }
}
