package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task5 {
    public static boolean isReasonable(List<Integer> list) {
        int res = 0;
        for(int t : list)
            res += t;
        return res == 0;
    }
    public static boolean isNormal(List<Integer> list) {
        for(int i = 0; i < list.size(); i++)
            for(int j = list.size(); j > i; j--)
                if(isReasonable(list.subList(i, j)))
                    return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), res = 0;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++)
            list.add(sc.nextInt());
         for(int i = 0; i < n; i++)
             for(int j = n; j > i; j--) {
                 if(isNormal(list.subList(i, j)))
                     res++;
             }
         System.out.println(res);
    }
}
