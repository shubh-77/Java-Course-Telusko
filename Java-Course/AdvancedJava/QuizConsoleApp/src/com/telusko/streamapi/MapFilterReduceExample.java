package com.telusko.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class MapFilterReduceExample {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);

        Predicate<Integer> predicate = (t) -> {
            return t % 2 == 0;
        };

        Function<Integer, Integer> function = (t) -> {

            return t * 2;
        };

        int sum = nums.stream().filter(predicate)
                .map(function)
                .reduce(0, (n1, n2) -> n1 + n2);

        nums.stream().filter(predicate)
                .map(function)
                .sorted().forEach(n -> System.out.println(n));

    }
}
