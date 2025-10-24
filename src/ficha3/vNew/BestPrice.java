package ficha3.vNew;

public class BestPrice extends Price {

    @Override
    public double getAmount(int daysRented) {
        // Exemplo: BluRay custa 4€ por dia, com desconto depois de 3 dias
        double result = 4 * daysRented;
        if (daysRented > 3)
            result -= (daysRented - 3) * 1.0; // pequeno desconto
        return result;
    }

    @Override
    public int getFrequentRentalPoints(int daysRented) {
        // Clientes ganham mais pontos com BluRay
        return (daysRented > 1) ? 3 : 2;
    }
}
