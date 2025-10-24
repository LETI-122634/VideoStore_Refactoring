package ficha3.v7;

public abstract class Price {
    public enum Code { REGULAR, NEW_RELEASE, CHILDRENS }

    public abstract double getAmount(int daysRented);

    public int getFrequentRentalPoints(int daysRented) {
        // comportamento padrão
        return 1;
    }
}
