package ficha3.v6;

public class Movie {
    public enum Code { REGULAR, NEW_RELEASE, CHILDRENS }

    private String _title;
    private Code _priceCode;

    public Movie(String title, Code priceCode) {
        _title = title;
        _priceCode = priceCode;
    }

    public Code getPriceCode() {
        return _priceCode;
    }

    public void setPriceCode(Code priceCode) {
        _priceCode = priceCode;
    }

    public String getTitle() {
        return _title;
    }

    // ✅ Lógica de cálculo movida de Rental (antes causava Feature Envy)
    public double getAmount(int daysRented) {
        double result = 0;
        switch (_priceCode) {
            case REGULAR:
                result += 2;
                if (daysRented > 2)
                    result += (daysRented - 2) * 1.5;
                break;
            case NEW_RELEASE:
                result += daysRented * 3;
                break;
            case CHILDRENS:
                result += 1.5;
                if (daysRented > 3)
                    result += (daysRented - 3) * 1.5;
                break;
        }
        return result;
    }

    // ✅ Também movido de Rental
    public int getFrequentRentalPoints(int daysRented) {
        // padrão: 1 ponto
        if ((_priceCode == Code.NEW_RELEASE) && daysRented > 1)
            return 2;
        return 1;
    }
}
