package Ch01_ArrayAndString.Q1_2_CheckPermutation;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {
    public static boolean checkPermutation(String s1, String s2){
        if(s1.length() != s2.length()) return false;

        Map<Character, Integer> charToCount = new HashMap<>();

        for(char c: s1.toCharArray()){
            if(charToCount.containsKey(c)){
                charToCount.put(c, charToCount.get(c) + 1);
            }else {
                charToCount.put(c, 1);
            }
        }

        for(char c: s2.toCharArray()){
            if(!charToCount.containsKey(c)) return false;

            charToCount.put(c, charToCount.get(c) - 1);
        }

        for(Integer value: charToCount.values()){
            if(value != 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String[][] inputs = {{"",""}, {"dfg", "fghg"}};
        boolean[] outputs = {true, false};
        for(int i = 0; i < inputs.length; i++){
            String s1 = inputs[i][0];
            String s2 = inputs[i][1];
            if(checkPermutation(s1, s2) != outputs[i]){
                System.out.println("Test Failure: " + s1 + "," + s2 );
            }else{
                System.out.println("Test Success");
            }

        }
    }
}
