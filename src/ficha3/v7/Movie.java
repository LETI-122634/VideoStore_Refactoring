package ficha3.v7;

public class Movie {
    private String _title;
    private Price _price; // substitui o enum behavior por um objeto de estado

    public Movie(String title, Price.Code priceCode) {
        _title = title;
        setPriceCode(priceCode);
    }

    public Price.Code getPriceCode() {
        if (_price instanceof RegularPrice) return Price.Code.REGULAR;
        if (_price instanceof NewReleasePrice) return Price.Code.NEW_RELEASE;
        if (_price instanceof ChildrenPrice) return Price.Code.CHILDRENS;
        throw new IllegalStateException("Unknown Price type");
    }

    public void setPriceCode(Price.Code priceCode) {
        switch (priceCode) {
            case REGULAR:
                _price = new RegularPrice();
                break;
            case NEW_RELEASE:
                _price = new NewReleasePrice();
                break;
            case CHILDRENS:
                _price = new ChildrenPrice();
                break;
        }
    }

    public String getTitle() {
        return _title;
    }

    // substitui o switch por polimorfismo
    public double getAmount(int daysRented) {
        return _price.getAmount(daysRented);
    }

    // também delega no objeto de estado
    public int getFrequentRentalPoints(int daysRented) {
        return _price.getFrequentRentalPoints(daysRented);
    }
}
