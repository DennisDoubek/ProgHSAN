public class Aufgabe5 {
    public static void main(String[] args) {


        System.out.println("Wie lautet der erste Opperand? \n");
        double OPeins = new java.util.Scanner(System.in).nextDouble();
        System.out.println("Wie lautet der Operator?\n");
        String OPerator = new java.util.Scanner(System.in).nextLine();
        System.out.println("Wie lautet der zweite Opperand");
        double OPzwei = new java.util.Scanner(System.in).nextDouble();


        if (OPerator.equals("+")) {
            System.out.println( OPeins + OPzwei);
        } else if (OPerator.equals("-")) {
            System.out.println(OPeins - OPzwei);
        } else if (OPerator.equals("*")) {
            System.out.println(OPeins * OPzwei);
        } else if (OPerator.equals("/")) {
            if (OPzwei != 0) {
                System.out.println(OPeins / OPzwei);
            } else {
                System.out.println("Division durch Null ist nicht erlaubt.");
            }
        } else {
            System.out.println("Kein gültiges Rechenzeichen");
        }
    }
}
