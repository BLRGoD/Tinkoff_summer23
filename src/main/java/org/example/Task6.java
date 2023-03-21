package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), s =sc.nextInt();
        List<Integer> Li = new ArrayList<>();
        List<Integer> Ri = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            Li.add(sc.nextInt());
            Ri.add(sc.nextInt());
        }

    }
}
