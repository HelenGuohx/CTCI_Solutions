package DataStructure.heap;

/**
 * @author: haixuanguo
 * @date: 5/9/21 2:58 PM
 */
public class MaxHeap {
    private int[] heap;
    private int size = 0;
    private int maxSize = 10;

    /*
    * maxHeap: parent is greater than or equal to its children
    * suppose root at index 0
    * given a node at index k, its parent at (k - 1) / 2
    * its left child at index 2k + 1, its right child at index 2k + 2
    * */

    //swap current value with its parent if parent is less than current value
    private static void siftup(int[] arr, int k){
        while(k > 0){
            int parent = (k - 1) / 2;

            //terminate when arr satisfies the heap characteristic
            if(arr[k] <= arr[parent]){
                break;
            }

            //otherwise, swap curr value with its parent, keep siftup
            int temp = arr[k];
            arr[k] = arr[parent];
            arr[parent] = temp;
            k = parent;
        }
    }

    //swap current value with the largest child.
    private static void siftdown(int[] arr, int k, int len){
        while(2 * k + 1 < len){
            int child = 2 * k + 1;

            if(2 * k + 2 < len && arr[2 * k + 1] < arr[2 * k + 2]){
                child = 2 * k + 2;
            }
            if(arr[k] >= arr[child]){
                break;
            }

            int temp = arr[k];
            arr[k] = arr[child];
            arr[child] = temp;
            k = child;
        }
    }
    //O(logn)
    public static void heapify(int[] arr){
        for(int i = arr.length - 2; i >= 0; i--){
            siftdown(arr, i, arr.length);
        }
    }

    //O(nlogn)
    public static void sort(int[] arr){
        heapify(arr);

        for(int i = arr.length - 1; i > 0; i--){
            int max = arr[0];
            arr[0] = arr[i];
            arr[i] = max;
            siftdown(arr, 0, i);
        }
    }



    public MaxHeap(){
        heap = new int[maxSize];
    }

    public MaxHeap(int maxSize){
        this.maxSize = maxSize;
        heap = new int[maxSize];
    }

    //add val to the end of heap and siftup
    public void insert(int val){
        if(size > maxSize) return;

        heap[size] = val;
        siftup(heap, size);
        size++;
    }
    //replace the root with the last value and remove last value, then siftdown
    public int pop(){
        if(size == 0) return 0;

        int max = heap[0];

        heap[0] = heap[size - 1];
        heap[size - 1] = 0;
        size--;
        siftdown(heap, 0, size);

        return max;
    }

    public int top(){
        if(size == 0) return 0;
        return heap[0];
    }

    public int getSize(){
        return this.size;
    }
}
