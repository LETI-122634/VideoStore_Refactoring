package ficha3.v8;

public class NewReleasePrice extends Price {
    @Override
    public double getAmount(int daysRented) {
        return daysRented * 3;
    }

    @Override
    public int getFrequentRentalPoints(int daysRented) {
        return (daysRented > 1) ? 2 : 1;
    }
}
