package Ch02_LinkedList.Q2_4_partition;

/**
 * @author: haixuanguo
 * @date: 5/24/21 10:41 AM
 */
public class SolutionTwo {
    public static LinkNode partition(LinkNode head, int x){
        LinkNode dummy1 = new LinkNode(0);
        LinkNode dummy2 = new LinkNode(0);

        LinkNode tail1 = dummy1, tail2 = dummy2;
        LinkNode node = head;

        while(node != null){
            if(node.val < x){
                tail1.next = node;
                tail1 = tail1.next;
            }else{
                tail2.next = node;
                tail2 = tail2.next;
            }
            node = node.next;
        }

        tail1.next = dummy2.next;
        tail2.next = null;

        return dummy1.next;
    }

    public static void main(String[] args) {
//        int[] inputs = {3, 4, 8, 5, 10, 2, 1};
//        int[] inputs = {3, 4, 2, 1};
        int[] inputs = {8, 5, 10, 5};
        LinkList ll = new LinkList(inputs);

        System.out.println(ll.toString());

        partition(ll.head, 5);

        System.out.println(ll.toString());


    }
}
