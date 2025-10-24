package ficha3.v5;

import java.util.Vector;

public class Customer {
    private String _name;
    private Vector<Rental> _rentals = new Vector<Rental>();

    public Customer(String name) {
        this._name = name;
    }

    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }

    public String getName() {
        return _name;
    }

    public String statement() {
        String result = "Rental Record for " + getName() + "\n";

        for (Rental each : _rentals) {
            result += "\t" + each.getMovie().getTitle() + "\t" + each.getAmount() + "\n";
        }

        result += "Amount owed is " + getTotalAmount() + "\n";
        result += "You earned " + getTotalFrequentRenterPoints() + " frequent renter points";
        return result;
    }

    public double getTotalAmount() {
        double total = 0;
        for (Rental each : _rentals) {
            total += each.getAmount();
        }
        return total;
    }

    public int getTotalFrequentRenterPoints() {
        int points = 0;
        for (Rental each : _rentals) {
            points += each.getFrequentRenterPoints();
        }
        return points;
    }
}
