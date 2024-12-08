public class PIRechner {
    public static void main(String[] args) {
        int iterations = 1000000000; // Anzahl der Iterationen für die Genauigkeit

        double piApproximation = calculatePi(iterations);

        System.out.println("Approximation von Pi nach " + iterations + " Iterationen: " + piApproximation);
    }

    public static double calculatePi(int iterations) {
        double pi = 0.0;

        for (int i = 0; i < iterations; i++) {
            // Die Leibniz-Reihe: Pi = 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - ...)
            double term = 1.0 / (2 * i + 1);
            if (i % 2 == 0) {
                pi += term;
            } else {
                pi -= term;
            }
        }

        return 4 * pi;
    }
}
