package Ch02_LinkedList.Q2_1_RemoveDuplicates;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: haixuanguo
 * @date: 4/21/21 10:34 PM
 */
class Node{
    int val;
    Node next;

    public Node(int val_){
        val = val_;
    }

    public Node(int val_, Node next_){
        val = val_;
        next = next_;
    }
}

public class SolutionOne {
    public static Node removeDuplicate(Node head){
        if(head == null) return null;

        Set<Integer> set = new HashSet<>();

        Node node = head;
        Node parent = new Node(0, head);

        while(node != null){
            if(set.contains(node.val)){
                parent.next = node.next;
            }else {
                set.add(node.val);
                parent = node;
            }
            node = parent.next;
        }

        return head;
    }

    public static void main(String[] args) {
        int[] inputs = {0,1,2,3,2,1};

        Node dummy = new Node(0);
        Node node = dummy;
        for(int val: inputs) {
            node.next = new Node(val);
            node = node.next;

        }
        Node output = removeDuplicate(dummy.next);

        while(output != null){
            System.out.println(output.val);
            output = output.next;
        }
    }
}
