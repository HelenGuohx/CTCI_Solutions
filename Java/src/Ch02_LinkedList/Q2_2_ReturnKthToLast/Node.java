package Ch02_LinkedList.Q2_2_ReturnKthToLast;

/**
 * @author: haixuanguo
 * @date: 5/5/21 3:54 PM
 */
public class Node {
    public int val;
    public Node next;

    public Node(int v){
        val = v;
    }

    @Override
    public String toString() {
        return "Node{" +
                "val=" + val +
                '}';
    }
}
