package QuestionsFromOtherSources.Sorting;

/**
 * @author: haixuanguo
 * @date: 4/26/21 11:36 AM
 */
public class MergeSort {
    public void mergeSort(int[] nums, int start, int end, int[] temp){
        if(start >= end) return;

        mergeSort(nums, start, (start + end)/2, temp);
        mergeSort(nums, (start + end)/2 + 1, end, temp);
        merge(nums, start, end, temp);
    }
    public void merge(int[] nums, int start, int end, int[] temp){
        int middle = (start + end) / 2;
        int leftIndex = start;
        int rightIndex = middle + 1;
        int index = leftIndex;

        while(leftIndex <= middle && rightIndex <= end){
            if(nums[leftIndex] <= nums[rightIndex]){
                temp[index++] = nums[leftIndex++];
            }else{
                temp[index++] = nums[rightIndex++];
            }
        }
        while(leftIndex <= middle){
            temp[index++] = nums[leftIndex++];
        }
        while(rightIndex <= end){
            temp[index++] = nums[rightIndex++];
        }
        for(int i = start; i <= end; i++){
            nums[i] = temp[i];
        }
    }
}
