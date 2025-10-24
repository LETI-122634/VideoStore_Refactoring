package ficha3.v7;

public abstract class Price {
    public abstract double getAmount(int daysRented);

    public int getFrequentRentalPoints(int daysRented) {
        // comportamento padrão
        return 1;
    }
}
