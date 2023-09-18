package zad18_09_23;

import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double wzrost;
        double waga;
        double bmi;

        System.out.println("Obliczymy twoje BMI, proszę podaj swoją wagę w kg");
        waga = scanner.nextDouble();
        System.out.println("teraz podaj wzrost w cm");
        wzrost = scanner.nextDouble()/100;

        bmi = waga / Math.pow(wzrost, 2);

        System.out.printf("twoje BMI wynosi: %.2f",  bmi);
        if(bmi <=18.5) {
            System.out.println(",masz niedowagę.");
        }
        else if (bmi >= 25){
            System.out.println(",masz nadwagę");
        }
        else {
                    System.out.println(", masz dobrą wagę");
        }
            }
        }



