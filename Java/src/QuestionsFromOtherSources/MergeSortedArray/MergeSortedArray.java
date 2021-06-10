package QuestionsFromOtherSources.MergeSortedArray;

/**
 * @author: haixuanguo
 * @date: 5/10/21 11:09 AM
 */
public class MergeSortedArray {
    public static int[] mergeSortedArray(int[] arr1, int[] arr2){
        int[] arr = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        int k = 0;
        while(i < arr1.length && j <= arr2.length){
            if(arr1[i] < arr2[j]){
                arr[k++] = arr1[i++];
            }else{
                arr[k++] = arr2[j++];
            }
        }

        while(i < arr1.length){
            arr[k++] = arr1[i++];
        }
        while(j < arr2.length){
            arr[k++] = arr2[j++];
        }
        return arr;
    }
}
