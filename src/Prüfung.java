public class Prüfung {
    public static void main(String[] args) {
        int[] arrayToSort = new int[]{11, 31, 16, 9, 1, 3};

        int i = arrayToSort.length - 1;
        int temp;

        while (i > 0) {
            if (arrayToSort[i] < arrayToSort[i - 1]) {
                temp = arrayToSort[i];
                arrayToSort[i] = arrayToSort[i - 1];
                arrayToSort[i - 1] = temp;
                i = arrayToSort.length;
            }
            i--;
        }
        //hier ist die ergänzung

        System.out.println("Sorted array:");
        for (int element : arrayToSort) {
            System.out.print(element +"\t");
            System.out.println("\n");


        }
int n=4;
        int[][] matrix=new int[n][n];

        System.out.println(matrix);

    }
}

