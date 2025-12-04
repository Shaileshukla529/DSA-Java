package DSA.Backtracking;

import java.util.*;

public class BinaryStringArray {

    static void printBinary(int n, int[] arr, int index, List<String> res) {
        // 1. BASE CASE: We reached the end of the array
        if (index == n) {
            // Convert the array to a String to save it
            String s = "";
            for (int num : arr) {
                s = s + num;
            }
            res.add(s);
            return;
        }

        // 2. RECURSIVE STEP: Try '0'
        arr[index] = 0;       // Set value
        printBinary(n, arr, index + 1, res); // Move to next index

        // 3. RECURSIVE STEP: Try '1'
        arr[index] = 1;       // Overwrite with 1
        printBinary(n, arr, index + 1, res); // Move to next index
    }

    public static void main(String[] args) {
        int n = 3;
        List<String> res = new ArrayList<>();
        int[] arr = new int[n]; // Create fixed-size array [0, 0, 0]

        printBinary(n, arr, 0, res);

        System.out.println(res);
    }
}