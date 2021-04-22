package Ch02_LinkedList.Q2_1_RemoveDuplicates;

/**
 * without temporary buffer
 * @author: haixuanguo
 * @date: 4/21/21 11:09 PM
 */
public class SolutionTwo {
    public static Node removeDuplicate(Node head){
        if(head == null) return null;

        Node p1 = head;
        while(p1 != null){
            Node p2 = p1;
            while(p2.next != null){
                if(p1.val == p2.next.val) {
                    p2.next = p2.next.next;
                }
                p2 = p2.next;
            }
            p1 = p1.next;
        }

        return head;
    }
}
