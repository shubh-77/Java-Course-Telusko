package com.telusko.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachExample {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(2, 4, 5, 1, 12, 3, 5);

        Consumer consumer = (t) -> {
            System.out.println(t);

        };

        nums.forEach(consumer);

    }
}
