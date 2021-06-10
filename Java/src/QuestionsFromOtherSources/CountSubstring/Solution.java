package QuestionsFromOtherSources.CountSubstring;

/**
 * @author: haixuanguo
 * @date: 5/10/21 11:24 AM
 * when length of substring is 1, the number is n
 * when length of substring is 2, the number is n - 1
 * when length of substring is 3, the number is n - 2
 * ...
 * when length of substring is n, the number is 1
 * the total number of substring is 1 + 2 + ... + n - 1 + n = n * ( n + 1) / 2
 */

public class Solution {
    public static int countSubstring(String s){
        int n = s.length();
        return n * ( n + 1) / 2;
    }

    public static void main(String[] args) {
        System.out.println("" + countSubstring("abbd"));
    }
}
