public class BruttoNetto {
    public static void main(String[] args) {
        System.out.print("Was ist der Brutto-Preis? \nBitte hier eingeben: ");
        double Brutto = new java.util.Scanner(System.in).nextDouble();


        double nettopreisberechnung= Brutto*0.19;
        double nettopreis= Brutto-nettopreisberechnung;

        double steuern= nettopreisberechnung;

        System.out.println("Der Netto-Preis des Produktes beträgt: \n" + nettopreis +"€" +"\nda "+nettopreisberechnung+ "€ Steuern sind.");

    }
}
