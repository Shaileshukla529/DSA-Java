package DSA.Backtracking;

import java.util.*;

public class SubsetsArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int[] currentSubset = new int[nums.length]; // Buffer array
        List<List<Integer>> res = new ArrayList<>();

        printSubsets(res, 0, currentSubset, nums, 0);

        System.out.println("Total Subsets: " + res.size());
        for (List<Integer> subset : res) {
            System.out.println(subset);
        }
    }

    static void printSubsets(List<List<Integer>> res, int index, int[] currentSubset, int[] nums, int currentSize) {
        // Base Case
        if (index == nums.length) {
            List<Integer> validPart = new ArrayList<>();
            for (int i = 0; i < currentSize; i++) {
                validPart.add(currentSubset[i]);
            }
            res.add(validPart);
            return;
        }

        // PICK
        currentSubset[currentSize] = nums[index];
        printSubsets(res, index + 1, currentSubset, nums, currentSize + 1);

        // DON'T PICK
        printSubsets(res, index + 1, currentSubset, nums, currentSize);
    }
}
