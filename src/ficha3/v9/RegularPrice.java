package ficha3.v9;

public class RegularPrice extends Price {
    @Override
    public double getAmount(int daysRented) {
        double result = 2;
        if (daysRented > 2)
            result += (daysRented - 2) * 1.5;
        return result;
    }
}
