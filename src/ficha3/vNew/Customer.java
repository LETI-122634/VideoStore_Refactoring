package ficha3.vNew;

import java.util.Vector;

public class Customer {
    private String _name;
    private Vector<Rental> _rentals = new Vector<Rental>();

    public Customer(String name) {
        _name = name;
    }

    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }

    public String getName() {
        return _name;
    }

    // Relatório em formato texto (console)
    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;

        String result = "Rental Record for " + getName() + "\n";

        for (Rental each : _rentals) {
            frequentRenterPoints += each.getFrequentRentalPoints();
            result += "\t" + each.getMovie().getTitle() + "\t" + each.getAmount() + "\n";
            totalAmount += each.getAmount();
        }

        result += "Amount owed is " + totalAmount + "\n";
        result += "You earned " + frequentRenterPoints + " frequent renter points";
        return result;
    }

    // Relatório em formato HTML
    public String htmlStatement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;

        String result = "<h1>Rentals for <em>" + getName() + "</em></h1><p>\n";

        for (Rental each : _rentals) {
            frequentRenterPoints += each.getFrequentRentalPoints();
            result += each.getMovie().getTitle() + ": " + each.getAmount() + "<br>\n";
            totalAmount += each.getAmount();
        }

        result += "<p>You owe <em>" + totalAmount + "</em><p>\n";
        result += "On this rental you earned <em>" + frequentRenterPoints + "</em> frequent renter points<p>";
        return result;
    }
}
