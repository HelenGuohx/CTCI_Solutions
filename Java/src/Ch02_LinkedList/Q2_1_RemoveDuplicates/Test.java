package Ch02_LinkedList.Q2_1_RemoveDuplicates;

/**
 * @author: haixuanguo
 * @date: 4/21/21 11:13 PM
 */
public class Test {
    public static void main(String[] args) {
        int[] inputs = {1, 1, 1, 2, 2, 3};

        Node dummy = new Node(0);
        Node node = dummy;
        for(int val: inputs) {
            node.next = new Node(val);
            node = node.next;

        }
        System.out.println("Test SolutionOne");
        Node output = SolutionOne.removeDuplicate(dummy.next);

        while(output != null){
            System.out.println(output.val);
            output = output.next;
        }

        System.out.println("Test SolutionTwo");
        Node output2 = SolutionTwo.removeDuplicate(dummy.next);

        while(output2 != null){
            System.out.println(output2.val);
            output2 = output2.next;
        }
    }
}
