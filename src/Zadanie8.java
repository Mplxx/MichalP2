import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int roomNr1, roomNr2, roomNr3, roomNr4;
        int roomLenghtNr1, roomLenghtNr2, roomLenghtNr3, roomLenghtNr4;
        int roomWidthNr1, roomWidthNr2, roomWidthNr3, roomWidthNr4;

        /*******************************************************
        wprowadzenie danych
         ******************************************************/
        System.out.println("podaj dłogość i szerokość podanych pokoji");
        System.out.print("Pokój 1, długość: ");
        roomLenghtNr1 = scanner.nextInt();
        System.out.print("Pokój 1, szerokość: ");
        roomWidthNr1 =  scanner.nextInt();
        System.out.print("Pokój 2, długość: ");
        roomLenghtNr2 =  scanner.nextInt();
        System.out.print("Pokój 2, szerokość: ");
        roomWidthNr2 =  scanner.nextInt();
        System.out.print("Pokój 3, długość: ");
        roomLenghtNr3 =   scanner.nextInt();
        System.out.print("Pokój 3, szerokość: ");
        roomWidthNr3 =  scanner.nextInt();
        System.out.print("Pokój 4, długość: ");
        roomLenghtNr4 =   scanner.nextInt();
        System.out.print("Pokój 4, szerokość: ");
        roomWidthNr4 =  scanner.nextInt();
        /*******************************************************
         Obliczenia
         ******************************************************/
        roomNr1 = roomLenghtNr1 * roomWidthNr1;
        roomNr2 = roomLenghtNr2 * roomWidthNr2;
        roomNr3 = roomLenghtNr3 * roomWidthNr3;
        roomNr4 = roomLenghtNr4 * roomWidthNr4;

        int razem;
        razem = roomNr1 + roomNr2 + roomNr3 + roomNr4;
        int powierzchniaNaOsobe;
        powierzchniaNaOsobe = razem / 4;

        System.out.println("Powierzchnia pokoju 1 wynosi: " + roomNr1 + " pokoju 2: " + roomNr2 +
                " pokoju 3: " + roomNr3 + " i pokoju 4: " + roomNr4 + " daje razem: " + razem);
        System.out.println("powierzchnia na 1 osobę to: " + powierzchniaNaOsobe);
    }
}
