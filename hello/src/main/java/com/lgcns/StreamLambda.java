package com.lgcns;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamLambda {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("JS", "TS", "Java", "JS", "Python", "JS");
        List<String> collect = list.stream().filter(s -> s.length() > 2).collect(Collectors.toList());
        List<String> collect2 = list.stream().filter(s -> s.length() > 2).toList();

        Map<Integer, List<String>> collect1 = list.stream().collect(Collectors.groupingBy(String::length)); // Collectors.groupingBy(Emp::getDept)
        System.out.println("collect1 = " + collect1);

        // lang: length    str.length() <==>  String::length  arr.map(Number)
        LinkedHashMap<String, Integer> mapx = list.stream().collect(Collectors.toMap(s -> s, String::length, (exist, newValue) -> exist + 1000, LinkedHashMap::new));
        System.out.println("mapx = " + mapx);

        int[] iarr = {3, 4, 5, 2, 1};
        int sum = Arrays.stream(iarr).sum();
        System.out.println("sum = " + sum);

        int sum1 = list.stream().mapToInt(String::length).sum();
        System.out.println("sum1 = " + sum1);
    }
}
