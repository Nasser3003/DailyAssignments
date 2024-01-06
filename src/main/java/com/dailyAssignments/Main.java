package com.dailyAssignments;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] input = {2,7,11,15,9,8,3,1};
        int target = 9;

        int[] improvedArray = removeBiggerThanTargetAndZeros(input, target);
        int[] result = findTarget(improvedArray, target, new ArrayList<>());
        System.out.println(Arrays.toString(result));

    }
    private static int[] findTarget(int[] input, int target, List<Integer> output) {
        // assuming each number can only be used once. (here im only using it with the first qualified int)
        // for an example if [1,4,5,5] if target is 9, the 4 will be used with the first 5, the second 5 will require another 4

        if (input.length == 0)
            return output.stream().mapToInt(Integer::intValue).toArray();

        int currNum = input[0];

        for (int i = 1; i < input.length; i++) {
            if (( currNum + input[i] ) > target || ( currNum + input[i] ) < target)
                continue;
            output.add(currNum);
            output.add(input[i]);
            output.add(0);
        }
        input = Arrays.copyOfRange(input, 1, input.length);
        return findTarget(input, target, output);
    }
    private static int[] removeBiggerThanTargetAndZeros(int[] input, int target) {
        List<Integer> output = new ArrayList<>(input.length);

        for (int i = 0; i < input.length; i++) {
            if (input[i] < target && input[i] != 0)
                output.add(input[i]);
        }
        return output.stream().mapToInt(Integer::intValue).toArray();
    }
}