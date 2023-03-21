package org.example;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0, n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
        int t = n * k / m, res = (t > 0) ? (t * m < n * k) ?  t + 1 : t : 1;
        System.out.println(res);
    }
}
