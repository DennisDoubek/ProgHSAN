import java.util.Scanner;

public class Aufgabe6{
    public static void main(String[] args) {

        System.out.println("Wie lautet der erste Operand? \n");
        double OPeins = new Scanner(System.in).nextDouble();
        System.out.println("Wie lautet der Operator?\n");
        String OPerator = new Scanner(System.in).nextLine();
        System.out.println("Wie lautet der zweite Operand?");
        double OPzwei = new Scanner(System.in).nextDouble();

        double ergebnis;

        switch (OPerator) {
            case "+":
                ergebnis = OPeins + OPzwei;
                break;
            case "-":
                ergebnis = OPeins - OPzwei;
                break;
            case "*":
                ergebnis = OPeins * OPzwei;
                break;
            case "/":
                if (OPzwei != 0) {
                    ergebnis = OPeins / OPzwei;
                } else {
                    System.out.println("Division durch Null ist nicht erlaubt.");
                    return; // Beende das Programm, um eine Division durch Null zu verhindern
                }
                break;
            default:
                System.out.println("Kein gültiges Rechenzeichen");
                return; // Beende das Programm bei ungültigem Operator
        }

        System.out.println("Ergebnis: " + ergebnis);
    }
}

