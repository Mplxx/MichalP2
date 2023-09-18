package zad11_09_23;

import java.util.Scanner;
public class Zadanie10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        String firstName, middleName, lastName;

        System.out.println("podaj swoje 1 imię:");
        firstName = scanner.nextLine();
        System.out.println("podaj swoje 2 imię:");
        middleName = scanner.nextLine();
        System.out.println("podaj swoje nazwisko:");
        lastName = scanner.nextLine();
        


        char firstInitial = firstName.charAt(0);
        char middleinitial = middleName.charAt(0);
        char lastinitial = lastName.charAt(0);
        System.out.println("twoje iniciały to: "+firstInitial+ " "+ middleinitial+" "+lastinitial);
    }
}
