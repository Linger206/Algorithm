import java.util.Scanner;

public class MergeSort {
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

            mergeSort(a, 0, a.length-1);

            for (int i : a)
                System.out.print(i+" ");
            System.out.println("");
        }
    }

    private static void merge(int[] a, int p, int q, int r) {

        int m = q - p + 1;  //l[0...m-1]
        int n = r - q;  //r[0...n-1]
        int[] la = new int[m];
        int[] ra = new int[n];
        System.arraycopy(a, p, la, 0, m);
        System.arraycopy(a, q+1, ra, 0, n);

        int i = 0, j = 0, k = p;
        while( k < r && i < m && j < n) {
            if (la[i] <= ra[j]) {
                a[k] = la[i];
                i++;
            } else {
                a[k] = ra[j];
                j++;
            }
            k++;
        }
        while (i < m) { //ra is empty
            a[k++] = la[i++];
        }
        while (j < n) { //la is empty
            a[k++] = ra[j++];
        }
    }

    private static void mergeSort(int[] a, int p, int r) {
        if (p < r) {
            int q = (p+r) / 2;
            mergeSort(a, p, q);
            mergeSort(a, q+1, r);
            merge(a, p, q, r);
        }
    }
}
