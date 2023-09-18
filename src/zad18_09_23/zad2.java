package zad18_09_23;

import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerMiesiac;
        String miesiac;
        int dzien;
        int dwieOstatnieCyfryRoku;

        System.out.println("Sprawdzmy czy podana data jest magiczna, podaj wybrany przez siebie miesciac");
        miesiac = scanner.nextLine();






        switch( miesiac.toLowerCase()){
            case "styczeń":
                numerMiesiac = 1;
                break;
            case "luty":
                numerMiesiac = 2;
                break;
            case "marzec":
                numerMiesiac = 3;
                break;
            case "kwiecień":
                numerMiesiac = 4;
                break;
            case "maj":
                numerMiesiac = 5;
                break;
            case "czerwiec":
                numerMiesiac = 6;
                break;
            case "lipiec":
                numerMiesiac = 7;
                break;
            case "sierpień":
                numerMiesiac = 8;
                break;
            case "wrzesień":
                numerMiesiac = 9;
                break;
            case "październik":
                numerMiesiac = 10;
                break;
            case "listopad":
                numerMiesiac = 11;
                break;
            case "grudzień":
                numerMiesiac = 12;
                break;
            default:
                numerMiesiac = 0;
                System.out.println("nie ma takiego miesiąca lub napiasałeś go błędnie");
                System.exit(0);

        }
        System.out.println("podaj teraz dzień ");
        dzien = scanner.nextInt();
         switch (numerMiesiac){
             case 1:
            if(dzien >31){
                System.out.println("podany dzień nie istnieje");
                System.exit(0);
            }
            break;
             case 2:
                 if(dzien >28){
                     System.out.println("podany dzień nie istnieje");
                     System.exit(0);
                 }
                 break;
             case 3:
                 if(dzien >31){
                     System.out.println("podany dzień nie istnieje");
                     System.exit(0);
                 }
                 break;
             case 4:
                 if(dzien >30){
                     System.out.println("podany dzień nie istnieje");
                     System.exit(0);
                 }
                 break;
             case 5:
                 if(dzien >31){
                     System.out.println("podany dzień nie istnieje");
                     System.exit(0);
                 }
                 break;
             case 6:
                 if(dzien >30){
                     System.out.println("podany dzień nie istnieje");
                     System.exit(0);
                 }
                 break;
             case 7:
                 if(dzien >31){
                     System.out.println("podany dzień nie istnieje");
                     System.exit(0);
                 }
                 break;
             case 8:
                 if(dzien >31){
                     System.out.println("podany dzień nie istnieje");
                     System.exit(0);
                 }
                 break;
             case 9:
                 if(dzien >31){
                     System.out.println("podany dzień nie istnieje");
                     System.exit(0);
                 }
                 break;
             case 10:
                 if(dzien >30){
                     System.out.println("podany dzień nie istnieje");
                     System.exit(0);
                 }
             case 11:
                 if(dzien >31){
                     System.out.println("podany dzień nie istnieje");
                     System.exit(0);
                 }
                 break;
             case 12:
                 if(dzien >30){
                     System.out.println("podany dzień nie istnieje");
                     System.exit(0);
                 }
                 break;
             default:


        }
        System.out.println("podaj 2 ostatnie cyfry roku");
         dwieOstatnieCyfryRoku = scanner.nextInt();
         if(numerMiesiac * dzien == dwieOstatnieCyfryRoku){
             System.out.println("wow, odkryłeś magiczną datę");
         }
         else{
             System.out.println("nie tym razem");
         }
        }
    }

