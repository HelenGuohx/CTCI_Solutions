package Ch01_ArrayAndString.Q1_1_Is_Unique;


public class Solution1 {
    public static boolean isUnique(String s){
        if(s.length() > 128) return false;

        boolean[] visited = new boolean[128];

        for(char c: s.toCharArray()){
            if(visited[c - 'a']) return false;
            visited[c - 'a'] = true;
        }

        return true;
    }

    public static void main(String[] args){
        String[] inputs = {"abcd", "aabc", "abcdefghijkilmnopqistuvw", " .;'/"};
        boolean[] outputs = {true, false, false, true};
        for(int i = 0; i < inputs.length; i++) {
            assert isUnique(inputs[i]) == outputs[i];
        }
        System.out.println("Pass all tests");
    }
}
