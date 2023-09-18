package zad18_09_23;

import java.util.Scanner;

public class zad6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczbaSekund;
        int dni = 0;
        int godzin = 0;
        int minut = 0;
        int sekund = 0;

        System.out.println("podaj ilość sekund");
        liczbaSekund = scanner.nextInt();

       while (liczbaSekund > 0){

           boolean sprDni = (liczbaSekund >= 86400);
           boolean sprGodz = (liczbaSekund >=3600 && liczbaSekund < 86400);
           boolean sprMin = (liczbaSekund >=60 && liczbaSekund < 3600);

            if(sprDni){
                dni++;
                liczbaSekund = liczbaSekund - 86400;


            } else if (sprGodz) {
                godzin++;
                liczbaSekund = liczbaSekund - 3600;

            } else if (sprMin) {
                minut++;
                liczbaSekund = liczbaSekund - 60;

            }else{
                sekund = liczbaSekund;
                break;
            }
        }
        System.out.printf("to jest: %d dni, %d godzin, %d minut, %d sekund", dni, godzin, minut, sekund);
    }
}
