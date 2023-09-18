package zad18_09_23;
//mozliwy blad
import java.util.Scanner;
import java.util.Arrays;

public class zad7 {
    public static void main(String[] args) {
        int liczbaImion;

        Scanner scanner = new Scanner(System.in);
        System.out.println("ile chcesz podać imion");
        liczbaImion = scanner.nextInt();
        String[] tab = new String[liczbaImion];

        for(int i = 0; i <= liczbaImion; i++  ) {
            System.out.println("podaj  imie");
            tab[i] = scanner.nextLine();
        }
        Arrays.sort(tab, String.CASE_INSENSITIVE_ORDER);

        for (String imiona : tab) {
            System.out.println(imiona);
        }

    }
}

