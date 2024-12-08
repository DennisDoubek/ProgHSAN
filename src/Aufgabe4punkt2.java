public class Aufgabe4punkt2 {
    public static void main(String[] args) {
        System.out.print("Welche Variable soll für X eingesetzt werden? \nBitte hier eingeben: ");
        double Variable = new java.util.Scanner(System.in).nextDouble();


        double Ergebnis= Variable*Variable*3-Variable*8+4;

        System.out.println("Das Ergbnis ist"+" "+Ergebnis);


    }
}
