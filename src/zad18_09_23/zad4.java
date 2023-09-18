package zad18_09_23;

import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ocena1;
        int procentOcena1;
        int ocena2;
        int procentOcena2;
        int ocena3;
        int procentOcena3;
        int srednia;


        System.out.println("podaj 1 wynik z testu");
        procentOcena1 = scanner.nextInt();
        if(procentOcena1 >= 90 && procentOcena1 <= 100){
            ocena1 = 5;
        } else if (procentOcena1 >=80 && procentOcena1 <=89) {
            ocena1 = 4;
        } else if (procentOcena1 >=70 && procentOcena1 <=79) {
            ocena1 = 3;
        } else if (procentOcena1 >=60 && procentOcena1 <=69) {
            ocena1 = 2;
        }else{
            ocena1 = 1;
        }
        System.out.println("podaj 2 wynik z testu");
        procentOcena2 = scanner.nextInt();
        if(procentOcena2 >= 90 && procentOcena2 <= 100){
            ocena2 = 5;
        } else if (procentOcena2 >=80 && procentOcena2 <=89) {
            ocena2 = 4;
        } else if (procentOcena2 >=70 && procentOcena2 <=79) {
            ocena2 = 3;
        } else if (procentOcena2 >=60 && procentOcena2 <=69) {
            ocena2 = 2;
        }else{
            ocena2 = 1;
        }
        System.out.println("podaj 3 wynik z testu");
        procentOcena3 = scanner.nextInt();
        if(procentOcena3 >= 90 && procentOcena3 <= 100){
            ocena3 = 5;
        } else if (procentOcena3 >=80 && procentOcena3 <=89) {
            ocena3 = 4;
        } else if (procentOcena3 >=70 && procentOcena3 <=79) {
            ocena3 = 3;
        } else if (procentOcena3 >=60 && procentOcena3 <=69) {
            ocena3 = 2;
        }else{
            ocena3 = 1;
        }
        srednia = ((ocena1 + ocena2 + ocena3) / 3);
        System.out.println("twoja średnia to: " + srednia);

            
        }

    }

