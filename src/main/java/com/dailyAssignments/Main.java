package com.dailyAssignments;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] tens = new int[]{100, 90, 80, 70, 60, 50, 40, 30, 20, 10};

        System.out.println(containsLarger(tens, 50, 0)); // returns true
        System.out.println(containsLarger(tens, 50, 5)); // returns false

        System.out.println(sumEvens(tens, 1, 10)); // returns false


    }

    public static int sumEvens(int[] nums, int start, int end) {
        if (start == end)
            return 0;

        if (nums[start] % 2 == 0)
            return nums[start] + sumEvens(nums, start + 1, end);
        else
            return sumEvens(nums, start + 1, end);
    }

    // cant think of anyway to do it without changing the parameters
//    public static int sumEvens(int start, int end) {
//    }

    public static boolean containsLarger(int[] nums, int n, int fromIndex) {
        if (nums.length == 0)
            return false;

        nums = Arrays.copyOfRange(Arrays.copyOfRange(nums, 1, nums.length), fromIndex, nums.length);

        if (nums[0] > n)
            return true;

        return containsLarger(Arrays.copyOfRange(nums, 1, nums.length), n, 0);
    }
}
