package zad18_09_23;

import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczbaArabska;
        String liczbaRzymska = "";
        System.out.println("podaj liczbę arabską");
        liczbaArabska = scanner.nextInt();

        switch (liczbaArabska){
            case 1:
                liczbaRzymska = "I";
                break;
            case 2:
                liczbaRzymska = "II";
                break;
            case 3:
                liczbaRzymska = "III";
                break;
            case 4:
                liczbaRzymska = "IV";
                break;
            case 5:
                liczbaRzymska = "V";
                break;
            case 6:
                liczbaRzymska = "VI";
                break;
            case 7:
                liczbaRzymska = "VII";
                break;
            case 8:
                liczbaRzymska = "VIII";
                break;
            case 9:
                liczbaRzymska = "IX";
                break;
            case 10:
                liczbaRzymska = "X";
                break;
            default:
                System.out.println("błąd: podana liczba wykracza poza zakres");
        }
        System.out.println("Podana przez Ciebie liczba ma taki odpowiednik rzymski: " +liczbaRzymska);
    }
}
