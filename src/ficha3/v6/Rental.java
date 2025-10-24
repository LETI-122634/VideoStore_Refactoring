package ficha3.v6;

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

    // ✅ Agora apenas delega para Movie
    public double getAmount() {
        return _movie.getAmount(_daysRented);
    }

    // ✅ Também delega para Movie
    public int getFrequentRentalPoints() {
        return _movie.getFrequentRentalPoints(_daysRented);
    }
}
