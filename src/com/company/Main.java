package com.company;

import java.util.Scanner;

import static sun.swing.MenuItemLayoutHelper.max;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        int m = 0;
        for (int j = 0; j < n; j++) {
            a[j] = scan.nextInt();
        }
             for(int j=0;j<n; j++) {
               if (a[j] > m) {
                 m = a[j];
           }
              }
        System.out.println(m);

    }
}