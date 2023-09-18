package zad18_09_23;

import java.util.Scanner;

public class zad21Podstawy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pieniadzeWyplacone;
        float pieniadzeWplacone;
        double rocznaStopaProcentowa;
        int iloscDoliczanychOdsetek;
        int ilosclat;

        /*****************************
         wczytywanie danych
         ****************************/
        System.out.println("podaj ile wpłaciłes na konto");
        pieniadzeWplacone = scanner.nextFloat();
        System.out.println("podaj ile stopę procentową");
        rocznaStopaProcentowa = scanner.nextInt();
        rocznaStopaProcentowa = rocznaStopaProcentowa / 100;
        System.out.println("podaj ilosc doliczanych odsetek");
        iloscDoliczanychOdsetek = scanner.nextInt();
        System.out.println("podaj ilosc lat jakie trzymałes to w banku");
        ilosclat = scanner.nextInt();

        pieniadzeWyplacone = pieniadzeWplacone * Math.pow((1 + rocznaStopaProcentowa / iloscDoliczanychOdsetek) , iloscDoliczanychOdsetek * ilosclat);
        System.out.printf("twoja kasa wynosi: %.2f", pieniadzeWyplacone);
    }
}
