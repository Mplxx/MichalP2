package zad18_09_23;

import java.util.Scanner;

public class zad9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double cenaZa500KM = 0;
        double cenaZa1KM, cenaWysylki;
        double wagaPrzesylki;
        double iloscKM;

        System.out.println("podaj wagę swojej przysyłki w kg");
        wagaPrzesylki = scanner.nextDouble();

        if( wagaPrzesylki > 0 && wagaPrzesylki < 1){
            cenaZa500KM = 1.10;
        } else if (wagaPrzesylki > 1 && wagaPrzesylki <= 3) {
            cenaZa500KM = 2.20;
        } else if (wagaPrzesylki > 3 && wagaPrzesylki <= 5) {
            cenaZa500KM = 3.70;
        } else if (wagaPrzesylki > 5){
            cenaZa500KM = 3.80;
        }else{
            System.out.println("waga nie może być ujemna lub zerowa");
            System.exit(0);
        }
        System.out.println("podaj ilość kilometrów");
        iloscKM = scanner.nextDouble();
        cenaZa1KM = cenaZa500KM / 500;
        cenaWysylki = cenaZa1KM * iloscKM;

        System.out.printf("cena wysyłki to: %.2f",cenaWysylki);

    }
}
