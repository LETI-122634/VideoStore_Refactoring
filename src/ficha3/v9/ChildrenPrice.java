package ficha3.v9;

public class ChildrenPrice extends Price {
    @Override
    public double getAmount(int daysRented) {
        double result = 1.5;
        if (daysRented > 3)
            result += (daysRented - 3) * 1.5;
        return result;
    }
}
