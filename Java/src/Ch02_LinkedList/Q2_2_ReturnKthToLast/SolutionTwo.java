package Ch02_LinkedList.Q2_2_ReturnKthToLast;

/**
 * @author: haixuanguo
 * @date: 5/5/21 4:21 PM
 */
public class SolutionTwo {
    public static int counter;//1
    public static Node returnKthLast(Node head, int k) { //1 -> 3 -> 2 -> 5, k = 2
        if(head == null){
            counter = 0;
            return null;
        }
        Node node = returnKthLast(head.next, k);
        counter++;
        if(counter == k){
            return head;
        }
        return node;
    }
}
