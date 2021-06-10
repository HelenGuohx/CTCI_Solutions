package Ch02_LinkedList.Q2_2_ReturnKthToLast;

/**
 * @author: haixuanguo
 * @date: 5/5/21 3:30 PM
 */

public class SolutionOne {
    public static Node returnKthLast(Node head, int k){ //1 -> 3 -> 2 -> 5, k = 4
        Node fast = head;//null
        Node slow = head; //1

        while(k-- > 0){
            if(fast == null) return null;
            fast = fast.next;
        }

        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }

        return slow;
    }
}
