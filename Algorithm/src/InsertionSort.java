import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int length = in.nextInt();
            int[] a = new int[length];
            for (int i = 0; i < length; i++)
                a[i] = in.nextInt();
            for (int i : a)
                System.out.print(i+" ");
            System.out.println("");
            insertionSort(a);

            for (int i : a)
                System.out.print(i+" ");
            System.out.println("");
        }

    }

    private static void insertionSort(int[] a) {
        for (int j = 1; j < a.length; j++) {
            int key = a[j];
            //insert
            int i = j - 1;
            while (i >= 0 && a[i] > key) {
                a[i+1] = a[i];
                i--;
            }
            a[i+1] = key;
        }
    }
}
