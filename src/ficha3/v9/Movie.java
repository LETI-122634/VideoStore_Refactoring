package ficha3.v9;

public class Movie {
    private String _title;
    private Price _price; // Objeto de estado (em vez de enum)

    public Movie(String title, Price price) {
        _title = title;
        _price = price;
    }

    public Price getPrice() {
        return _price;
    }

    public void setPrice(Price price) {
        _price = price;
    }

    public String getTitle() {
        return _title;
    }

    // Delegação para o objeto Price (polimorfismo)
    public double getAmount(int daysRented) {
        return _price.getAmount(daysRented);
    }

    public int getFrequentRentalPoints(int daysRented) {
        return _price.getFrequentRentalPoints(daysRented);
    }
}
