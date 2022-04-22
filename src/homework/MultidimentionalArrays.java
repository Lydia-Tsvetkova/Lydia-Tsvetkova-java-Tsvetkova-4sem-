package homework;

import java.util.Arrays;

public class MultidimentionalArrays {
    public static void printTable(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\n");
        }
    }

    public static void printTableAligned(int[][] a) {
        for (int r = 0; r < a.length; r++) {
            for (int c = 0; c < a[r].length; c++)
                System.out.print(a[r][c] + " ");
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int[] a = {0, 1, 2, 3, 45, 678, 9000};
        int[][] b = {{10, 1, 1000000, 44, 4244}, {111, 432, 44}, {5, 27, 1, 33, 123523, 6}};
        printTable(a);
        System.out.print("\n");
        printTableAligned(b);
    }
}


