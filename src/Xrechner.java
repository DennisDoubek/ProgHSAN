public class Xrechner {
    public static void main(String[] args) {

        System.out.println("Die Gleichung lautet: 3x2 - 8x + 4");

        int hochzahl=2;
        System.out.print("Was ist ihr X-Wert ? \nBitte hier eingeben: ");
        double x = new java.util.Scanner(System.in).nextDouble();

        double hochrechnung= (float) Math.pow(x,hochzahl);
        double vorberechnung= 3*hochrechnung;
        double Ergebnisrechnung= vorberechnung-8*x+4;
        System.out.println("Das Ergebnis lautet:\n" +  Ergebnisrechnung);

        System.out.println("");

    }
}
