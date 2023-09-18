package zad11_09_23;

import java.util.Scanner;
public class Zadanie23 {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int plantsNumber;
        int rowLenght;
        int fenceLenght;
        int betweenPlantsDistance;
        /**********************************
         wczytanie
         **********************************/
        System.out.println("podaj długość :");
        rowLenght = scanner.nextInt();
        System.out.println("podaj długość płotu");
        fenceLenght = scanner.nextInt();
        System.out.println("podaj odstęp");
        betweenPlantsDistance = scanner.nextInt();



        /**********************************
          obliczenia
         **********************************/
        plantsNumber = (rowLenght - 2 * fenceLenght) / betweenPlantsDistance;

        System.out.println("potrzeba: " + plantsNumber);
    }
}
