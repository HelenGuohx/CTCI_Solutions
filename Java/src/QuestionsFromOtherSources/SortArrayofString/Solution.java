package QuestionsFromOtherSources.SortArrayofString;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author: haixuanguo
 * @date: 5/10/21 11:33 AM
 */
public class Solution {
    public static void sortArrayOfString(String[] arr){
        Arrays.sort(arr, new StringComparator());
    }

    public static void main(String[] args) {
        String[] arr = new String[]{"ef", "ef", "ac", "bb"};
        sortArrayOfString(arr);
        System.out.println(Arrays.toString(arr));
    }


}

class StringComparator implements Comparator<String> {
    public int compare(String s1, String s2){
        int i = 0;
        while(i < s1.length() && i < s2.length()){
            if(s1.charAt(i) != s2.charAt(i)){
                return s1.charAt(i) - s2.charAt(i);
            }
            i++;
        }
        if(i < s1.length()) return 1;
        if(i < s2.length()) return -1;
        return 0;
    }

}
