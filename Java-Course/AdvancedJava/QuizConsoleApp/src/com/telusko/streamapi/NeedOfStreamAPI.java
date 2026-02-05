package com.telusko.streamapi;

import java.util.Arrays;
import java.util.List;

public class NeedOfStreamAPI {
    private static Integer reduce;

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);
        // int sum = 0;
        // for (int n : nums) {
        // if (n % 2 == 0) {
        // n = n * 2;
        // sum += n;
        // }
        // }
        // System.out.println(sum);

        // for (int i = 0; i < nums.size(); i++) {
        // System.out.println(nums.get(i));
        // }

        nums.forEach(n -> System.out.print(n + " "));
        // int sumOfElements = nums.stream()
        // .filter(n -> n % 2 == 0)
        // .map(n -> n * 2)
        // .reduce(0, (n1, n2) -> n1 + n2);
        // System.out.println("Stream Output:" + sumOfElements);

    }
}
