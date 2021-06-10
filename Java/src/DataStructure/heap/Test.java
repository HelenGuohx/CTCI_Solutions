package DataStructure.heap;

import javax.sound.midi.SysexMessage;
import java.util.Arrays;

/**
 * @author: haixuanguo
 * @date: 5/9/21 3:54 PM
 */
public class Test {
    public static void main(String[] args) {
        MaxHeap heap = new MaxHeap();

        heap.insert(2);
        heap.insert(3);
        heap.insert(1);
        heap.insert(8);

        System.out.println("heap size:" + heap.getSize());
        System.out.println("heap top: " + heap.top());

        System.out.println("heap pop: " + heap.pop());
        System.out.println("heap size:" + heap.getSize());

        int[] a = new int[]{1,2,8,0,5};
        MaxHeap.sort(a);
        System.out.println(Arrays.toString(a));

    }
}
