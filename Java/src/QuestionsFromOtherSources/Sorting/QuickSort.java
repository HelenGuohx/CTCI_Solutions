package QuestionsFromOtherSources.Sorting;


/**
 * @author: haixuanguo
 * @date: 4/26/21 11:29 AM
 */
public class QuickSort {
    public void quickSort(int[] nums, int start, int end){
        if(start >= end) return;

        int left = start;
        int right = end;
        int pivot = nums[(left + right)/2];
        while(left <= right){
            while(left <= right && nums[left] < pivot ){
                left++;
            }
            while(left <= right && nums[right] > pivot){
                right--;
            }
            if(left <= right){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }

        }

        quickSort(nums, start, right);
        quickSort(nums, left, end);
    }
}
