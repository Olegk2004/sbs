package com.company;


public class Main {

    public static void main(String[] args) {
        int[][] a = new int[25][4];
        int q = 1;
        for (int i = 0; i < 25; i++) {
            for (int j = 0; j < 4; j++) {
                if (i % 2 == 0) {
                    a[i][j] = q;
                } else {
                    a[i][3 - j] = q;
                }
                q++;
            }
        }
        for (int i = 0; i < 25; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
