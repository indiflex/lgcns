package com.lgcns;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] iarr = {3, 4, 5, 2, 1};
        pa(iarr);
        Arrays.sort(iarr, 1, 4);
        pa(iarr);
        Arrays.sort(iarr);
        System.out.println(Arrays.toString(iarr));

    }

    private static void pa(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
