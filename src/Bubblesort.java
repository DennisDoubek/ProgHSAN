import java.util.Arrays;

public class Bubblesort {
        public static void main(String[] args) {
            int[] arrayToSort = {11, 31, 16, 9, 1, 13};

            System.out.println("Unsortiertes Array: " + Arrays.toString(arrayToSort));

            // Implementiere Bubble Sort
            int n = arrayToSort.length;
            for (int i = n - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (arrayToSort[j] > arrayToSort[j + 1]) {
                        // Tausche die Elemente an den Positionen j und j+1
                        int tmp = arrayToSort[j];
                        arrayToSort[j] = arrayToSort[j + 1];
                        arrayToSort[j + 1] = tmp;


                    }
                }
            }

            // Ausgabe des sortierten Arrays
            System.out.println("Sortiertes Array: " + Arrays.toString(arrayToSort));
        }
    }

