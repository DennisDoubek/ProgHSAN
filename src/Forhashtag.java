public class Forhashtag {
    public static void main(String[] args) {

        {

            for (int p = 1; p < 6; ) {        //hier wird die Länge nach unten inseriert
                for (int q = 1; q <5; ) {     // hier wird die länge nach rechts inseriert

                    System.out.print("#");     // für p kleiner gleich 5 wird ein # gezeichnet
                    ++q;
                }
                System.out.println("#");      // für q kleiner gleich 5 wird ein # gezeichnet
                ++p;
            }
        }


        int rows = 5; // Anzahl der Zeilen

        for (int i = 0; i < rows; i++) {
            // Schleife für die '#' Zeichen
            for (int j = 0; j <= i; j++) {
                System.out.print("#");
            }

            // Schleife für die '.' Zeichen
            for (int k = i + 1; k < rows; k++) {
                System.out.print(".");
            }

            System.out.println(); // Neue Zeile für jede Zeile des Musters
        }

    }
}
