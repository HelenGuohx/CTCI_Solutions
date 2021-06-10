package Ch03_StackAndQueue.Q1_1_ThreeInOne;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * @author: haixuanguo
 * @date: 5/26/21 9:32 AM
 * each stack has equal size of n/3
 * assume stack stores integer
 */

class FullStackException extends Exception {
}

class MultiStack{
    private int numOfStacks = 3;
    private int stackCapacity;
    private int[] arr; //arr to store values
    private int[] sizes; //each stack size

    public MultiStack(int stackSize){
        stackCapacity = stackSize;
        arr = new int[stackCapacity * numOfStacks];
        sizes = new int[numOfStacks];
    }

    public void push(int stackNum, int val) throws FullStackException{
        if(isFull(stackNum)){
            throw new FullStackException();
        }
        int index = getTopIndex(stackNum);
        arr[++index] = val;
        sizes[stackNum]++;

    }

    public int pop(int stackNum){
        if(isEmpty(stackNum)){
            throw new EmptyStackException();
        }
        int index = getTopIndex(stackNum);
        int top = arr[index];
        arr[index] = 0;
        sizes[stackNum]--;
        return top;

    }

    public int peek(int stackNum){
        if(isEmpty(stackNum)){
            throw new EmptyStackException();
        }
        int index = getTopIndex(stackNum);
        return arr[index];
    }

    public String toString() {
        return "Stack1: " + Arrays.toString(getStack(0))
                + " Stack2: " + Arrays.toString(getStack(1))
                + " Stack3: " + Arrays.toString(getStack(2));
    }

    public boolean isEmpty(int stackNum){
        return sizes[stackNum] == 0;
    }

    public boolean isFull(int stackNum){
        return sizes[stackNum] == stackCapacity;
    }

    private int getTopIndex(int stackNum){
        int offset = stackNum * stackCapacity;
        return offset + sizes[stackNum] - 1;
    }

    private int[] getStack(int stackNum){
        if(isEmpty(stackNum)){
            return new int[]{};
        }
        return Arrays.copyOfRange(arr, stackNum * stackCapacity, getTopIndex(stackNum) + 1);
    }


}
public class Solution {
    public static void main(String[] args) throws FullStackException {
        MultiStack multistack = new MultiStack(5);
        try {
            multistack.push(0, 1);
            multistack.push(0, 2);
            multistack.push(0, 2);
            multistack.push(0, 2);
            multistack.push(0, 2);
            multistack.push(0, 2);

            multistack.push(1, 5);
            multistack.push(1, 3);
            multistack.push(1, 2);
            System.out.println(multistack.peek(1));
            multistack.pop(1);
            System.out.println(multistack.peek(1));


            multistack.push(2, 2);
            System.out.println(multistack.peek(2));
            multistack.pop(2);
            multistack.pop(2);

            System.out.println(multistack.toString());
        }
        catch(FullStackException ex){
        }


    }

}
