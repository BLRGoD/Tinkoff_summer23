package org.example;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), counter = 0, j = 0;
        char[] sArr = sc.next().toCharArray();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n - 3; i++) {
            Set<Character> tmp = new HashSet<>();
            counter = 0;
            j = i;
            while(tmp.size() < 4) {
                tmp.add(sArr[j]);
                counter++;
                j++;
                if(j >= n && tmp.size() < 4) {
                    counter = 0;
                    break;
                }
            }
            list.add(counter);
        }
        try {
            int min = list
                    .stream()
                    .mapToInt(v -> v)
                    .filter(v -> v > 0)
                    .min().orElseThrow(NoSuchElementException::new);
            System.out.println(min);
        }
        catch(Exception e) {
            System.out.println(-1);
        }
    }
}
