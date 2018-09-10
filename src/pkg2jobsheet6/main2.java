/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2jobsheet6;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class main2 {

    static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    static int knapSack(int W, int wt[], int val[], int n) {
        int i, w;
        int[][] K = new int[n + 1][W + 1];

        // Build table K[][] in bottom up manner
        for (i = 0; i <= n; i++) {
            for (w = 0; w <= W; w++) {
                if (i == 0 || w == 0) {
                    K[i][w] = 0;
                } else if (wt[i - 1] <= w) {
                    K[i][w] = max(val[i - 1] + K[i - 1][w - wt[i - 1]],
                            K[i - 1][w]);
                } else {
                    K[i][w] = K[i - 1][w];
                }
            }
        }

        return K[n][W];
    }

    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);
        System.out.println("Berat Barang: ");
        int n = 5;
        int[] wt = new int[n];
        wt[0] = 4;
        wt[1] = 5;
        wt[2] = 2;
        wt[3] = 3;
        wt[4] = 7;
        for (int x = 0; x < wt.length; x++) {
            System.out.println(wt[x] + "kg ");
        }
        System.out.println("Harga Barang: ");
        int[] val = new int[n];
        val[0] = 5000;
        val[1] = 7000;
        val[2] = 2000;
        val[3] = 3000;
        val[4] = 10000;
        for (int x = 0; x < val.length; x++) {
            System.out.println("Rp." + val[x]);
        }
        System.out.println("Masukkan berat maksimal: ");
        int W = baca.nextInt();

        System.out.println("nilai maksimal yang dapat diterima kuli: " + knapSack(W, wt, val, n));
        baca.close();
    }
}
