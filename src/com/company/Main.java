package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        int c = a.size() + b.size();
        ArrayList<Integer> m = new ArrayList<>();
        int ap = 0;
        int bp = 0;

        for (int i = 0; i < c; i++) {
            if (ap >= a.size()) m.add(b.get(bp++));
            else if (bp >= b.size()) m.add(a.get(ap ++));
            else {
                if (a.get(ap) < b.get(bp)) m.add(a.get(ap++));
                else m.add(b.get(bp++));
            }
        }
        return m;
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3, 5, 8, 13, 21, 34, 55, 89));
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(2, 4, 8, 16, 32, 64, 128, 256, 512, 1024));
        ArrayList<Integer> m = merge(a, b);
        for (int i : m) System.out.println(i);
    }
}
