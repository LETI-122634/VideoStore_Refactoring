package ficha3.vNew;

/***

 Filename: Main.java
 @author fba 6 de Mai de 2013*/
public abstract class Main
{

    /***

     @param args*/
    public static void main(String[] args){
        Customer who = new Customer("Barack Obama");
        Movie m1 = new Movie("Life of Amalia", new RegularPrice());
        Movie m2 = new Movie("Peter Pan", new ChildrenPrice());
        Movie m3 = new Movie("Donna del Lago", new NewReleasePrice());

        who.addRental(new Rental(m1, 1));
        who.addRental(new Rental(m2, 2));
        who.addRental(new Rental(m3, 3));


        Price bluRay = new BestPrice();
        Movie m = new Movie("Oppenheimer", bluRay);

        System.out.println("Preço: " + m.getAmount(4));
        System.out.println("Pontos: " + m.getFrequentRentalPoints(4));


        System.out.println(who.statement());

    }

}