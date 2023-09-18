package zad18_09_23;

import java.util.Scanner;

public class zad8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczbaZakupionychProduktow;
        int cenaProduktu = 99;
        double cenaPoRabatach;
        double rabat;

        System.out.println("podaj liczbę produktów jakie kupiłeś");
        liczbaZakupionychProduktow = scanner.nextInt();

        if(liczbaZakupionychProduktow >= 10 && liczbaZakupionychProduktow <= 19){
            rabat = 0.2; //20%
        } else if (liczbaZakupionychProduktow >= 20 && liczbaZakupionychProduktow <= 49) {
            rabat = 0.3; //30%
        } else if (liczbaZakupionychProduktow >= 50 && liczbaZakupionychProduktow <= 99) {
            rabat = 0.4; //40%
        } else if (liczbaZakupionychProduktow >= 100) {
            rabat = 0.5; //50%
        }else {
            rabat = 1; // 0%, po pomnożeniu cena się nie zmieni
        }
        cenaPoRabatach = liczbaZakupionychProduktow * cenaProduktu * rabat;
        rabat =  rabat * 100; // do wypisu
        if(liczbaZakupionychProduktow < 10){
            System.out.println("twoja cena to: "+cenaPoRabatach +"  ,bez rabatów ");
        }else {
            System.out.printf("twój rabat to %.2f procent, zaś finalna cena to %.2f", rabat, cenaPoRabatach);
        }
        }

    }

