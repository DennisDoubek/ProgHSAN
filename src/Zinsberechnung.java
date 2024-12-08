public class Zinsberechnung {
    public static void main(String[] args) {

        System.out.print("Wie hoch ist das investierte Kapital? \nBitte hier eingeben: ");
        float kapital = new java.util.Scanner(System.in).nextFloat();
        System.out.print("Ihr Kapital beträgt " + kapital + " € zu welchem Zinssatz? \nBitte hier eingeben:");
        double zins = new java.util.Scanner(System.in).nextDouble();
        System.out.print("Wie lange ist ihre Laufzeit? \nBitte hier eingeben: ");
        int laufzeitx = new java.util.Scanner(System.in).nextInt();
        double vorberechnung = 1+(zins/100);
        float laufzeit= (float) Math.pow(vorberechnung,laufzeitx);
        float rechnung= kapital*laufzeit*100;
        System.out.println( "Ihr Kapital beträgt " + kapital + "  \nEs wird mit " + zins + " % über "+ laufzeitx + " jahre verzinst."
                + " \nIhr Guthaben beträgt dann " + Math.round(rechnung)/100.00
                + "€");
    }
}
