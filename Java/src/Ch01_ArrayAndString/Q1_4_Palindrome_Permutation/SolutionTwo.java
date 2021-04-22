package Ch01_ArrayAndString.Q1_4_Palindrome_Permutation;

public class SolutionTwo {
    public static boolean palindromePermutation(String s){

        int[] occurs = new int[26];

        int oddCount = 0;
        for(char c: s.toCharArray()){
            if(c <= 'a' || c >= 'z') continue;

            occurs[c - 'a']++;

            if(occurs[c - 'a'] % 2 == 1){
                oddCount++;
            }else{
                oddCount--;
            }
        }

        return oddCount <= 1;
    }
    public static void main(String[] args) {
        String[] inputs = {"code", "ccd", "taco cat/?"};
        for(String s: inputs){
            boolean output = palindromePermutation(s);
            System.out.println(output);
        }
    }
}
