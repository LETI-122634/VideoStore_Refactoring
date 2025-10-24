package ficha3.vNew;

public abstract class Price {

    public enum Code { REGULAR, NEW_RELEASE, CHILDRENS, BLUERAY }

    // Cada tipo de Price calcula o valor do aluguer
    public abstract double getAmount(int daysRented);

    // Comportamento padrão para pontos de aluguer
    public int getFrequentRentalPoints(int daysRented) {
        return 1;
    }
}
