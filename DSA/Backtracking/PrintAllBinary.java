package DSA.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class PrintAllBinary {

    static void printBinary(int n, List<String> res, StringBuilder currentString) {
        if(currentString.length() == n){
            res.add(currentString.toString());
            return;
        }
        currentString.append("0");
        printBinary(n, res, currentString);
        currentString.deleteCharAt(currentString.length() - 1);

        currentString.append("1");
        printBinary(n, res, currentString);
        currentString.deleteCharAt(currentString.length() - 1);
    }

    public static void main(String[] args) {
        int n = 3; // Example: Length 3
        List<String> res = new ArrayList<>(); // The Master List
        
        // Call the function with an empty StringBuilder
        printBinary(n, res, new StringBuilder());
        
        // Print the result
        System.out.println(res);

    }
}
