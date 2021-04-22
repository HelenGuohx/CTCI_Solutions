package Ch01_ArrayAndString.Q1_4_Palindrome_Permutation;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static boolean palindromePermutation(String s){
        Map<Character, Integer> charToCount = new HashMap<>();


        for(char c: s.toCharArray()){
            if(c == ' ') continue;
            charToCount.put(c, charToCount.getOrDefault(c, 0) + 1);
        }
        boolean existOdd = false;
        for(int value: charToCount.values()){
            if((value & 1) == 1){
                if(existOdd) return false;

                existOdd = true;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String[] inputs = {"code", "ccd", "taco cat"};
        for(String s: inputs){
            boolean output = palindromePermutation(s);
            System.out.println(output);
        }
    }
}
