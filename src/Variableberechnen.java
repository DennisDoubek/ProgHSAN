public class Variableberechnen {
    public static void main(String[] args) {

        double x;

        System.out.print("Welchen Wert hat X? \nBitte hier eingeben: ");
        double IX = new java.util.Scanner(System.in).nextDouble();
        double ersteVariable= 3.0*IX;
        double zweiteVariable=8.0*IX;
        double dritteVariable=4.0;
        double hochZahl=2.0;
        double ergebnisVorrechnung= Math.pow(ersteVariable,hochZahl);
        double ergebnis=ergebnisVorrechnung-zweiteVariable+dritteVariable;



        System.out.println(ergebnis);
    }
}
