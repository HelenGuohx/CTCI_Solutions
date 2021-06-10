package Ch02_LinkedList.Q2_4_partition;


/**
 * @author: haixuanguo
 * @date: 5/24/21 9:29 AM
 */
class LinkNode{
    int val;
    LinkNode next;

    LinkNode(int v) {
        val = v;
    }
}

class LinkList{
    LinkNode head;

    LinkList(int[] inputs){
        LinkNode dummy = new LinkNode(0);
        LinkNode node = dummy;
        for(int val: inputs){
            node.next = new LinkNode(val);
            node = node.next;
        }
        head = dummy.next;
    }
    @Override
    public String toString(){
        LinkNode node = head;
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        while(node.next != null){
            sb.append(node.val).append(", ");
            node = node.next;
        }
        sb.append(node.val).append("]");
        return sb.toString();
    }
}
public class Solution {
    public static LinkNode partition(LinkNode head, int x){
        LinkNode p1 = head;
        LinkNode p2 = p1;

        while(p1 != null && p2 != null) {
            while (p1 != null && p1.val < x) {
                p1 = p1.next;
            }
            p2 = p1;
            while (p2 != null && p2.val >= x) {
                p2 = p2.next;
            }
            if(p1 != null && p2 != null) {
                int temp = p2.val;
                p2.val = p1.val;
                p1.val = temp;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        int[] inputs = new int[]{3, 5, 8, 5, 10, 2, 1};
        LinkList ll = new LinkList(inputs);

        System.out.println(ll.toString());

        partition(ll.head, 8);

        System.out.println(ll.toString());


    }
}
