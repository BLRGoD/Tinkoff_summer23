package org.example;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] h = new int[4];
        String res = "YES";
        for(int i = 0; i < 4; i++)
            h[i] = sc.nextInt();
        if(h[1] > h[0]) {
            for (int i = 1; i < 3; i++)
                if (h[i] > h[i + 1]) {
                    res = "NO";
                    break;
                }
        }
        else
            for(int i = 1; i < 2; i++)
                if(h[i] < h[i + 1]) {
                    res = "NO";
                    break;
                }
        System.out.println(res);
    }
}