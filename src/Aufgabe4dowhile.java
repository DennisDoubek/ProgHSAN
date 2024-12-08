import java.util.Scanner;

public class Aufgabe4dowhile {
    public static void main(String[] args) {
        double number = Math.random() * 9.0;
        int i = (int) number;


        System.out.print("Welche Zahl ist es von 0-9? \nBitte hier eingeben: ");
        int geratenezahl = new Scanner(System.in).nextInt();

        do {
            System.out.println("Das ist richtig die Zahl war " + i);
            break;
        }

        while (i == geratenezahl);



    }
}