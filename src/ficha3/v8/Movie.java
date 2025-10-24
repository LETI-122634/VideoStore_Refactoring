package ficha3.v8;

public class Movie {
    private String _title;
    private Price _price; // substitui o enum behavior por um objeto de estado

    // agora recebe um Price (injeção), evitando switch/condicionais
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

    // delega no objeto de estado (polimorfismo)
    public double getAmount(int daysRented) {
        return _price.getAmount(daysRented);
    }

    // também delega no objeto de estado
    public int getFrequentRentalPoints(int daysRented) {
        return _price.getFrequentRentalPoints(daysRented);
    }
}