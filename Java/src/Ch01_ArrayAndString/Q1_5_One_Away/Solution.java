package Ch01_ArrayAndString.Q1_5_One_Away;

/*
Recursion
* */
public class Solution {
    public static boolean oneAway(String s1, String s2){
        if(Math.abs(s1.length() - s2.length()) >= 2) return false;

        return editString(s1, s2, 0, 0, 0);
    }

    public static boolean editString(String s1, String s2, int index1, int index2, int editCount){//pale, pble, 2,2, 1
        if(editCount > 1) return false;

        if(index1 >= s1.length() || index2 >= s2.length()){
            return true;
        }

        if(s1.charAt(index1) == s2.charAt(index2)){
            return editString(s1, s2, index1 + 1, index2 + 1, editCount);
        }

        int len1 = s1.length() - index1;
        int len2 = s2.length() - index2;

        if(len1 == len2){
            return editString(s1, s2, index1 + 1, index2 + 1, editCount + 1);
        }else if(len1 < len2){
            return editString(s1, s2, index1, index2 + 1, editCount + 1);
        }else{
            return editString(s1, s2, index1 + 1, index2, editCount + 1);
        }

    }

    public static void main(String[] args) {
        String[] input1 = {"pale", "pales", "pale", "pale"};
        String[] input2 = {"ple", "pale", "bale", "bake"};

        for(int i = 0; i < input1.length; i++){
            System.out.println(input1[i] + "-" + input2[i] + ": " + oneAway(input1[i], input2[i]));
        }
    }
}
