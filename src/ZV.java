import java.text.DecimalFormat;
public class ZV{
        public static void main(String[] args) {
        // Anfangskapital und Anzahl der Runden
        double anfangskapital = 1800.00;
        int runden = 7;

        // Array zur Speicherung der Zinsen pro Runde
        double[] zinsen = new double[runden];

        // Format für die Ausgabe von Euro-Beträgen
        DecimalFormat df = new DecimalFormat("0.00");

        // Variable für den gesamt Gewinn
        double gesamtgewinn = 0.0;

        // Schleife für die 7 Runden
        System.out.println("Anfangskapital Zufallszahl Zins Neues Kapital");
        for (int i = 0; i < runden; i++) {
            // Zufallszahl generieren
            int zufallszahl = (int) (Math.random() * 100);

            // Zinssatz bestimmen
            double zinssatz = zufallszahl < 50 ? 4.0 : 8.0;

            // Zins berechnen
            double zins = anfangskapital * (zinssatz / 100);
            zinsen[i] = zins;

            // Neues Kapital berechnen
            double neuesKapital = anfangskapital + zins;

            // Ausgabe der aktuellen Runde
            System.out.println(df.format(anfangskapital) + " " +
                    zufallszahl + " " +
                    zinssatz + "% " +
                    df.format(neuesKapital));

            // Neues Kapital wird zum Anfangskapital für die nächste Runde
            anfangskapital = neuesKapital;

            // Zinsen zum Gesamtgewinn addieren
            gesamtgewinn += zins;
        }

        // Ausgabe des Gesamtgewinns
        System.out.println("Gesamtgewinn: " + df.format(gesamtgewinn));
    }
}
