package zad18_09_23;

import java.util.Arrays;
import java.util.Scanner;
// mozliwy blad
public class zad11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


         int liczbaZawodnikow;

        System.out.println("podaj liczbe uczestników");
         liczbaZawodnikow = scanner.nextInt();

        String[] imiona = new String[liczbaZawodnikow];
        double[] czasy = new double[liczbaZawodnikow];

         for(int i = 0; i <= liczbaZawodnikow ; i++) {
             System.out.println("podaj imie zawodnika" + i);
             imiona[i] = scanner.nextLine();
         }
        for(int i = 0; i <= liczbaZawodnikow; i++) {
             System.out.println("podaj czas zawodnika" + i);
            czasy[i] = scanner.nextDouble();
         }
        Arrays.sort(czasy);
         for(double czas : czasy){
             int index = Arrays.asList(czasy).indexOf(czas);
              String Zawodnik = imiona[index];
              int licznik = 1;
             System.out.println(licznik +" . "+ czas + " "+ Zawodnik );


         }


    }
}
