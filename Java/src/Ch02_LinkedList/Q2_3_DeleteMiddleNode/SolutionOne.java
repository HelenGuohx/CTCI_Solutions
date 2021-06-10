package Ch02_LinkedList.Q2_3_DeleteMiddleNode;
import Ch02_LinkedList.Q2_2_ReturnKthToLast.Node;
/**
 * @author: haixuanguo
 * @date: 5/5/21 4:37 PM
 */
public class SolutionOne {
    public static void deleteMiddleNode(Node head){//a -> b -> c -> d -> e -> f
        Node fast = head; //null
        Node slow = new Node(0);
        slow.next = head; //c

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;

    }
}
