package QuestionsFromOtherSources.MergeSortedArray;

import java.util.Arrays;

/**
 * @author: haixuanguo
 * @date: 5/10/21 11:20 AM
 */
public class Test {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,3,6,9};
        int[] arr2 = new int[]{2,2,7,10,11,12};

        int[] arr = MergeSortedArray.mergeSortedArray(arr1,arr2);
        System.out.println(Arrays.toString(arr));

    }
}
