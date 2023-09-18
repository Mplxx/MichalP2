package zad11_09_23;

public class Zadanie7 {
    public static void main(String[] args) {


     double procentSprzedazy= 0.62;
     double zysk = 4.6; //wartość ta to 4,6MLN (4 600 000)

    double wygerenowanaSprzedaz = zysk / procentSprzedazy;

     System.out.println("Wygenerowana Sprzedaż to: " +  System.out.format("%.2f%n", wygerenowanaSprzedaz) );

}
}
