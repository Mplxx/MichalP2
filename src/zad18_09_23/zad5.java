package zad18_09_23;

import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double ciezar;
        double masa;
        double przelicznik = 9.8;

        System.out.println("podaj mase w kg");
        masa = scanner.nextDouble();

        ciezar = masa * przelicznik;

        if(ciezar >= 1000){
            System.out.println("przedmiot jest za cieżki: " + ciezar);
        } else if (ciezar <= 10) {
            System.out.println("przedmiot jest za lekki: " + ciezar);
        }else {
            System.out.printf("ciezar wynosi: %.2f ", ciezar );
        }

    }
}
