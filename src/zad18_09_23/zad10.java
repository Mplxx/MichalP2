package zad18_09_23;

import java.util.Scanner;

public class zad10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double iloscKalorii, iloscKaloriiWTluszczu;
        double gramyTluszczu;
        double procentKaloriiTluszczu;
        System.out.println("podaj ilosc kalorii w danych produkce");
        iloscKalorii = scanner.nextDouble();
        System.out.println("podaj ilość tłuszczu w gramach");
        gramyTluszczu = scanner.nextDouble();

        iloscKaloriiWTluszczu = gramyTluszczu * 9;
        procentKaloriiTluszczu =   iloscKaloriiWTluszczu / iloscKalorii;

        if(iloscKalorii < iloscKaloriiWTluszczu){
            System.out.println("nie może być wiecej kalorii z tłusczu niż suma wszystkich kalorii");
            System.exit(0);
        }
        if(procentKaloriiTluszczu < 0.3){
            System.out.printf("produkt jest niskotłusczowy i zawiera: %.2f  kalorii tłuszczu ", procentKaloriiTluszczu);
        }else {
            System.out.printf("produkt zawiera %.2f kalorii z tłuszczu", procentKaloriiTluszczu);
        }
    }
}
