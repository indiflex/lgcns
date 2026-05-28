package com.lgcns;

import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ExLambda {
    public static void main(String[] args) {
        List<Integer> ttlist = List.of(1, 10, 6, 3, 3, 5, 4, 2, 7, 7, 9, 8, 10);

        System.out.println("짝수의 개수");
        long countEven = ttlist.stream().filter(n -> n % 2 == 0).count();
        System.out.println("countEven = " + countEven);
        System.out.println("각 숫자를 제곱:" + ttlist.stream().map(n -> n * n).toList());
        System.out.println("중복 제거:" + ttlist.stream().distinct().toList());
        System.out.println("기본 정렬:" + ttlist.stream().sorted().toList());
        System.out.println("역순(내림차순) 정렬:" + ttlist.stream().sorted(Comparator.reverseOrder()).toList());
        System.out.println("처음 5개만 출력:" + ttlist.stream().limit(5).toList());
        System.out.println("처음 5개 건너뛰고 출력:" + ttlist.stream().skip(5).toList());
        System.out.println("값이 5보다 큰 것만 출력:" + ttlist.stream().filter(n -> n >= 5).toList());
        System.out.println("5보다 작은것 제거:" + ttlist.stream().sorted().dropWhile(n -> n < 5).toList());

//        IntStream range = IntStream.range(1, 11);
        IntStream range = IntStream.rangeClosed(1, 10);
//        System.out.println("Arrays.toString(range.toArray()) = " + Arrays.toString(range.toArray()));
        System.out.println("1~10의 합계:" + range.sum());

        System.out.println("random 5개의 평균:" + Stream.generate(Math::random).limit(5).mapToDouble(Double::doubleValue).average().orElseThrow());

    }
}
