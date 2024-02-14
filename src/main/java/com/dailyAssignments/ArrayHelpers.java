package com.dailyAssignments;

import java.util.Arrays;

public class ArrayHelpers {
    public static int findMin(int[] arr) {
        if (arr.length == 0) throw new IllegalArgumentException("Array cant be empty");
        return Arrays.stream(arr).reduce(Integer::min).getAsInt();
    }
}
