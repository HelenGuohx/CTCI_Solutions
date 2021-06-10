package Ch02_LinkedList.Q2_4_partition;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author: haixuanguo
 * @date: 5/26/21 9:03 AM
 */
public class PartitionTest {
    @Test
    public void test(){
        int[] inputs = new int[]{3, 5, 8, 5, 10, 2, 1};
        LinkList ll = new LinkList(inputs);

        SolutionTwo.partition(ll.head, 5);

        Assert.assertEquals(ll.toString(), "[3, 2, 1, 5, 8, 5, 10]");
    }

    @Test
    public void testStable(){
        int[] inputs = new int[]{3, 5, 8, 5, 10, 2, 1};
        LinkList ll = new LinkList(inputs);

        Solution.partition(ll.head, 5);

        Assert.assertEquals(ll.toString(), "[3, 2, 1, 5, 8, 5, 10]");
    }

    @Test
    public void testAllGreater(){
        int[] inputs = new int[]{7, 5, 8, 5, 10};
        LinkList ll = new LinkList(inputs);

        Solution.partition(ll.head, 5);

        Assert.assertEquals(ll.toString(), "[7, 5, 8, 5, 10]");
    }

    @Test
    public void testAllSmaller(){
        int[] inputs = new int[]{7, 5, 8, 5, 10};
        LinkList ll = new LinkList(inputs);

        Solution.partition(ll.head, 20);

        Assert.assertEquals(ll.toString(), "[7, 5, 8, 5, 10]");
    }
}
