package Ch03_StackAndQueue.Q1_1_ThreeInOne;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Stack;

/**
 * @author: haixuanguo
 * @date: 5/26/21 11:14 AM
 */
class DynamicMultiStack{
    class StackInfo{
        int start;
        int size;
        int capacity;

        StackInfo(int start, int capacity){
            this.start = start;
            this.capacity = capacity;
            this.size = 0;
        }

        public boolean isFull(){
            return size == capacity;
        }

        public boolean isEmpty(){
            return size == 0;
        }

        public int getLastElementIndex(){
            return adjustIndex(start + size - 1);
        }

        public int getLastCapacityIndex(){
            return adjustIndex(start + capacity - 1);
        }

        public boolean isWithinCapacity(int index){
            if(index < 0 || index >= arr.length){
                return false;
            }

            int index_ = index < start? index + arr.length: index;

            return start <= index && index < start + capacity;
        }


    }

    private int[] arr;
    private StackInfo[] stacks;

    public DynamicMultiStack(int numOfStack, int defaultSize){
        arr = new int[numOfStack * defaultSize];
        stacks = new StackInfo[numOfStack];
        for(int i = 0; i < numOfStack; i++){
            stacks[i] = new StackInfo(i * defaultSize, defaultSize);
        }
    }

    public void push(int stackNum, int val) throws FullStackException{
        if(allStacksFull()){
            throw new FullStackException();
        }
        StackInfo stack = stacks[stackNum];
        if(stack.isFull()){
            expand(stackNum);
        }
        stack.size++;
        arr[stack.getLastElementIndex()] = val;

    }

    public int pop(int stackNum){
        StackInfo stack = stacks[stackNum];

        if(stack.isEmpty()){
            throw new EmptyStackException();
        }
        int topIndex = stack.getLastElementIndex();
        int top = arr[topIndex];
        arr[topIndex] = 0;
        stack.size--;
        return top;
    }

    public int peek(int stackNum){
        StackInfo stack = stacks[stackNum];

        if(stack.isEmpty()){
            throw new EmptyStackException();
        }
        return arr[stack.getLastElementIndex()];
    }

    /*
    * all elements in the stack shift one position
    * capacity shrinks by 1
    * */
    private void shift(int stackNum){
        StackInfo stack = stacks[stackNum];

        if(stack.isFull()){
            expand(stackNum);
        }

        int index = stack.getLastCapacityIndex();
        while(stack.isWithinCapacity(index)){
            arr[index] = arr[previousIndex(index)];
            index = previousIndex(index);
        }

        arr[stack.start] = 0;
        stack.start = nextIndex(stack.start);
        stack.capacity--;
    }
    private void expand(int stackNum){
        shift((stackNum + 1) % stacks.length);
        stacks[stackNum].capacity++;
    }

    private boolean allStacksFull(){
        int size = 0;
        for(StackInfo stack: stacks){
            size += stack.size;
        }

        return size == arr.length;
    }


    private int adjustIndex(int index){
        int max = arr.length;
        return ((index % max) + max) % max;
    }
    private int nextIndex(int index){
        return adjustIndex(index + 1);
    }
    private int previousIndex(int index){
        return adjustIndex(index - 1);
    }

    public String toString(){
        return Arrays.toString(arr);
    }



}
public class SolutionTwo {
    public static void main(String[] args) throws FullStackException{
        DynamicMultiStack multistack = new DynamicMultiStack(3, 5);

        multistack.push(0, 1);
        multistack.push(0, 1);
        multistack.push(0, 1);

        multistack.push(1, 2);
        multistack.push(1, 2);
        multistack.push(1, 2);
        multistack.push(1, 2);

        multistack.push(2, 3);
        multistack.push(2, 3);
        multistack.push(2, 3);
        multistack.push(2, 3);

        System.out.println(multistack.toString());

        multistack.push(0, 1);
        multistack.push(0, 1);

        System.out.println(multistack.toString());

        multistack.push(0, 1);

        System.out.println(multistack.toString());

        multistack.push(0, 1);

        System.out.println(multistack.toString());






    }

}
