package Ch02_LinkedList.Q2_2_ReturnKthToLast;


/**
 * @author: haixuanguo
 * @date: 5/5/21 3:53 PM
 */
public class Test {
    public static void main(String[] args) {
        int[] inputs = new int[]{1,3,2,5,0};
        Node head = new Node(inputs[0]);
        Node prev = head;
        for(int i = 1; i < inputs.length; i++){
            Node curr = new Node(inputs[i]);
            prev.next = curr;
            prev = curr;
        }
        prev.next = null;
        System.out.println("k = 1: " + SolutionTwo.returnKthLast(head, 1));
        System.out.println("k = 3: " + SolutionTwo.returnKthLast(head, 3));
        System.out.println("k = 10: " + SolutionTwo.returnKthLast(head, 10));


    }
}
