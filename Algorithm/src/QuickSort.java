import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int length = in.nextInt();
            int[] a = new int[length];
            for (int i = 0; i < length; i++)
                a[i] = in.nextInt();
            for (int i : a)
                System.out.print(i + " ");
            System.out.println("");

            quickSort(a, 0, a.length - 1);

            for (int i : a)
                System.out.print(i + " ");
            System.out.println("");
        }
    }

    private static int partition(int[] a, int p, int r) {
        int key = a[r];
        int i = p - 1;
        for (int j = p; j < r; j++) {
            if (a[j] <= key) {
                i++;
                int temp = a[i];
                a[i] =  a[j];
                a[j] = temp;
            }
        }
        int temp = a[i+1];
        a[i+1] =  a[r];
        a[r] = temp;
        return i+1;
    }

    private static void quickSort(int[] a, int p, int r) {
        if (p < r) {
            int q = partition(a, p, r);
            quickSort(a, p, q-1);
            quickSort(a, q+1, r);
        }
    }
}
