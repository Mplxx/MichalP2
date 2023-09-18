package zad11_09_23;

public class Zadanie6 {
    public static void main(String[] args) {



        int roomNr1, roomNr2, roomNr3, roomNr4;
        int roomLenghtNr1, roomLenghtNr2, roomLenghtNr3, roomLenghtNr4;
        int roomWidthNr1, roomWidthNr2, roomWidthNr3, roomWidthNr4;
        /*******************************************************
         Wprowadzenie danych
         ******************************************************/
        roomLenghtNr1 = 3;
        roomWidthNr1 = 4;
        roomLenghtNr2 = 3;
        roomWidthNr2 = 4;
        roomLenghtNr3 = 2;
        roomWidthNr3 = 3;
        roomLenghtNr4 = 2;
        roomWidthNr4 = 2;
        /*******************************************************
         Obliczenia powierzchni mieszkań
         ******************************************************/
        roomNr1 = roomLenghtNr1 * roomWidthNr1;
        roomNr2 = roomLenghtNr2 * roomWidthNr2;
        roomNr3 = roomLenghtNr3 * roomWidthNr3;
        roomNr4 = roomLenghtNr4 * roomWidthNr4;
        //powierzchnia jest obliczana na podstawie podania metrów liczby pomnożone to długości ścian
        int razem;
        razem = roomNr1 + roomNr2 + roomNr3 + roomNr4;
        System.out.println("Powierzchnia pokoju 1 wynosi: "+roomNr1+ " pokoju 2: "+roomNr2 +
                " pokoju 3: "+ roomNr3+ " i pokoju 4: " +roomNr4 +" daje razem: " + razem);
        int powierzchniaNaOsobe;
        powierzchniaNaOsobe = razem / 4;
        System.out.println("powierzchnia na 1 osobę to: "+ powierzchniaNaOsobe);


    }
}