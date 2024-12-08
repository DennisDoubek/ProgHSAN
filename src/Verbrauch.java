public class Verbrauch {
    public static void main(String[] args) {
        double Sprit= 0.079;
        double Öl= 0.0003;

        System.out.print("Wie viele Kilometer sind sie gefahren? \nBitte hier eingeben: ");
        double Kilometer = new java.util.Scanner(System.in).nextDouble();


        double Kraftsoffverbrauch=Sprit*Kilometer;
        double Ölverbrauch=Öl*Kilometer;

                System.out.println("Bei einer Fahrtstrecke von: "+Kilometer+" Kilometern ist ihr Verbrauch von: " +
                        "\nKraftsoff="+Kraftsoffverbrauch+" Liter"+"\nÖl="+Ölverbrauch+" Liter");

                double Ölkosten=8.05;
                double Kraftstoffkosten= 1.92;
                double Kosten=Ölverbrauch*Ölkosten+Kraftsoffverbrauch*Kraftstoffkosten;
                double dvonÖl= Ölverbrauch*Ölkosten;
                double davonKraftstoff= Kraftsoffverbrauch*Kraftstoffkosten;

                System.out.println("Bei der angegebenen gefahrenen Strecke errechnen sich Kosten in Höhe von:\n"+Kosten+"€\n" +
                        "davon "+dvonÖl+"€ Öl\n"+"davon "+davonKraftstoff+"€ Kraftstoff");


                // S.185
    }
}
