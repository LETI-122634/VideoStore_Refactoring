package ficha3.v8;

public abstract class Price {
    // enum movida de Movie para cá
    public enum Code { REGULAR, NEW_RELEASE, CHILDRENS }

    public abstract double getAmount(int daysRented);

    public int getFrequentRentalPoints(int daysRented) {
        // comportamento padrão
        return 1;
    }
}
