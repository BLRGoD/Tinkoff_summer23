package org.example;

import java.util.*;

public class Task4 {

    public static boolean isBoring(List<Integer> list) {
        int max = 0, m = 0, counter = 1, once = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int temp : list) {
            if (!map.containsKey(temp))
                map.put(temp, 0);
            map.put(temp, map.get(temp) + 1);
        }
        List<Integer> arr = new ArrayList<>(map.values());

        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == 1) once++;
            if (max < arr.get(i)) {
                max = arr.get(i);
                m = i;
            }
        }
        for(int i = 0; i < arr.size(); i++) {
            int temp = arr.get(i);
            if(temp != max && temp != 0) {
                if(counter == 0)
                    return false;
                if(temp == 1 && once == 1) {
                    arr.set(i, 0);
                }
                else {
                    max--;
                    arr.set(m, arr.get(m) - 1);
                }
                counter--;
                i = -1;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), max = 2;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++)
            list.add(sc.nextInt());
        for(int i = 0; i < n - 3; i++)
            for(int j = 0; j < n - i - 3; j++)
                if(isBoring(list.subList(i, n - j)) && n - j - i > max) {
                    max = n - j - i;
                    break;
                }
        System.out.println(max);
    }
}
