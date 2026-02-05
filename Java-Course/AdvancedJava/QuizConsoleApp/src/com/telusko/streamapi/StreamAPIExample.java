package com.telusko.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPIExample {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 5, 6, 7, 89);

        Stream<Integer> s1 = nums.stream();

        int sum = s1.filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .reduce(0, (n1, n2) -> n1 + n2);
    }
}
