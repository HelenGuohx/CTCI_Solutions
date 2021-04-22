package Ch01_ArrayAndString.Q1_5_One_Away;

/*
iterative
* */
public class SolutionTwo {
    public static boolean oneAway(String s1, String s2){
        if(Math.abs(s1.length() - s2.length()) > 1) return false;

        //maintain s1 longer than s2
        if(s1.length() < s2.length()){
            String temp = s2;
            s1 = s2;
            s2 = temp;
        }
        int index1 = 0;
        int index2 = 0;
        int editCount = 0;

        while(index1 < s1.length() && index2 < s2.length()){

            if(s1.charAt(index1) == s2.charAt(index2)){
                index1++;
                index2++;
            }else{
                editCount++;
                if(editCount > 1) return false;

                //replace
                if(s1.length() - index1 == s2.length() - index2){
                    index1++;
                    index2++;
                //insert or remove, move the index of longer string
                }else{
                    index1++;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String[] input1 = {"pale", "pales", "pales", "pale"};
        String[] input2 = {"ple", "pale", "bale", "bake"};

        for(int i = 0; i < input1.length; i++){
            System.out.println(input1[i] + "-" + input2[i] + ": " + oneAway(input1[i], input2[i]));
        }
    }
}
